package org.javaiw.rest123.service;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myservice") //If path specified is myservice then come to this file
public class MyService {
	
	@GET //If request type is get then return following. In browser if we call something it is get request
    @Produces(MediaType.TEXT_PLAIN) //Return type is plain text
    public String getReply() {
        return "This is response from my first restful web services";
    }
	
	@GET
	@Path("/students") //We add additional path to deternmine which GET request type it is
	@Produces(MediaType.APPLICATION_JSON) //JSON is more readable format than xml.
	public ArrayList<Student> getStudents(){
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("Chloe", 834));
		list1.add(new Student("Zen", 244));
		list1.add(new Student("Barclay", 623));
		list1.add(new Student("Troy", 153));
		return list1;
	} 
	//Go to http://localhost:8085/rest123/javaiw/myservice/students
	//The output displayed is our webservice
	
}
