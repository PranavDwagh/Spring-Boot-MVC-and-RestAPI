package day_1_beans;

public class MessageBeans {

	private String message,sender;
	
	private ContactDetail contactDetail;
	
	public MessageBeans()
	{
		System.out.println("message constructor");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public ContactDetail getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(ContactDetail contactdetails) {
		this.contactDetail = contactdetails;
	}
	
	
	
}
