package study.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	public FirstController()
	{
		System.out.println("Object of controller is now created");
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hi")
	public String add()
	{
		return "this is add method calling from web...this is get method and having url as hi";
	}
	
	
	
	
	

}
