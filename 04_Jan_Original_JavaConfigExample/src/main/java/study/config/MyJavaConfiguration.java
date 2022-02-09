package study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import study.beans.AddressBean;
import study.beans.ContactDetails;
import study.beans.MessageBean;

@Configuration
public class MyJavaConfiguration {
	
	@Bean("first")  // this is id
	@Scope("prototype") // this is scope
	public MessageBean func1()
	{
		MessageBean obj = new MessageBean();
		obj.setSender("prachi");
		obj.setMessage("Java config ex");
		obj.setContactDetails(func2()); // calling ContactDetails internally
		return obj;
	}
	
	
	@Bean("singletonEx") // this is id
	public MessageBean func4()
	{
		MessageBean obj = new MessageBean();
		obj.setSender("srinivas");
		obj.setMessage("solve examples");
		obj.setContactDetails(func2());
		
		return obj;
	}
	
	
	@Bean
	public ContactDetails func2()
	{
		ContactDetails obj = new ContactDetails();
		obj.setEmail("prachi@gmail");
		obj.setPhoneNumber("1234567788");
		obj.setAddress(func3());  // 	contactDetails calling address internally
		return obj;
	}
	
	@Bean
	public AddressBean func3()
	{
		AddressBean obj = new AddressBean();
		obj.setArea("kothrud");
		obj.setCity("pune");
		return obj;
		
	}
	
	
	

}
