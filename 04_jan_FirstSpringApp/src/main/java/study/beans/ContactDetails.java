package study.beans;

public class ContactDetails {
	private String phoneNumber,email;
	private AddressBean address;
	
	public ContactDetails() {
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
