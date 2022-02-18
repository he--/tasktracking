package br.com.tasktracking.infrastructure.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.tasktracking.domain.models.Task;
import br.com.tasktracking.domain.models.Usuario;
import br.com.tasktracking.infrastructure.repository.TaskRepository;
import br.com.tasktracking.infrastructure.repository.UsuarioRepository;


@Controller
public class BoardController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	
	@GetMapping("/board")
	public String boardGet(ModelMap model) {
		
		List<Usuario> usuarios = usuarioRepository.findAll();
		model.addAttribute("students", usuarios);
		
		List<Task> tasks = taskRepository.findAll();
		
		model.addAttribute("tasks", tasks);
		
		return "board.html";
	}
}
