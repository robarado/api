package com.estudo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class olaMundo {				// controller
	
	@RequestMapping("/") 			// nome do EndPoint = URL
	@ResponseBody 					// resposta apareça no meu corpo
	public String ola(){		 	// criando um método
		return "Ola Mundo";
		
	}
}
