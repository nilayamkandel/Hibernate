package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Product p = context.getBean("prod",Product.class);
		System.out.println(p);
			
		Student s=context.getBean("stud",Student.class);
		System.out.println(s);
	}
}

