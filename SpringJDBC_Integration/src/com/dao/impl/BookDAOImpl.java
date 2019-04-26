package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beans.Book;
import com.dao.BookDAO;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private DataSource dataSource;

	@Override
	public int addBook(Book book) {
		String SQL_INSERT = "insert into book values(?,?,?,?,?,?)";
		int rows = 0;
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1,  book.getBookName());
			preparedStatement.setLong(2,  book.getISBN());
			preparedStatement.setString(3,  book.getPublication());
			preparedStatement.setDouble(4,  book.getPrice());
			preparedStatement.setString(5,  book.getDescription());
			preparedStatement.setString(6,  book.getAuthor());
			rows = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	@Override
	public int updateBook(long ISBN, double price) {
		String SQL_DELETE = "update book set price = " + price + " where ISBN = " + ISBN;
		return 0;
	}

	@Override
	public boolean deleteBook(long ISBN) {
		String SQL_DELETE = "delete from book where ISBN = ?" + ISBN;
		return true;
	}

	@Override
	public Book getBook(long ISBN) {
		String SQL_SELECT = "select * from book where ISBN = " + ISBN;
		return null;
	}

	@Override
	public List<Book> getBooks() {
		String SQL_SELECT_ALL = "select * from book";
		return null;
	}

}
