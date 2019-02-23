package com.melihdemircan.entity;

import java.util.List;

public class BookRack {

	private Integer id;
	private String name;
	private List<Book> bookList;

	public BookRack(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public BookRack(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

}
