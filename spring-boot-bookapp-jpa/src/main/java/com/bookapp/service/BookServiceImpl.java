package com.bookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.model.BookDto;

@Service
public class BookServiceImpl implements IBookService{

	@Override
	public void addBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookDto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> getByAuthor(String Author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
