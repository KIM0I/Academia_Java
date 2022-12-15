package com.luv2code.springdemo.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.luv2code.springdemo.model.Dog;

@Service
public class DogServiceRestClientImpl implements DogService {

	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public DogServiceRestClientImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url}") String theUrl) {
		
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	@Override
	public List<Dog> getDogs() {
		
		logger.info("***OBTENER LISTA DE PERROS DESDE EL SERVICE REST CLIENTE");
		logger.info("in getDogs(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<Dog>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
													 new ParameterizedTypeReference<List<Dog>>() {});

		// get the list of customers from response
		List<Dog> dogs = responseEntity.getBody();

		logger.info("in getDogs(): dogs" + dogs);
		
		return dogs;
	}

	@Override
	public Dog getDog(int theId) {
		logger.info("***OBTENER UN PERRO DESDE EL SERVICE REST PERRO");

		logger.info("in getDog(): Calling REST API " + crmRestUrl);

		// make REST call
		Dog theDog = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
						Dog.class);

		logger.info("in saveDog(): theDog=" + theDog);
		
		return theDog;
	}

	@Override
	public void saveDog(Dog theDog) {

		logger.info("in saveDog(): Calling REST API " + crmRestUrl);
		
		int dogId = theDog.getId();

		// make REST call
		if (dogId == 0) {
			// add dog
			logger.info("***SALVAR UN PERRO DESDE EL SERVICE REST PERRO");

			restTemplate.postForEntity(crmRestUrl, theDog, String.class);			
		
		} else {
			// update dog
			logger.info("***ACTUALIZAR UN PERRO DESDE EL SERVICE REST CLIENTE");

			restTemplate.put(crmRestUrl, theDog);
		}

		logger.info("in saveDog(): success");	
	}

	@Override
	public void deleteDog(int theId) {
		logger.info("***BORRAR UN PERRO DESDE EL SERVICE REST PERRO");

		logger.info("in deleteDog(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("in deleteDog(): deleted dog theId=" + theId);
	}

}
