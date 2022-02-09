package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotationBeans.MessageBeans;


public class Test_Annotation {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("annotationBeans");
		context.refresh();
		
		MessageBeans obj3 = (MessageBeans) context.getBean("first");
		
		System.out.println(obj3.getMessage()+"    "+obj3.getContactDetail().getEmail()+"  "+obj3.getContactDetail().getPhoneNo()+"  "+obj3.getContactDetail().getAddress().getPincode());
		
		MessageBeans obj = context.getBean(MessageBeans.class);
 		
		System.out.println(obj.getMessage()+"    "+obj.getContactDetail().getEmail()+"  "+obj.getContactDetail().getPhoneNo()+"  "+obj.getContactDetail().getAddress().getPincode());
	
		System.out.println(obj + "      "+obj3);
	
	
	}

}
