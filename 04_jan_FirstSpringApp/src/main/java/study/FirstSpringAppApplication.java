package study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.MessageBean;

public class FirstSpringAppApplication {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	MessageBean obj = (MessageBean) context.getBean("first");   
	System.out.println(obj.getMessage() +"   "+obj.getSender()+"  "+obj.getContactDetails().getPhoneNumber()+"  "+obj.getContactDetails().getAddress().getCity()+" "+obj.getContactDetails().getAddress().getPin());

	MessageBean obj2 = context.getBean("singletonEx",MessageBean.class);
	System.out.println(obj2.getMessage()+"  "+obj2.getSender());
	
	
	MessageBean obj3 = (MessageBean) context.getBean("singletonEx");
	System.out.println(obj+"   "+obj2+"   "+obj3);
	
	
	}

}
