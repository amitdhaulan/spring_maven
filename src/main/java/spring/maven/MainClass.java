package spring.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Bean.xml");

		/*HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		System.out.println("Your Message: " + helloWorld.getMessage1());*/

		HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
		helloIndia.getMessage1();
		helloIndia.getMessage2();
		helloIndia.getMessage3();
		((AbstractApplicationContext) context).registerShutdownHook();

	}
}
