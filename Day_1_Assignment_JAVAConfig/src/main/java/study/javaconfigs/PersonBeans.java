package study.javaconfigs;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonBeans {

	private String name;

	public PersonBeans()
	{
		System.out.println("this person bean constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
