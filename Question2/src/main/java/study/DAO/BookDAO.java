package study.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.BookEntity;

@Service
public class BookDAO {

	@Autowired
	MyRepository rs;

	public List<String> getInlist() {
		
		List<String> list =  rs.findByBookName1();
		
		return list;
	}

	public void deleteBook(String name) {

		BookEntity obj = rs.findByBookName(name);
		
		if(obj!=null)
		{
			rs.delete(obj);
		}
		
	}
	
	
	
}
