package fr.insa.projetint.Orchestrateur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.projetint.Orchestrateur.model.Image;
import fr.insa.projetint.Orchestrateur.service.CNNService;

@RestController
@RequestMapping("/match")
public class MainController {
	
	@Autowired
	private CNNService cnnService;

	@GetMapping()
	public String match(@RequestBody Image image) {
		return this.cnnService.findAttribute(image);
	}

	@GetMapping("/match1")
	public String match1() {
		return this.cnnService.helloWorld();
	}
}
