package study.javaconfigs;

public class CardBean {

	 private String aadhar;
	 private String pan;
	 private String passport;
	 
	 public CardBean()
	 {
		 System.out.println("Cards beans constructor");
	 }

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	 
	 
	
}

