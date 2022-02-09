package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.DAO.ProductDAO;
import study.entity.ProductEntity;

@CrossOrigin  // this is necessary when request coming from different  server(other than 8080 ) otherwise we will COARS error 
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@PostMapping("/addProduct")
	public void insertProduct(@RequestBody ProductEntity obj)
	{
		dao.addProduct(obj);
	}
	
	@GetMapping("/getAllProduct")
	public List<ProductEntity> getAllProduct()
	{
		List<ProductEntity> list =  dao.getAll();
		return list;
	}
	
	@PostMapping("/updateProduct")
	public void updateProduct(@RequestBody ProductEntity obj)
	{
		dao.update(obj);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable String id)
	{
		dao.deleteProduct(Integer.parseInt(id));
	}
	
}
