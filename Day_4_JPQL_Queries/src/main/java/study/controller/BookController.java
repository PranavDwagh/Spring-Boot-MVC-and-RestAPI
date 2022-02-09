package study.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.DAO.BookDAO;

import study.entity.BookEntity;


@RestController
@RequestMapping("book")
public class BookController {

	//this class act as servlet...this will collect values coming from HTTP
	
	@Autowired
	BookDAO dao;
	
	@GetMapping("costlessthan/{cost}")
	public List<BookEntity> getBycost(@PathVariable int cost)
	{
		return dao.getByCost(cost);
	}
	
	
	@GetMapping("getbycost/{cost}")
	public List<BookEntity> getBookByCost(@PathVariable int  cost)
	{
		return dao.getBookByCost(cost);
	}
	
	
	
	@GetMapping("getbook/{name}")
	public List<BookEntity> getBookByName(@PathVariable String name)
	{
		return dao.getBookByName(name);
	}
	
	@PostMapping("add/{id}/{cost}/{name}")
	public void addBook(@PathVariable int id, @PathVariable int cost, @PathVariable String name)
	{
		dao.addBook(new BookEntity(id, cost, name));
	}
	
	@GetMapping("getall")
	public List<BookEntity> getAll()
	{
		return dao.getAll();
	}
	
	
	
	
	
}
