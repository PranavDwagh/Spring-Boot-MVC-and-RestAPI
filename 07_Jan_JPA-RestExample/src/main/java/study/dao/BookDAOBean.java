package study.dao;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.BookEntity;

@Service
public class BookDAOBean {

	@Autowired
	MyRepository repo;
	
	public void addBook(int id,int cost,String name)
	{
		BookEntity be = new BookEntity(id,cost,name);
		repo.save(be);
	
	 }
	
	
	
	public List<BookEntity> getBooks()
	{
		/*
		 * Calendar cal = Calendar.getInstance(); cal.set(2022, 0, 7); java.util.Date
		 * date = cal.getTime(); java.sql.Date date2 =new
		 * java.sql.Date(cal.getTimeInMillis());
		 */
		
		return repo.findAll();
	}
	

	public List<BookEntity> getByBookCost(int c)
	{
		
		return repo.findByBookCost(c);
	}
	
	public List<BookEntity> getByBookCostLessThan(int c)
	{
		
		return repo.findByCostLessThan(c);
	}
	
	/*public BookEntity getBook()
	{
		Optional<BookEntity> be = repo.findById(1);
		
		 * if(be.isPresent()) return be.get();
		 * else return null;
		 * 
		 
		//return be.orElse(new BookEntity(120,3000,"dummy"));
		
		//be.orElseThrow();
		
		//be.ifPresentOrElse((b)->{System.out.println(b);}, ()->{/*if obj not present action to do */

}


