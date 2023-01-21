package fr.insa.projetint.Orchestrateur.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.projetint.Orchestrateur.model.Image;
import fr.insa.projetint.Orchestrateur.ressource.ImageRessource;
import fr.insa.projetint.Orchestrateur.service.CNNService;
import fr.insa.projetint.Orchestrateur.service.SearchService;

@RestController
@RequestMapping("/match")
public class MainController {
	
	@Autowired
	private CNNService cnnService;
	
	@Autowired
	private SearchService searchService;

	@GetMapping()
	public String match(@RequestBody Image image) {
		String imgEnc = this.cnnService.findAttribute(image);
		return this.searchService.searchImg(imgEnc);
	}
	
	@GetMapping("/match0")
	public String match0() throws IOException {
		String path = "./src/main/resources/images/000001.jpg";
		return new ImageRessource(path).getEncStr();
	}

	@GetMapping("/match1")
	public String match1() {
		return this.searchService.helloWorld();
	}
}
