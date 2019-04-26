package com.service;

import java.util.List;

import com.beans.Book;

public interface BookService {
	public int addBook(Book book);
	public int updateBook(long ISBN, double price);
	public boolean deleteBook(long ISBN);
	public Book getBook(long ISBN);
	public List<Book> getBooks();
}
