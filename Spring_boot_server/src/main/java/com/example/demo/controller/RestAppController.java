
package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;

@RestController
public class RestAppController {
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/findAll")
	public List<Book> getBooks(){
		return Stream.of(new Book(101,"gopro",200,"me"),new Book(102,"propp",210,"mine")).collect(Collectors.toList());
		
	}
}
