package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obj-aprendizagem")
public class ObjetivosAprendizagemController {

	@GetMapping
public List<String> ListaObjetivos(){
		
		List<String> obj=new ArrayList<>();
		obj.add("1. Criando DataBase com MySQL.");
		obj.add("2. Introdução SQL.");
		obj.add("3. Inner Join.");
		obj.add("4. Prototipando o Banco de Dados");
		obj.add("5. Introdução Spring Boot.");
		obj.add("6. Dependencias Spring Framework.");
		return obj;
	}
}
