package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"study", "study.controllers"})
public class MyRestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestExampleApplication.class, args);
	}

	
	
	
	
}
