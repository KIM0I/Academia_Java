package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.DogDAO;
import com.luv2code.springboot.cruddemo.entity.Dog;

@Service
public class DogServiceImpl implements DogService {

	
	private DogDAO dogDAO;
	
	@Autowired
	public DogServiceImpl(@Qualifier("dogDAOHibernateImpl") DogDAO theDogDAO) {
		dogDAO = theDogDAO;
	}
	
	@Override
	@Transactional
	public List<Dog> findAll() {
		return dogDAO.findAll();
	}

	@Override
	@Transactional
	public Dog findById(int theId) {
		return dogDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Dog theDog) {
		dogDAO.save(theDog);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		dogDAO.deleteById(theId);
	}

}






