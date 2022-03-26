package br.com.tasktracking.infrastructure.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tasktracking.domain.models.Historia;
import br.com.tasktracking.domain.models.Projeto;
import br.com.tasktracking.domain.models.Task;
import br.com.tasktracking.domain.models.Usuario;
import br.com.tasktracking.infrastructure.repository.HistoriaRepository;
import br.com.tasktracking.infrastructure.repository.ProjetoRepository;
import br.com.tasktracking.infrastructure.repository.TaskRepository;
import br.com.tasktracking.infrastructure.repository.UsuarioRepository;


@Controller
public class BoardController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private ProjetoRepository projetoRepository;
	
	@Autowired
	private HistoriaRepository historiaRepository;
	

	@GetMapping("/board/{id}")
	public String boardGet(@PathVariable("id") int id, ModelMap model) {
		
		List<Task> tasksAFAzer = taskRepository.getTasksPorSprintStatus(id, "Á Fazer");
		List<Task> tasksEmAndamento = taskRepository.getTasksPorSprintStatus(id, "Em Andamento");
		List<Task> tasksConcuidas = taskRepository.getTasksPorSprintStatus(id, "Concuído");
		List<Task> tasksEmHomologacao = taskRepository.getTasksPorSprintStatus(id, "Homologacao");
		List<Task> tasksEmImpedimento = taskRepository.getTasksPorSprintStatus(id, "Impedimento");
		List<Historia> historias = historiaRepository.findBySprint(id);
		
		model.addAttribute("tasksAFAzer", tasksAFAzer);
		model.addAttribute("tasksEmAndamento", tasksEmAndamento);
		model.addAttribute("tasksConcuidas", tasksConcuidas);
		model.addAttribute("tasksEmHomologacao", tasksEmHomologacao);
		model.addAttribute("tasksEmImpedimento", tasksEmImpedimento);
		model.addAttribute("historias", historias);
		
		return "board.html";
	}
}
