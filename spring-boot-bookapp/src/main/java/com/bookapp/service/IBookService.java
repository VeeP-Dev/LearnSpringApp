package com.bookapp.service;


import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

	List<Book> getAll() ;
	Book getById(int bookId) throws BookNotFoundException;
	List<Book> getByAuthor(String Author) throws BookNotFoundException;
}
