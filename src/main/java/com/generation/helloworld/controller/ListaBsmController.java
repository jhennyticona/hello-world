package com.generation.helloworld.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsm")
public class ListaBsmController {

	@GetMapping
	public List<String> ListaBSM(){
		
		List<String> bsms=new ArrayList<>();
		bsms.add("1. Proatividade");
		bsms.add("2. Comunicação");
		bsms.add("3. Persistência");
		bsms.add("4. Trabalho em equipe");
		bsms.add("5. Responsabilidade Pessoal");
		bsms.add("6. Mentalidade de Crescimento");
		bsms.add("7. Orientação ao Detalhe");
		bsms.add("8. Orientação ao Futuro");
		return bsms;
	}
}
