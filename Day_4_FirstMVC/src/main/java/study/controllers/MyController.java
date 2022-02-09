package study.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	//@GetMapping("hi")
	@RequestMapping(method = RequestMethod.GET, path = "/hi")
	public String sayHello()
	{
		System.out.println("you reached in mycontroller");
		return "first";
	}

}
 