package org.javaiw.main;

import org.javaiw.model.JdbcDaoImpl;
import org.javaiw.model.Product;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
	//	BeanFactory context = new ClassPathXmlApplicationContext("spring.xml");
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl jdbcDaoImpl = (JdbcDaoImpl)context.getBean("jdbcDaoImpl");
		jdbcDaoImpl.show();
	//	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		context.registerShutdownHook();
//		Product p1 = (Product)context.getBean("product1");
//		Product p1 = (Product)context.getBean("product");
//		p1.setPname("AAAA");
//		System.out.println(p1);
		
		//	Product p2 = (Product)context.getBean("product2");
	//	System.out.println(p2);
	}
} 

/*
 * Bean factory vs application context:
 * Bean factory can get object to us whenever required
 * but application context keeps entire record of the entire lifetime
 * So we work with Application Context
 */