package day_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day_1_beans.MessageBeans;

@SpringBootApplication
public class FirstSpringUsingXML {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("beans.xml");
		
		/*
		 * MessageBeans obj = (MessageBeans) contex.getBean("first");
		 * 
		 * System.out.println(obj.getMessage()+" "+obj.getSender()+" "+obj.
		 * getContactDetail().getEmail()+" "+obj.getContactDetail().getPhoneNumber());
		 */
		MessageBeans obj2 = (MessageBeans) contex.getBean("second");
		
		System.out.println(obj2.getMessage()+" "+obj2.getSender()+" "+obj2.getContactDetail().getEmail()+" "+obj2.getContactDetail().getPhoneNumber());
		
		MessageBeans obj3 = (MessageBeans) contex.getBean("second");
		
		System.out.println(obj3.getMessage()+" "+obj3.getSender()+" "+obj3.getContactDetail().getEmail()+" "+obj3.getContactDetail().getPhoneNumber());

		MessageBeans obj4 = (MessageBeans) contex.getBean("second");
		
		System.out.println(obj4.getMessage()+" "+obj4.getSender()+" "+obj4.getContactDetail().getEmail()+" "+obj4.getContactDetail().getPhoneNumber());
	}

}
