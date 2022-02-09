package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlBeans.AddressBean;

public class Address {
	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		
		AddressBean obj = (AddressBean) context.getBean("address");
		
		System.out.println(obj.getArea()+ "  "+obj.getCity());

	}
}
