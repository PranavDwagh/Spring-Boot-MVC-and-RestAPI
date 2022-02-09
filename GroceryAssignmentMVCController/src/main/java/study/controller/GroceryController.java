package study.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.MyRepository;
import study.dao.GroceryDAO;
import study.entity.GroceryEntity;

@Controller
public class GroceryController {
	 
	@Autowired
	GroceryDAO dao;
	
	@PostMapping("/addproduct")
	public ModelAndView addProduct(@RequestParam int id, @RequestParam int cost, @RequestParam String name, @RequestParam String description, @RequestParam String unit, @RequestParam String date)
	{
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
		 Date date1= null;
		try {
			date1 = f1.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		ModelAndView mv = new ModelAndView();
		GroceryEntity gr = new GroceryEntity(id, name, cost, description, unit, date1);
		dao.addProduct(gr);
		
		mv.addObject("grocery", gr.getName());
		mv.setViewName("message");
		return mv;
	}
	
	//localhost:8080/welcome
	@GetMapping("/welcome")
	public String f1()
	{
		return "welcome";
	}
	
	@GetMapping("/begin")
	public String begin()
	{
		return "input";
	}
	
	//localhost:8080/update
	@GetMapping("/update")
	public String update()
	{
		return "update";
	}
	
	@GetMapping("/deleteproduct")
	public String delete()
	{
		return "delete";
	}
	
	@GetMapping("/showdetails")
	public String show()
	{
		return "showdetails";
	}
	
	@GetMapping("/showbyid")
	public String showByid(Model model, @RequestParam String id)
	{
		GroceryEntity obj = dao.getbyID(Integer.parseInt(id));
		 
		model.addAttribute("grocery", obj);
		
		return "showres";
		
	}
	
	  @GetMapping("/viewproduct") 
	  public ModelAndView viewProduct() {
		  
		  List<GroceryEntity> list = dao.getAllProduct();
		  
		  ModelAndView mv = new ModelAndView();
		  
		  mv.addObject("list", list);
		  mv.setViewName("display");
		  return mv;
		  
	  }
	  //session.seAttribute("list", booklist);
	  
	  @PostMapping("/updateproduct")
	  public String updateProduct(Model model, @RequestParam String id, @RequestParam String name)
	  {
		  GroceryEntity gr =  dao.update(id,name);
		  model.addAttribute("grocery", gr);
		  return "displaysingle";
	  }
	  
	  @PostMapping("/delete")
	  public String delete(Model model, @RequestParam String id)
	  {
		 GroceryEntity obj =  dao.delete(Integer.parseInt(id));
		  model.addAttribute("obj", obj.getName());
		  return "messagedelete";
	  }
	 
	
	
}
