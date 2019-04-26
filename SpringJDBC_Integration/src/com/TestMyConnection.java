package com;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Book;
import com.service.BookService;

public class TestMyConnection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_connection.xml");
		/*MyConnection connection = (MyConnection) context.getBean("myConnection");
		connection.getConnection();*/
//		BookDAO bookDAO = (BookDAO) context.getBean("bookDAOImpl");
//		BookDAO bookDAOImpl = (BookDAO) context.getBean("bookDAO_JdbcTempateImpl");
		BookService service = (BookService) context.getBean("bookServiceImpl");
		Book book = new Book("Spring 5.0", new Random().nextInt(1000), "pub1", 9999.99, "tesing aop logging", "auth1");
		int rows = service.addBook(book);
		System.out.println((rows > 0) ? "record inserted" : "no record inserted");
		System.out.println( "Test Name-om"+ service.getClass().getName());
		int updatedRows = service.updateBook(890, 499.99);
		System.out.println((updatedRows > 0) ? "record updated" : "record not updated");
	}

}
