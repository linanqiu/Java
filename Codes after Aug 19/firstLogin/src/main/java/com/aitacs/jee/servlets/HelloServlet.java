package com.aitacs.jee.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

@WebServlet(urlPatterns = { "/hellonew" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		System.out.println("entered the HelloServlet Constructor");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entered the doGet method of HelloServlet");

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("Name entered by you is " + name + " and password is " + password);

		String pout = "invalid login";

		// JDBC code to get all users from sql database and compare the data
		// entered by user
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return; // Add return
		}

		System.out.println("Driver loaded");

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			Statement st = con.createStatement(); // createStatement creates a
													// new statement object
			ResultSet rs = st.executeQuery("select * from userinfo");

			while (rs.next()) {
				String uname = rs.getString("uname");
				String upassword = rs.getString("upassword");
				// System.out.println(uname + " " + upassword); //prints all
				if (uname.equals(name) && upassword.equals(password)) {
					pout = "Login Successful! Welcome " + uname;
				}
			}

//			System.out.println(pout);
//			request.setAttribute("message", pout);

			rs.close(); // close the result set
			st.close(); // close the statement
			con.close(); // close the connection
		} catch (SQLException e) {
			e.printStackTrace();
		}

		PrintWriter pw = response.getWriter();
		pw.append(pout);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entered the doPost method");
		doGet(request, response);
	}

}
