package fr.insa.projetint.Orchestrateur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fr.insa.projetint.Orchestrateur.model.Image;

@Service
public class CNNService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String findAttribute(Image img) {
		return img.getEncoded() + " attribute";
	}
	
	public String helloWorld() {
		String test1 = restTemplate.getForObject("http://localhost:8081", String.class);
		return test1;
	}

}
