package br.com.tasktracking.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjetoController {
	
	@GetMapping("/projeto")
	public String cadastroProjet(ModelMap model) {
		model.addAttribute("nomeDoAtributo", "20%");
		
		return "register.html";
	}
}
