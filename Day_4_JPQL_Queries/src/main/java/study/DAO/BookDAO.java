package study.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import study.MyRepositiory;
import study.entity.BookEntity;

@Service
public class BookDAO {

	@Autowired
	MyRepositiory rs;
	

	
	

	public List<BookEntity> getBookByName(String name) {
			
		return rs.findByBookName(name);

	}
	
	public void addBook(BookEntity bookEntity) {
		System.out.println("reached here");
		rs.save(bookEntity);
	}

	public List<BookEntity> getAll() {
		// TODO Auto-generated method stub
		return rs.findAll();
	}

	public List<BookEntity> getBookByCost(int cost) {
		
		return rs.findByBookCost(cost);
		
	}

	public List<BookEntity> getByCost(int cost) {
		// TODO Auto-generated method stub
		return rs.findBookCostLessThan(cost);
	}
	
	
	
	//Write functions
	
	
}
