package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlBeans.PersonBeans;

public class Person {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		PersonBeans obj = (PersonBeans) context.getBean("person");
		
		System.out.println(obj.getName());
		
	}

}
