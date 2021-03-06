package com.melihdemircan.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melihdemircan.entity.Book;
import com.melihdemircan.entity.BookRack;
import com.melihdemircan.intercomm.BookClient;

@RestController
public class BookRackRestController {

	@Autowired
	private BookClient bookClient;

	protected Logger logger = Logger.getLogger(BookRackRestController.class.getName());

	private List<BookRack> bookracks;

	@PostConstruct
	public void init() {
		logger.info(String.format("BookRack.init()"));
		bookracks = new ArrayList<>();
		bookracks.add(new BookRack(1, "Java Rack"));
		bookracks.add(new BookRack(2, "C# Rack"));
		bookracks.add(new BookRack(3, "Pyhton Rack"));
	}

	@RequestMapping("/bookracks")
	public List<BookRack> findAll() {
		logger.info("BookRack.findAll()");
		return bookracks;
	}

	@RequestMapping("/bookracks/{id}")
	public BookRack findById(@PathVariable("id") Integer id) {
		logger.info(String.format("BookRacks.findById(%s)", id));
		BookRack customer = bookracks.stream().filter(it -> it.getId().intValue() == id.intValue()).findFirst().get();
		List<Book> books = bookClient.getBooks(id);
		customer.setBookList(books);
		return customer;
	}
}