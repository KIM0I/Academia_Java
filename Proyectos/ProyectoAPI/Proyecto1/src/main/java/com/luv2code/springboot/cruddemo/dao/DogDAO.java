package com.luv2code.springboot.cruddemo.dao;

import java.util.List;
import com.luv2code.springboot.cruddemo.entity.Dog;

public interface DogDAO {

	List<Dog> findAll();
	
	Dog findById(int theId);
	
	void save(Dog theDog);
	
	void deleteById(int theId);
	
}
