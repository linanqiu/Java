package org.javaiw.typecasting;

public class TCClass {

	public static void main(String[] args) {
		
		String str1="1";
		// int i = str; //This gives error that cannot convert string into integer type
		int j = Integer.parseInt(str1);  //parseInt function of Integer class is static.
		System.out.println(j);
		
		String str2="true";
		boolean b1;
		b1 = Boolean.parseBoolean(str2); //Every class has typecasting. 
		System.out.println(b1); 
		
	}
}