package spring.demo.dnp.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.demo.dnp.model.City;
import spring.demo.dnp.model.Country;

public interface MyRepositoryCustom{
	//@Query(value = "select * from country where code like ?1%", nativeQuery=true)
	List<Country> getAllThatStartsWith(String prefix);
}
