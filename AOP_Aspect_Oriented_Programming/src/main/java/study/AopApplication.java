package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(AopApplication.class, args);
		TestBean obj = context.getBean(TestBean.class);
		int sum = obj.add(10,20);
		
		System.out.println("sum="+ sum);
	}

}
