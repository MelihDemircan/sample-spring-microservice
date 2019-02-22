package com.melihdemircan.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melihdemircan.entity.Book;

@RestController
public class BookRestController {

	private Map<Integer, Book> booksMap = new HashMap<>();

	@PostConstruct
	public void init() {
		booksMap.put(1, new Book("Spring Book"));
		booksMap.put(2, new Book("Spring Boot Book"));
	}

	@RequestMapping(value = "/all")
	public Collection<Book> getAll() {
		return booksMap.values();
	}

	@RequestMapping(value = "/{id}")
	public Book checkedOut(@PathVariable("id") Integer id) {
		return booksMap.get(id);
	}
}
