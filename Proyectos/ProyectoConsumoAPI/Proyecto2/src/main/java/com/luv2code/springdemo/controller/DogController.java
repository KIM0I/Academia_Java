package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.model.Dog;
import com.luv2code.springdemo.service.DogService;

@Controller
@RequestMapping("/dog")
public class DogController {

	// need to inject our dog service
	@Autowired
	private DogService dogService;
	
	@GetMapping("/list")
	public String listDogs(Model theModel) {
		
		// get customers from the service
		List<Dog> theDogs = dogService.getDogs();
				
		// add the customers to the model
		theModel.addAttribute("dogs", theDogs);
		
		return "list-dogs";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Dog theDog = new Dog();
		
		theModel.addAttribute("dog", theDog);
		
		return "dog-form";
	}
	
	@PostMapping("/saveDog")
	public String saveDog(@ModelAttribute("dog") Dog theDog) {
		
		// save the customer using our service
		dogService.saveDog(theDog);	
		
		return "redirect:/dog/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("dogId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Dog theDog = dogService.getDog(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("dog", theDog);
		
		// send over to our form		
		return "dog-form";
	}
	
	@GetMapping("/delete")
	public String deleteDog(@RequestParam("dogId") int theId) {
		
		// delete the customer
		dogService.deleteDog(theId);
		
		return "redirect:/dog/list";
	}
}










