package study.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Maths {

	
	public Maths()
	{
		System.out.println("Maths called");
	}
	
	////http://localhost:8080/maths/sum?num1=10&num2=20
	@GetMapping("/add")
	public int add(@RequestParam ("num1") int n1, @RequestParam("num2") int n2)
	{
		return n1+n2;
	}
	
	
	@GetMapping("/mul")
	public int mul(@RequestParam int num1, @RequestParam int num2)  /// if request parameter and varable name is same then n need specify var name again
	{
		return num1*num2;
	}
	
	//http://localhost:8080/test/sub/40/30
	@GetMapping("sub/{num1}/{num2}")
	public int sub(@PathVariable int num1, @PathVariable("num2") int n2)
	{
		return num1-n2;
	}
	
	
	
}
