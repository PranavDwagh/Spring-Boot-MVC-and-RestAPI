package study.beans;

public class MessageBean {
	
//Message Bean is dependent on String, String ,ContactDetails
	private String message,sender;
	private ContactDetails contactDetails;
	
	public MessageBean() {
		System.out.println("message bean constructor");
	}
	
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		System.out.println("message property setter");
		this.message = message;
	}
	
	public String getSender() {
		return sender;
	}
	
	public void setSender(String sender) {
		System.out.println("sender setter");
		this.sender = sender;
	}
	
	

}
