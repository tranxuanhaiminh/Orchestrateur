package fr.insa.projetint.Orchestrateur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SearchService {
	
	@Autowired
	private RestTemplate restTemplate;
	WebClient webClient = WebClient.create("http://localhost:8081");
	
	public String findAttribute(String img) {
		return img + " attribute";
	}
	
	public String helloWorld() {
		String test1 = webClient.get().uri("/" + "abc").retrieve().bodyToMono(String.class).block();
		return test1;
	}

}
