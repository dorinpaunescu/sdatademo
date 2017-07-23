package dnp.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dnp.demo.nic.App;
import spring.demo.dnp.services.BeanForTest;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		BeanForTest bean = ctx.getBean(BeanForTest.class);
		bean.test();
		System.out.println("Hello World!");

	}

}
