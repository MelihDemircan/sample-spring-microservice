package com.melihdemircan.intercomm;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.melihdemircan.entity.Book;

@Component
public class BookFallback implements BookClient {

	protected Logger logger = Logger.getLogger(BookFallback.class.getName());

	@Override
	public List<Book> getBooks(Integer bookrackId) {
		logger.info(String.format("BookFallback.getBooks(%s)", bookrackId.intValue()));
		List<Book> acc = new ArrayList<Book>();
		return acc;
	}

}