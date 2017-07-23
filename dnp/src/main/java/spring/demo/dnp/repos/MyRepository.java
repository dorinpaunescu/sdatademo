package spring.demo.dnp.repos;

import org.springframework.data.repository.Repository;

import spring.demo.dnp.model.Country;

public interface MyRepository extends Repository<Country, String> , MyRepositoryCustom{
	
	Country findByCode(String code);

}
