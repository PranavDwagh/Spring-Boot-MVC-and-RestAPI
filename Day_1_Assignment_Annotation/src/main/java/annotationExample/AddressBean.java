package annotationExample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("singleton")
public class AddressBean {

	private String city;
	private String state;
	private String country;
	
	public AddressBean()
	{
		this.setCity("warkhed");
		this.setState("Maharastra");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
