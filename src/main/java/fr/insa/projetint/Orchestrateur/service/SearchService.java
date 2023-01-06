package fr.insa.projetint.Orchestrateur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String findAttribute(String img) {
		return img + " attribute";
	}
	
	public String helloWorld() {
		String test1 = restTemplate.getForObject("http://localhost:8081", String.class);
		return test1;
	}

}
