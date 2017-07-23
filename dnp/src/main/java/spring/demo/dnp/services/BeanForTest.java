package spring.demo.dnp.services;

import java.util.List;

import javax.annotation.Resource;

import spring.demo.dnp.model.City;
import spring.demo.dnp.model.Country;
import spring.demo.dnp.repos.MyRepository;


public class BeanForTest {
	
	@Resource
	private MyRepository crepo;
	
	public void test(){
		System.out.println("Test demo");
		/*Country findByCode = crepo.findByCode("AFG");
		System.out.println(findByCode);*/
		
		Country allThatStartsWith = crepo.findByCode("AFG");
		System.out.println(allThatStartsWith);
	}
}
