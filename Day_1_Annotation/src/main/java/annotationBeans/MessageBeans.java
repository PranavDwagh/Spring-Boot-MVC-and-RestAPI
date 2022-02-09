package annotationBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration("first")
/* @Scope("prototype") */
public class MessageBeans {

	private String message, sender;
	
	@Autowired
	private ContactDetail contactDetail;
	
	public MessageBeans()
	{
		this.setMessage("this is from MessageBeans constructor");
		this.setSender("this is message sender");
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

	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}
	
	
	
}
