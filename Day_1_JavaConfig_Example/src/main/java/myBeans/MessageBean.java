package myBeans;

public class MessageBean {

	private String message, sender;
	
	private ContactDetail contactDetail;

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

	
	  public ContactDetail getContactDetail() 
	  { 
		  return contactDetail;
	  }
	  
	  public void setContactDetail(ContactDetail contactDetail) 
	  {
	  this.contactDetail = contactDetail; 
	  }
	 
	
}
