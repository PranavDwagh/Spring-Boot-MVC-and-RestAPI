package study.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.GroceryEntity;


@Service
public class GroceryDAO {
	
	@Autowired
	MyRepository rs;
	
	/*
	 * public void addProduct(GroceryEntity gr) {
	 * 
	 * rs.save(gr); }
	 */

	public List<GroceryEntity> getAllProduct() {
		
		return rs.findAll();
		
	}

	public GroceryEntity update(String id, String name) {
		
		/*
		 * Optional<GroceryEntity> obj2 = rs.findById(Integer.parseInt(id));
		 * 
		 * GroceryEntity obj = obj2.get();
		 */
		
		GroceryEntity obj = rs.getById(Integer.parseInt(id));
		
		
		if(obj!=null)
		{
			obj.setName(name);
		}
//		session.save(asdf);
		rs.save(obj);
		return obj;
		
	}

	public GroceryEntity delete(int id) {
		
		GroceryEntity obj = rs.getById(id);
		if(obj!=null)
		rs.delete(obj);
		
		return obj;
	}

	public void addProduct(GroceryEntity gr) {
		rs.save(gr);
		
	}

	public GroceryEntity getbyID(int id) {
		
		GroceryEntity obj = rs.getById(id);
		
		return obj;
		
	}
	
	
	
}
