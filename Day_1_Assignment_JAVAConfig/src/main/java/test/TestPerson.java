package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.javaconfigs.AddressBeans;
import study.javaconfigs.CardBean;
import study.javaconfigs.PersonBeans;

public class TestPerson {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.PersonConfig.class);
		
		/*
		 * PersonBeans obj = (PersonBeans) context.getBean("person");
		 * 
		 * System.out.println(obj.getName());
		 */
		
		  AddressBeans object = (AddressBeans) context.getBean("address");
		  
		  System.out.println(object.getArea()+ "   "+object.getCity());
		 
		
		CardBean obj1 = (CardBean) context.getBean("card");
		
		System.out.println(obj1.getAadhar()+" "+obj1.getPan()+" "+obj1.getPassport());
		
		CardBean obj = (CardBean) context.getBean("card");
		System.out.println(obj.getAadhar()+" "+obj.getPan()+" "+obj.getPassport());
		
		
		System.out.println(obj1+ "    "+obj);
	}

}
