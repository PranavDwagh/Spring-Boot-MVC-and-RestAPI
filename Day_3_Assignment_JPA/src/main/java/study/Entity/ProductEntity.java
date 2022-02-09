package study.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product_entity")
public class ProductEntity {
	
	@Id
	private int id;
	@Column(name="cost")
	private int cost;
	@Column(name="name")
	private String name;
	@Column(name="info")
	private String info;
	
	public ProductEntity(int id, int cost, String name, String info) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.info = info;
	}
	
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", cost=" + cost + ", name=" + name + ", info=" + info + "]";
	}
	
	
}
