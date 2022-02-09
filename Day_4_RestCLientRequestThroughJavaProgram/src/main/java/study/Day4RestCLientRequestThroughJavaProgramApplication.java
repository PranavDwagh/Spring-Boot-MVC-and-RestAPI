package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Day4RestCLientRequestThroughJavaProgramApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Day4RestCLientRequestThroughJavaProgramApplication.class, args);
		
		RestTemplate rtemp = new RestTemplate();
		rtemp.postForLocation("http://localhost:8080/book/add/14/500/pranav3", null);
		String str = rtemp.getForObject("http://localhost:8080/book/getbook/pranav1", String.class);
		
		System.out.println(str);
	}

}
