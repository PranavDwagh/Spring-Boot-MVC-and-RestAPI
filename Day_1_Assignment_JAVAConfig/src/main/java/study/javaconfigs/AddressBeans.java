package study.javaconfigs;

public class AddressBeans {

	private String area, city;
	
	public AddressBeans()
	{
		System.out.println("this is address bean");
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
