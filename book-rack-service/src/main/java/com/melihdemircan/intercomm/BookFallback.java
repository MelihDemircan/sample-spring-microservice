package com.melihdemircan.intercomm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.melihdemircan.entity.Book;

@Component
public class BookFallback implements BookClient {

	@Override
	public List<Book> getBooks(Integer bookrackId) {
		List<Book> acc = new ArrayList<Book>();
		return acc;
	}

}
