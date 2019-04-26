import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myBeans.MyClass;

public class Main_Annotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyClass myClass = (MyClass) context.getBean("obj");
		System.out.println(myClass);
	}

}
