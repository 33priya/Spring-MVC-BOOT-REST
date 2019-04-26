package com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.beans.Book;
import com.dao.BookDAO;

@Repository(value = "bookDAO_JdbcTempateImpl")
public class BookDAO_JdbcTempateImpl implements BookDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addBook(Book book) {
		String SQL_INSERT = "insert into book values(?,?,?,?,?,?)";
		int rows = jdbcTemplate.update(SQL_INSERT, 
				book.getBookName(), book.getISBN(), 
				book.getPublication(), book.getPrice(), 
				book.getDescription(), book.getAuthor());
		System.out.println("No of records inserted: " + rows);
		return rows;
	}

	@Override
	public int updateBook(long ISBN, double price) {
		String SQL_UPDATE = "update book set price = ? where ISBN = ?";
		int rows = jdbcTemplate.update(SQL_UPDATE, price, ISBN);
		return rows;
	}

	@Override
	public boolean deleteBook(long ISBN) {
		String SQL_DELETE = "delete from book where ISBN = ?";
		int rows = jdbcTemplate.update(SQL_DELETE, ISBN);
		return rows > 0;
	}

	@Override
	public Book getBook(long ISBN) {
		String SQL_SELECT = "select * from book where ISBN = ?";
		return null;
	}

	@Override
	public List<Book> getBooks() {
		String SQL_SELECT_ALL = "select * from book";
		return null;
	}

}
