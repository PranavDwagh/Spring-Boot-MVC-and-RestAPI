package annotationBeans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	
	public Address()
	{
		System.out.println("address constructor");
		this.setCity("Warkhed");
		this.setCountry("india");
		this.setPincode("431109");
		this.setState("MH");
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
