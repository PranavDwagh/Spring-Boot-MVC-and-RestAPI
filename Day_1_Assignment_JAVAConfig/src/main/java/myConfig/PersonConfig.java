package myConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import study.javaconfigs.AddressBeans;
import study.javaconfigs.CardBean;
import study.javaconfigs.PersonBeans;

@Component
public class PersonConfig {

	@Bean("person")
	@Scope("prototype")
	public PersonBeans fun1()
	{
		PersonBeans obj = new PersonBeans();
		obj.setName("pranav");
		return obj;
	}
	
	@Bean("address")
	@Scope("prototype")
	public AddressBeans fun2()
	{
		AddressBeans obj = new AddressBeans();
		obj.setArea("warkhed");
		obj.setCity("a'bad");
		return obj;
	}
	
	@Bean("card")
	@Scope("singleton")
	public CardBean fun3()
	{
		CardBean obj = new CardBean();
		obj.setAadhar("968578506841");
		obj.setPan("AGPPW8311D");
		obj.setPassport("PD0007896");
		return obj;
	}
	
	
}
