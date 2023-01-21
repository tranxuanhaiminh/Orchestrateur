package fr.insa.projetint.Orchestrateur.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import fr.insa.projetint.Orchestrateur.model.SearchRes;

@Service
public class SearchService {
	
	@Autowired
	private RestTemplate restTemplate;
	WebClient webClient = WebClient.create("http://127.0.0.1:5000");
	
	public String searchImg(String img) {
		SearchRes test1 = webClient.get().uri("/search/" + img).retrieve().bodyToMono(SearchRes.class).block();
		return test1.getFirstImageName();
	}
	
	public String helloWorld() {
		SearchRes test1 = webClient.get().uri("/search/" + "0111010010100101001010010100101001011010").retrieve().bodyToMono(SearchRes.class).block();
		return test1.getFirstImageName();
	}

}
