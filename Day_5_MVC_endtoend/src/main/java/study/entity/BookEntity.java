package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="BookMVC")
public class BookEntity {
	
	@Id
	private int id;
	@Column(name = "bookCost")
	private int cost;
	@Column(name="bookName")
	private String name;
	public BookEntity(int id, int cost, String name) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
	}
	public BookEntity() {
		super();
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
	
	
	

}
