package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Dog;

@Repository
public class DogDAOHibernateImpl implements DogDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public DogDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Dog> findAll() {
		System.out.println("DogDAOHibernateImpl");
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Dog> theQuery =
				currentSession.createQuery("from Dog", Dog.class);
		
		// execute query and get result list
		List<Dog> dogs = theQuery.getResultList();
		
		// return the results		
		return dogs;
	}


	@Override
	public Dog findById(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// get the dog
		Dog theDog =
				currentSession.get(Dog.class, theId);
		
		// return the dog
		return theDog;
	}


	@Override
	public void save(Dog theDog) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// save employee
		currentSession.saveOrUpdate(theDog);
	}


	@Override
	public void deleteById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery(
						"delete from dog where id=:dogId");
		
		theQuery.setParameter("dogId", theId);
		
		theQuery.executeUpdate();
	}

}







