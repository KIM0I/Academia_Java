package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Dog;

public interface DogService {

	public List<Dog> findAll();
	
	public Dog findById(int theId);
	
	public void save(Dog theDog);
	
	public void deleteById(int theId);
	
}
