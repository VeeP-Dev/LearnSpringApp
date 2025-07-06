package com.bookapp.service;


import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.model.BookDto;

public interface IBookService {

	//CRUD
	void addBook(BookDto bookDto);
	void updateBook(BookDto bookDto);
	void deleteBook(int Id);
	
	
	List<BookDto> getAll() ;
	Book getById(int bookId) throws BookNotFoundException;
	List<BookDto> getByAuthor(String Author) throws BookNotFoundException;
}
