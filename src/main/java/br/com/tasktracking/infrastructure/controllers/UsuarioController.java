package br.com.tasktracking.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.tasktracking.domain.models.Usuario;
import br.com.tasktracking.infrastructure.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	@ResponseBody
	public String listar() {
		
		Usuario usuario = new Usuario();
		usuario.setNome("Thiago de Carvalho");
		usuario.setEmail("thiago@gmail.com");
		usuario.setLogin("thiago");
		usuario.setSenha("teste");
		
		usuarioRepository.save(usuario);
		
		
		List<Usuario> usuarios = usuarioRepository.findAll();

        return usuarios.toString();
	}
}
