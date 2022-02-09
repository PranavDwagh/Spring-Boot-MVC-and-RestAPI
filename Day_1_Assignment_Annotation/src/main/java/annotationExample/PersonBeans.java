package annotationExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("first")
@Scope("prototype")
public class PersonBeans {

	private String name;
	
	public PersonBeans()
	{
		this.setName("Pranav in Person bean constructor");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
