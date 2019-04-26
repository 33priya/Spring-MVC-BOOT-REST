import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myBeans.MyBean;
import com.myBeans.MyData;

public class Main_BeansLifecycle {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_lifecycle.xml");
		/*MyData myData = (MyData) context.getBean("myData");
		myData.display();*/
		
		
		MyBean myBean = (MyBean) context.getBean("myBean");
		myBean.display();
		
		//((AbstractApplicationContext) context).registerShutdownHook();
	}

}
