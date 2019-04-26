
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Book;
import com.dao.impl.BookDAO_HibernateTemplateImpl;

public class TestMyConnection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_connection.xml");
		//BookDAO_SessionFactoryImpl bookDAOImpl = (BookDAO_SessionFactoryImpl) context.getBean("bookDAO_SessionFactoryImpl");
		
		BookDAO_HibernateTemplateImpl bookDAOImpl = (BookDAO_HibernateTemplateImpl) context.getBean("bookDAO_HibernateTemplateImpl");
		Book book = new Book("Spring 5.0", 5687L, "pub1", 3000.00d, "testing session factory", "auth1");
		int rows = bookDAOImpl.addBook(book);
		System.out.println((rows > 0) ? "record inserted" : "no record inserted");
	}

}
