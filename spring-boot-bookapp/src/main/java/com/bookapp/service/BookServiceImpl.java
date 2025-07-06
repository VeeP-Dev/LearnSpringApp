package com.bookapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookUtil;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private BookUtil bookUtil;
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookUtil.showBooks();
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		List<Book> books = bookUtil.showBooks();
		Book bookObj = books.stream().filter(book->book.getBookId() == bookId).findFirst().orElseThrow(()-> new BookNotFoundException("Invalid Book Id"));
		return bookObj;
	}

	@Override
	public List<Book> getByAuthor(String Author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> books = bookUtil.showBooks();
		List<Book> bookByAuthor = books.stream().filter(book->book.getAuthor().equals(Author)).toList();
		if(bookByAuthor.isEmpty())
			throw new BookNotFoundException("Author not found");
		return bookByAuthor;
	}

	
}
