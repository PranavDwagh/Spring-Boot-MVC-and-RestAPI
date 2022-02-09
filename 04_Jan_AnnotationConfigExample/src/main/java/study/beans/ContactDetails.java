package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactDetails {
	private String phoneNumber,email;
	
	@Autowired
	private AddressBean address;
	
	public ContactDetails() {
		this.setPhoneNumber("123456546");
		this.setEmail("test@iet");
		// TODO Auto-generated constructor stub
	}
	
	
	public AddressBean getAddress() {
		return address;
	}
	
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
