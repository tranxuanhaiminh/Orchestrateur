package fr.insa.projetint.Orchestrateur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import fr.insa.projetint.Orchestrateur.model.Image;

@Service
public class CNNService {
	
	@Autowired
	private RestTemplate restTemplate;
	WebClient webClient = WebClient.create("http://localhost:8081");

	
	public String findAttribute(Image img) {
		Image res = webClient.get().uri("/a").retrieve().bodyToMono(Image.class).block();
		return res.getEncoded();
	}
	
	public String helloWorld() {
		Image test = webClient.get().uri("/a").retrieve().bodyToMono(Image.class).block();
		Image res = webClient.get().uri("/" + test.getEncoded()).retrieve().bodyToMono(Image.class).block();
		return res.getEncoded();
	}

}
