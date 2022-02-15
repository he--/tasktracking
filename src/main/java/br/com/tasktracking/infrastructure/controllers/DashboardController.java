package br.com.tasktracking.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	@GetMapping("/")
	public String dashboardGet(ModelMap model) {
		model.addAttribute("nomeDoAtributo", "20%");
		
		return "index.html";
	}
}
