package study.restController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.DAO.GroceryDAO;
import study.entity.GroceryEntity;


@RestController
@RequestMapping("grocery")
public class GroceryRestController {
	
	@Autowired
	GroceryDAO dao;
	
	@PostMapping("/add/{id}/{name}/{cost}/{description}/{unit}/{date1}")
	public void addGrocery(@PathVariable int id, @PathVariable String name, @PathVariable int cost, @PathVariable String description,@PathVariable String unit, @PathVariable String date1 )
	{
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date = f1.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GroceryEntity obj = new GroceryEntity(id, name, cost, description, unit, date);
		dao.addGrocery(obj);
	}
	@PostMapping("/add/insert") // JQ.html    // for postman send parameter through body-> raw in curly braces
	public void addGrocery1(@RequestBody GroceryEntity obj )
	{
		dao.addGrocery(obj);
		System.out.println(obj.getId());
	}
	
	@PostMapping("/update/{id}/{name}")
	public void updateGrocery(@PathVariable int id, @PathVariable String name)
	{
		dao.update(id,name);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		dao.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<GroceryEntity> getAll()
	{
		List<GroceryEntity> list =  dao.getAll();
		return list;
	}

	@GetMapping("/getbyid/{id}")
	public GroceryEntity showById(@PathVariable int id)
	{
		GroceryEntity obj = dao.getById(id);
		List<GroceryEntity> list = new ArrayList<GroceryEntity>();
		list.add(obj);
		//return list;
		return obj;
	}
	
	@GetMapping("getbyname/{name}")
	public List<GroceryEntity> getByname(@PathVariable String name)
	{
		List<GroceryEntity>list = dao.getByName(name);
		return list;
	}
	

}