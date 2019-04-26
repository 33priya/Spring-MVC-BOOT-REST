package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beans.Book;
import com.dao.BookDAO;
import com.service.BookService;

@Service(value = "bookServiceImpl")
public class BookServiceImpl implements BookService {

	@Autowired
	@Qualifier(value = "bookDAO_JdbcTempateImpl")
	private BookDAO bookDAO;
	
	@Override
	@Transactional(readOnly = true)
	public int addBook(Book book) {
		return bookDAO.addBook(book);
	}

	@Override
	@Transactional(readOnly = true)
	public int updateBook(long ISBN, double price) {
		return bookDAO.updateBook(ISBN, price);
	}

	@Override
	public boolean deleteBook(long ISBN) {
		return bookDAO.deleteBook(ISBN);
	}

	@Override
	public Book getBook(long ISBN) {
		return bookDAO.getBook(ISBN);
	}

	@Override
	public List<Book> getBooks() {
		return bookDAO.getBooks();
	}

}
