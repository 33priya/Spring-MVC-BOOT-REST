package com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Book;
import com.dao.BookDAO;

@Repository(value = "bookDAO_HibernateTemplateImpl")
public class BookDAO_HibernateTemplateImpl implements BookDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int addBook(Book book) {
		hibernateTemplate.save(book);
		return 1;
	}

	@Override
	public int updateBook(long ISBN, double price) {
		Book book = hibernateTemplate.get(Book.class, ISBN);
		hibernateTemplate.saveOrUpdate(book);
		return 1;
	}

	@Override
	public boolean deleteBook(long ISBN) {
		Book book = hibernateTemplate.get(Book.class, ISBN);
		hibernateTemplate.delete(book);
		return true;
	}

	@Override
	public Book getBook(long ISBN) {
		Book book = hibernateTemplate.get(Book.class, ISBN);
		return book;
	}

	@Override
	public List<Book> getBooks() {
		List<Book> books = hibernateTemplate.loadAll(Book.class);
		return books;
	}
	
}
