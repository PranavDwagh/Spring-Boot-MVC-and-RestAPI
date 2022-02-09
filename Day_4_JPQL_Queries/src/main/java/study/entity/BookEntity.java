package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Book_Entity123")
public class BookEntity {
	
	@Id
	private int id;
	private int bookCost;
	private String bookName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return bookCost;
	}
	public void setCost(int cost) {
		this.bookCost = cost;
	}
	public String getName() {
		return bookName;
	}
	public void setName(String name) {
		this.bookName = name;
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", cost=" + bookCost + ", name=" + bookName + "]";
	}

	public BookEntity() {
		// TODO Auto-generated constructor stub
	}
	public BookEntity(int id, int bookCost, String bookName) {
		super();
		this.id = id;
		this.bookCost = bookCost;
		this.bookName = bookName;
	}
	
	
}
