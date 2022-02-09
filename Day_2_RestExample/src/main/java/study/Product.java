package study;

public class Product {
	
	private String productName;
	private String prodDesc;
	private double unitCost;
	
	public Product()
	{
		
	}
	
	public Product(String productName, String prodDesc, double unitCost) {
		super();
		this.productName = productName;
		this.prodDesc = prodDesc;
		this.unitCost = unitCost;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	
	
	
	

}
