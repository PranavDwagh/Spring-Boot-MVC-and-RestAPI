package myconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import myBeans.Address;
import myBeans.ContactDetail;
import myBeans.MessageBean;

@Configuration
public class javaConfig {

	@Bean("first")
	@Scope("prototype")
	public MessageBean fun1()
	{
		MessageBean m1 = new MessageBean();
		m1.setMessage("here we go in java config");
		m1.setSender("this is sending from javaconfig");
		m1.setContactDetail(fun2());
		return m1;
	}


	

	@Bean("second")
	public MessageBean fun11() 
	{ 
	MessageBean m2 = new MessageBean(); 
	m2.setContactDetail(fun2());
	m2.setMessage("this is singleton funtion");
	m2.setSender("singleton sending from fun11"); 
	return m2; 
	}




	@Bean public ContactDetail fun2()
	{ 
	ContactDetail d = new ContactDetail();
	d.setEmail("Waghpranav222@gmail.com"); 
	d.setPhoneNo("8552968489");
	d.setAddress(fun3()); 
	return d; 
	}

	@Bean public Address fun3() 
	{
	Address a = new Address();
	a.setCity("aurangbad");
	a.setCountry("india"); 
	a.setPincode("431109");
	a.setState("MH"); 
	return a; 
	}



}
