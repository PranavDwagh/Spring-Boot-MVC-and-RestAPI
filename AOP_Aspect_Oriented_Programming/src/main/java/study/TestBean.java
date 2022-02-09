package study;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

	public int add(int a, int b)
	{
		System.out.println("addition");
		return a+b;
	}
	
	public int product(int a, int b)
	{
		System.out.println("multiplication");
		return a*b;
	}
}
