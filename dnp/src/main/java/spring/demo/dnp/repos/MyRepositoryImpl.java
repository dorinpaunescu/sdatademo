package spring.demo.dnp.repos;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import spring.demo.dnp.model.City;
import spring.demo.dnp.model.Country;

@Repository
public class MyRepositoryImpl implements MyRepositoryCustom{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Country> getAllThatStartsWith(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(em);
		Query nq = em.createNativeQuery("select * from country where Code like ?1 ");
		nq.setParameter(1, prefix + "%");
		return nq.getResultList();
	}

}
