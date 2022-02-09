package study.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.entity.BookEntity;
import study.repository.MyRepositiory;

@Service
public class BookDAO {

	@Autowired
	MyRepositiory rs;

	public void addBook(BookEntity obj) {
		
		rs.save(obj);
	}

	public List<BookEntity> getAllBook() {
		
		return rs.findAll();
		
	}

	
	
	
	
	
	
}
