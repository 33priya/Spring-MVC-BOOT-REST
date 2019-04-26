package com.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beans.Book;

@Controller
public class BookController {
	
	@Autowired
	private Validator validator;
	
	@InitBinder
	private void InitBinder(WebDataBinder webDataBinder) {
		webDataBinder.setValidator(validator);
	}
	
	/*@RequestMapping(value="/hello.htm")
	public String show() {
		System.out.println("method called");
		return "welcome.jsp";
	}
	
	@RequestMapping(value="/hello.htm")
	public ModelAndView show() {
		System.out.println("method called");
		String msg = "Welcome to Spring MVC";
		ModelAndView modelAndView = new ModelAndView("welcome", "message", msg);
		return modelAndView;
	}
	
	@GetMapping(value="/read.htm")
	public ModelAndView read(@RequestParam("username") String name, @RequestParam("password") String password, @RequestParam("age") Integer age) {
		System.out.println("method called: PASSWORD: " + password + " AGE: " + age);
		String msg = "Hello, " + name;
		ModelAndView modelAndView = new ModelAndView("welcome", "message", msg);
		return modelAndView;
	}
	
	@PostMapping(value="/book.htm")
	public ModelAndView readBookData(@RequestParam("bookName") String bookName, @RequestParam("isbn") long isbn,
			@RequestParam("publication") String publication, @RequestParam("price") double price,
			@RequestParam("description") String description, @RequestParam("author") String author) {
		Book book = new Book(bookName, isbn, publication, price, description, author);
		ModelAndView modelAndView = new ModelAndView("display", "book", book);
		return modelAndView;
	}*/
	
	@GetMapping("showForm.htm")
	public ModelAndView displayBookForm(ModelMap modelMap) {
		Book book = new Book();
		modelMap.addAttribute(book);
		ModelAndView modelAndView = new ModelAndView("newBookForm");
		return modelAndView;
	}

	//WAY - I - Using @Valid Annotation
	@PostMapping("addBook.htm")
	public ModelAndView addBook(@Valid@ModelAttribute Book book, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("newBookForm");
		}
		ModelAndView modelAndView = new ModelAndView("display", "book", book);
		return modelAndView;
	}
	
	//WAY - II - Using validator.validate(Object, BindingResult)
	/*@PostMapping("addBook.htm")
	public ModelAndView addBook(@ModelAttribute Book book, BindingResult bindingResult) {
		validator.validate(book, bindingResult);
		if (bindingResult.hasErrors()) {
			return new ModelAndView("newBookForm");
		}
		ModelAndView modelAndView = new ModelAndView("display", "book", book);
		return modelAndView;
	}*/
	
	@ModelAttribute("priceList")
	public List<Double> addPrices() {
		List<Double> prices = new ArrayList<>();
		prices.add(999.99);
		prices.add(499.50);
		prices.add(399.50);
		prices.add(800.99);
		prices.add(700.50);
		prices.add(600.50);
		return prices;
	}
	
}
