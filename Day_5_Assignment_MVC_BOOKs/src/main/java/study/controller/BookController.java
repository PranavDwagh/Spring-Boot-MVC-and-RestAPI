package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.dao.BookDAO;

@Controller
public class BookController {
	
	@Autowired
	BookDAO dao; 
	
	@GetMapping("/getindropdown")
	public ModelAndView getdropdown()
	{
		List<Integer> list =  dao.getIndropDown();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list", list);
		mv.setViewName("showDropdown");
		return mv;
	}
	
	@PostMapping("/delete")
	public ModelAndView delete(@RequestParam int dropdown)
	{
		dao.delete(dropdown);
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "object deleted");
		mv.setViewName("deleteMsg");
		return mv;
	}

}
