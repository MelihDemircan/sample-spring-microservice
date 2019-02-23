package com.melihdemircan.entity;

public class Book {

	private Integer id;
	private String name;
	private Integer bookRackId;

	public Book(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Book(Integer id, Integer bookRackId, String name) {
		this.id = id;
		this.bookRackId = bookRackId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBookRackId() {
		return bookRackId;
	}

	public void setBookRackId(Integer bookRackId) {
		this.bookRackId = bookRackId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
