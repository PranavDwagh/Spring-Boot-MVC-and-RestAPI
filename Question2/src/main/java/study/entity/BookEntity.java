package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="book")
public class BookEntity {
	
	@Id
	@Column(name="book_id")
	private int id;
	@Column(name="book_cost")
	private int bookCost;
	@Column(name="book_name")
	private String bookName;

	
	public BookEntity() {
		// TODO Auto-generated constructor stub
	}

	public BookEntity(int id, int bookCost, String bookName) {
		this.id = id;
		this.bookCost = bookCost;
		this.bookName = bookName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getBookCost() {
		return bookCost;
	}


	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", bookCost=" + bookCost + ", bookName=" + bookName + "]";
	}
	
	
	
	
}
