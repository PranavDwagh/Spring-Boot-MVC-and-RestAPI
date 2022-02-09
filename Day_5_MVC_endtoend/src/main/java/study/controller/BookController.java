package study.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.DAO.BookDAO;
import study.entity.BookEntity;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@GetMapping("/getcount")
	public ModelAndView getSessionCount(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		int count = 1;
		
		if(session.isNew())
		{
			session.setAttribute("count", count);
		}
		else
		{
			count = (int) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		
		mv.addObject("count", count);
		mv.setViewName("sessioncount");
		return mv;
	}
	
	@PostMapping("/addbook")
	public String addBook(Model model,   @RequestParam String id, @RequestParam String cost, @RequestParam String name)
	{
		BookEntity obj = new BookEntity(Integer.parseInt(id),Integer.parseInt(cost), name);
		dao.addBook(obj);
		model.addAttribute("bookname", obj);
		return "index";
	}
	
	@GetMapping("/getall")
	public ModelAndView getAllBook()
	{
		List<BookEntity> list = dao.getAllBook();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("GetAllBooks");
		return mv;
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "test";
	}
	
	
	
	
}
