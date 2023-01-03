package fr.insa.projetint.Orchestrateur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class OrchestrateurApplication {
	
	RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/")
	public String home() {
		String test1 = restTemplate.getForObject("http://172.22.0.120:8081", String.class);
		return test1;
	}
	
	@RequestMapping("/test")
	public String test() {
		return "HelloWorld!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OrchestrateurApplication.class, args);
	}

}
