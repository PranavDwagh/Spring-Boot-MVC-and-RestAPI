package annotationExample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cards")
@Scope("prototype")
public class CardBeans {

	private String addhar;
	private String pan;
	
	public CardBeans()
	{
		this.setPan("AGPPW8311D");
		this.setAddhar("968578506841");
	}

	public String getAddhar() {
		return addhar;
	}

	public void setAddhar(String addhar) {
		this.addhar = addhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}
	
	
	
}
