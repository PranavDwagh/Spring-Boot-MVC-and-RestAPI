package study.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepositiory;
import study.entity.GroceryEntity;

@Service
public class GroceryDAO {

	@Autowired
	MyRepositiory rs;

	public void addGrocery(GroceryEntity obj) {
		
		System.out.println(obj);
		rs.save(obj);
	}

	public void update(int id, String name) {

		GroceryEntity obj =  rs.getById(id);
		if(obj!=null)
		{
			obj.setName((name));
		}
		rs.save(obj);
	}

	public void delete(int id) {
		
		GroceryEntity obj =  rs.getById(id);
		
		if(obj!=null)
		{
			rs.delete(obj);
		}
	}

	public List<GroceryEntity> getAll() {
		
		return rs.findAll();
		
	}

	public GroceryEntity getById(int id) {
		
		GroceryEntity obj =  rs.findById(id).get();
		return obj;
	}

	public List<GroceryEntity> getByName(String name) {
		
		return rs.findByName(name);
	}

	
}
