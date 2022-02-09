package study.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("method")
public class AllMethodController {

	
	@GetMapping("/get")
	public String getit()
	{
		System.out.println("Get called");
		return "get always returns";
	}
	
	@PostMapping("/post")
	public void postit()
	{
		System.out.println("post called");
		
	}
	
	@PutMapping("/put")
	public void putit()
	{
		System.out.println("put called");
	
	}
	
	@DeleteMapping("/delete")
	public void deleteit()
	{
		System.out.println("delete called");
	}
	
}
