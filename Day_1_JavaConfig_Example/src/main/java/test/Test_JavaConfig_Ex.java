package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import myBeans.MessageBean;
import myconfig.javaConfig;

@SpringBootApplication
public class Test_JavaConfig_Ex {

	public static void main(String[] args) {
	

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myconfig.javaConfig.class);
		
		MessageBean obj2 = (MessageBean) context.getBean("first");
		
		System.out.println(obj2.getMessage()+" "+obj2.getSender()+" "+obj2.getContactDetail().getEmail()+" "+obj2.getContactDetail().getAddress().getCity() );
		
		
		  MessageBean obj3 =(MessageBean) context.getBean("first");
		  System.out.println(obj3.getMessage()+" "+obj3.getSender()+" "+obj3.getContactDetail().getEmail()+" "+obj3.getContactDetail().getAddress().getCity() );
		  
		  MessageBean obj = (MessageBean) context.getBean("second");
		  System.out.println(obj.getMessage()+" "+obj.getSender()+" "+obj.getContactDetail().getEmail()+" "+obj.getContactDetail().getAddress().getCity() );
		  
		  MessageBean obj4 = (MessageBean) context.getBean("second");
		  
		  System.out.println(obj4.getMessage()+" "+obj4.getSender()+" "+obj4.getContactDetail().getEmail()+" "+obj4.getContactDetail().getAddress().getCity() );
		  
		  System.out.println(obj2+ "        "+ obj3+"          "+obj+"    "+obj4);
		 
		 
		
	}

}
