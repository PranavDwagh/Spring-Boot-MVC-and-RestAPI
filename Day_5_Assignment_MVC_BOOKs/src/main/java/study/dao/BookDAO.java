package study.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import study.MyRepository;
import study.entity.BookEntity;

@Component
public class BookDAO {

	@Autowired
	MyRepository rs;

	public List<Integer> getIndropDown() {
		
		return rs.getId();
		
	}

	public void delete(int dropdown) {

		 BookEntity obj =  rs.findById(dropdown).get();
		 //BookEntity obj2 = rs.getById(dropdown);
		
		 rs.delete(obj);
	}
	
}
