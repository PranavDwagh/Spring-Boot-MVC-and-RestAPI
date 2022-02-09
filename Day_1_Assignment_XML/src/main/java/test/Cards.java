package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlBeans.CardBean;

public class Cards {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		CardBean obj = (CardBean)context.getBean("card");
		
		System.out.println(obj.getAadhar()+" "+obj.getPassport()+" "+obj.getPan());
		
	}
}
