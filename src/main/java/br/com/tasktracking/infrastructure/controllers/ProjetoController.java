package br.com.tasktracking.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.tasktracking.infrastructure.repository.ProjetoRepository;
import br.com.tasktracking.infrastructure.repository.SprintRepository;
import br.com.tasktracking.domain.models.Projeto;
import br.com.tasktracking.domain.models.Sprint;
import br.com.tasktracking.domain.models.Task;


@Controller
public class ProjetoController {
	
	@Autowired
	private ProjetoRepository ProjetoRepository;
	
	@Autowired
	private SprintRepository sprintRepository;
	
	@GetMapping("/projeto")
	public String cadastroProjeto(ModelMap model) {
		model.addAttribute("nomeDoAtributo", "20%");
		
		return "cadastroProjetos.html";
	}
	
	@RequestMapping("cadastraProjeto")
	public String cadastroProjeto(Projeto projeto) {
		ProjetoRepository.save(projeto);
		
		return "cadastroProjetos.html";
	}
	
	
	@GetMapping("/projeto-listar")
	public String listarProjetos(ModelMap model) {
		List<Projeto> projetos = ProjetoRepository.findAll();
		
		model.addAttribute("projetos", projetos);
		return "listarProjetos.html";
	}
	
	@GetMapping("/listar-sprint/{id}")
	public String listarSprints(@PathVariable("id") int id, ModelMap model) {
		List<Sprint> sprints = sprintRepository.findByProjeto(id);
		
		model.addAttribute("sprints", sprints);
		
		return "listaSprints.html";
	}
}
