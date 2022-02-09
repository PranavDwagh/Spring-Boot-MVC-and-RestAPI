package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotationExample.AddressBean;
import annotationExample.CardBeans;
import annotationExample.PersonBeans;

public class TestAnnotation {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("annotationExample");
		context.refresh();
		
		/* 
		 * PersonBeans obj = (PersonBeans) context.getBean("first");
		 * 
		 * System.out.println(obj.getName());
		 * 
		 * obj.setName("don");
		 * 
		 * System.out.println(obj.getName());
		 */
		
		/*
		 * CardBeans obj1 = (CardBeans) context.getBean("cards");
		 * 
		 * System.out.println(obj1.getAddhar()+"   "+obj1.getPan());
		 */
		
		AddressBean obj3 = (AddressBean) context.getBean("address");
		
		System.out.println(obj3.getCity()+"  "+obj3.getState());
		
	}
}
