<%@ page import="java.util.*"%>

<html>
<body>

	<!-- Step1: Create the HTML form -->
	<form action="todo-demo.jsp">
		Add new item: <input type="text" name="theItem" /> 
		<input type="submit" value="Submit" />
	</form>

	<!-- Step2: Add new item to "To Do" list -->
	<%
		//get the TO DO items from the session
		List<String> items = (List<String>) session.getAttribute("myToDoList");

		//if the TO DO item doesn't exist, then create a new one
		if (items == null) {
			items = new ArrayList<String>();
			session.setAttribute("myToDoList", items);
		}

		// see if the  is form data to add
		String theItem = request.getParameter("theItem");
		if (theItem != null && (!theItem.trim().equals(""))) {
			items.add(theItem);
		}
	%>

	<!-- Step3: Display all "To Do" item from session -->
	<hr>
	<b>To List Items:</b>

	<ol>
		<%
			for (String temp : items) {
				out.println("<li>" + temp + "</li>");
			}
		%>
	</ol>

</body>
</html>