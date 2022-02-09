package study.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.DAO.ProductDAO;
import study.Entity.ProductEntity;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	public ProductDAO dao;
	
	@PostMapping("add/{id}/{cost}/{name}/{info}")
	public void addProduct(@PathVariable int id, @PathVariable int cost, @PathVariable String name, @PathVariable String info)
	{
		dao.addProduct(new ProductEntity(id, cost, name, info));
	}
	
	@GetMapping("showproduct/{id}")
	public Optional<ProductEntity> showProduct(@PathVariable int id)
	{
		return dao.showProduct(id);
	}
	
	@GetMapping("showall")
	public List<ProductEntity> showAll()
	{
		return dao.showall();
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id)
	{
		dao.deleteProduct(id);
	}
	
	  @PostMapping("update/{id}/{name}") 
	  public void update(@PathVariable int id,@PathVariable String name) 
	  { 
		  dao.update(id,name); 
	  }
	 
	
}
