package study.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Product")
public class ProductEntity {
	
	@Id
	@GeneratedValue
	@Column(name="prodId")
	private int prodId;
	@Column(name="prodName")
	private String prodName;
	@Column(name="prodDesc")
	private String prodDesc;
	@Column(name="prodCost")
	private String prodCost;
	@Column(name="expiryDate")
	private Date expiryDate;
	
	public ProductEntity(int prodId, String prodName, String prodDesc, String prodCost, Date expiryDate) {
		
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodCost = prodCost;
		this.expiryDate = expiryDate;
	}

	public ProductEntity() {
	//
	}

	@Override
	public String toString() {
		return "ProductEntity [prodId=" + prodId + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", prodCost="
				+ prodCost + ", expiryDate=" + expiryDate + "]";
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getProdCost() {
		return prodCost;
	}

	public void setProdCost(String prodCost) {
		this.prodCost = prodCost;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
	
	

}
