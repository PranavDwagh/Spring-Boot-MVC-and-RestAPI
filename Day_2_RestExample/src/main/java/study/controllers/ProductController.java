package study.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.Product;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@GetMapping("/show")
	public Product getProduct()
	{
		Product obj = new Product("cheese", "slice", 200);
		return obj;
	}
	@GetMapping("/showAll")
	public ArrayList<Product> getAllProducts()
	{
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product("cake", "weet", 10));
		al.add(new Product("cake1", "sweet", 10));
		al.add(new Product("cake2", "sweet", 10));
		al.add(new Product("cake3", "sweet", 10));
		al.add(new Product("cake4", "sweet", 10));
		return al;
	}
	
	
}
