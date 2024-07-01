package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/BsMs")
public class BsMsController {
	
	  @GetMapping
	    public String BsMs() {
	        return "\nComunicação," +
	                " \nMentalidade de Crescimento," +
	                " \nOrientação para o Futuro," +
	                " \nPersistência, Comunicação," +
	                " \nTrabalho em Equipe," +
	                " \nProatividade," +
	                " \nOrientação ao Detalhe";
	  }
}
