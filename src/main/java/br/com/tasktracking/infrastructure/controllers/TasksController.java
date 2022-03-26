package br.com.tasktracking.infrastructure.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tasktracking.domain.models.Task;
import br.com.tasktracking.domain.models.Usuario;
import br.com.tasktracking.infrastructure.repository.TaskRepository;
import br.com.tasktracking.infrastructure.repository.UsuarioRepository;

@Controller
public class TasksController {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/tasks")
	public String dashboardGet(ModelMap model) {
		model.addAttribute("nomeDoAtributo", "20%");
		
		return "tables.html";
	}
	
	@RequestMapping("cadastraTask")
	public String cadastraTask(Task Task) {
		taskRepository.save(Task);
		
		return "cadastroProjetos.html";
	}
	
	@RequestMapping("editeTask/{id}")
	public String editTask(@PathVariable("id") int id, ModelMap model) {
		Task task = taskRepository.findById(id);
		List<Usuario> usuarios = usuarioRepository.findAll();
		
		model.addAttribute("task", task);
		model.addAttribute("usuarios", usuarios);
		
		return "editeTask.html";
	}
}
