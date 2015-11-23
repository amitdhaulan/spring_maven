package spring.collections;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		String configFile = "Bean.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(
				configFile);

		BeanInjection beanInjection = (BeanInjection) context
				.getBean("beaninjection");
		List<address1> list = beanInjection.address1;
		System.out.println(list);

	}
}
