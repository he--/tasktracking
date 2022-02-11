package br.com.tasktracking.infrastructure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DashboardController {

	@GetMapping("/")
	public String dashboardGet() {
		
		return "index.html";
	}
}
