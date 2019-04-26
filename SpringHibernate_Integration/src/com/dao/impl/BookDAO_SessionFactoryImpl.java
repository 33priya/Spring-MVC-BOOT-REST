package com.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Book;
import com.dao.BookDAO;

@Repository(value = "bookDAO_SessionFactoryImpl")
public class BookDAO_SessionFactoryImpl implements BookDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int addBook(Book book) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
		return 1;
	}

	@Override
	public int updateBook(long ISBN, double price) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Book book = session.get(Book.class, ISBN);
		session.saveOrUpdate(book);
		transaction.commit();
		session.close();
		return 1;
	}

	@Override
	public boolean deleteBook(long ISBN) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Book book = session.get(Book.class, ISBN);
		session.delete(book);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public Book getBook(long ISBN) {
		Session session = sessionFactory.openSession();
		Book book = session.get(Book.class, ISBN);
		session.close();
		return book;
	}

	@Override
	public List<Book> getBooks() {
		/*Session session = sessionFactory.openSession();
		Query<Book> query = session.createQuery("from book_hib");
		Book book = query.list();
		session.close();*/
		return null;
	}
	
}
