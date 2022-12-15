package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.Dog;

public interface DogService {

	public List<Dog> getDogs();

	public void saveDog(Dog theDog);

	public Dog getDog(int theId);

	public void deleteDog(int theId);
	
}
