package com.melihdemircan.intercomm;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.melihdemircan.entity.Book;

@FeignClient(value = "book-service", fallback = BookFallback.class)
public interface BookClient {

	@RequestMapping(method = RequestMethod.GET, value = "/book/bookrack/{bookrackId}")
	List<Book> getBooks(@PathVariable("bookrackId") Integer bookrackId);

}
