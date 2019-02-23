package com.melihdemircan.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melihdemircan.entity.Book;

@RestController
public class BookRestController {

	private List<Book> accounts;

	protected Logger logger = Logger.getLogger(BookRestController.class.getName());

	public BookRestController() {
		accounts = new ArrayList<>();
		accounts.add(new Book(1, 1, "Java One"));
		accounts.add(new Book(2, 2, "222222"));
		accounts.add(new Book(3, 3, "333333"));
	}

	@RequestMapping("/book/{id}")
	public Book findByNumber(@PathVariable("id") Integer id) {
		logger.info(String.format("Account.findByNumber(%s)", id));
		return accounts.stream().filter(it -> it.getId().intValue() == id).findFirst().get();
	}

	@RequestMapping("/book/bookrack/{bookrackId}")
	public List<Book> findByCustomer(@PathVariable("bookrackId") Integer bookrackId) {
		logger.info(String.format("Book.findByBookrack(%s)", bookrackId));
		return accounts.stream().filter(it -> it.getBookRackId().intValue() == bookrackId.intValue())
				.collect(Collectors.toList());
	}

	@RequestMapping("/book")
	public List<Book> findAll() {
		logger.info("Book.findAll()");
		return accounts;
	}
}
