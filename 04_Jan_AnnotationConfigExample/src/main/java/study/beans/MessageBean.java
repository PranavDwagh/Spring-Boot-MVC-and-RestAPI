package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("first")
 @Scope("prototype") 
public class MessageBean {
	
//Message Bean is dependent on String, String ,ContactDetails
	private String message,sender;
	
	@Autowired
	private ContactDetails contactDetails;
	
	public MessageBean() {
		
		this.setMessage("annotation is simple but limited");
		this.setSender("abcd");
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
