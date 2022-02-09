package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.DAO.BookDAO;
import study.entity.BookEntity;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@GetMapping("/getNames")
	public ModelAndView getInlist()
	{
		List<String> list = dao.getInlist();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("input");
		return mv;
	}
	
	@PostMapping("/delete")
	public ModelAndView delete(@RequestParam String name)
	{
		dao.deleteBook(name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "object deleted");
		mv.setViewName("deleteMsg");
		return mv;
	}
	
	
	
}
