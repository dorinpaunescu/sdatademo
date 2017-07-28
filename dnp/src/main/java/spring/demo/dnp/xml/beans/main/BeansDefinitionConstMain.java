package spring.demo.dnp.xml.beans.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeansDefinitionConstMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beansDefinitionConstructor.xml");
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("U:\\git\\sdatademo\\dnp\\src\\main\\resources\\");
		Object bean = ctx.getBean("userService");
		
	}

}
