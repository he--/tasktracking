package br.com.tasktracking.infrastructure.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.tasktracking.domain.models.Usuario;


@Controller
public class BoardController {
	
	@GetMapping("/board")
	public String boardGet(ModelMap model) {
		
		Usuario usuarioA = new Usuario();
		usuarioA.setNome("joao");
		
		Usuario usuariob = new Usuario();
		usuariob.setNome("pedro");
		
		Usuario usuarioc = new Usuario();
		usuarioc.setNome("helio");
		
		ArrayList<Usuario> listaDeuser = new ArrayList<>(); 
		listaDeuser.add(usuarioA);
		listaDeuser.add(usuariob);
		listaDeuser.add(usuarioc);
		model.addAttribute("students", listaDeuser);
		
		return "board.html";
	}
}
