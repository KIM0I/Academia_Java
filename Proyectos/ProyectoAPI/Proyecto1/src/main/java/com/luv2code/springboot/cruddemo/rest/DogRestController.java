package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Dog;
import com.luv2code.springboot.cruddemo.service.DogService;

@RestController
@RequestMapping("/rest")
public class DogRestController {

	private DogService dogService;
	
	@Autowired
	public DogRestController(DogService theDogService) {
		dogService = theDogService;
	}
	
	// expose "/dogs" and return list of dogs
	@GetMapping("/dogs")
	public List<Dog> findAll() {
		return dogService.findAll();
	}

	// add mapping for GET /dogs/{dogId}
	
	@GetMapping("/dogs/{dogId}")
	public Dog getDog(@PathVariable int dogId) throws Exception {
		
		Dog theDog = dogService.findById(dogId);
		
		if (theDog == null) {
			throw new Exception("Dog id not found - " + dogId);
		}
		
		return theDog;
	}
	
	// add mapping for POST /employees - add new employee
	
	@PostMapping("/dogs")
	public Dog addDog(@RequestBody Dog theDog) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theDog.setId(0);
		
		dogService.save(theDog);
		
		return theDog;
	}
	
	// add mapping for PUT /employees - update existing employee
	
	@PutMapping("/dogs")
	public Dog updateDog(@RequestBody Dog theDog) {
		
		dogService.save(theDog);
		
		return theDog;
	}
	
	// add mapping for DELETE /employees/{employeeId} - delete employee
	
	@DeleteMapping("/dogs/{dogId}")
	public String deleteDog(@PathVariable int dogId) {
		
		Dog tempDog = dogService.findById(dogId);
		
		// throw exception if null
		
		if (tempDog == null) {
			throw new RuntimeException("Dog id not found - " + dogId);
		}
		
		dogService.deleteById(dogId);
		
		return "Deleted employee id - " + dogId;
	}
	
}










