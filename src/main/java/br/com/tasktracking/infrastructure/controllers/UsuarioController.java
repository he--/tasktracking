package br.com.tasktracking.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.tasktracking.domain.models.Projeto;
import br.com.tasktracking.domain.models.Usuario;
import br.com.tasktracking.infrastructure.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	@ResponseBody
	public String listar() {
		
		List<Usuario> usuarios = usuarioRepository.findAll();

        return usuarios.toString();
	}
	
	@GetMapping("/usuario")
	public String cadastroProjeto(ModelMap model) {
		
		return "cadastroUsuario.html";
	}
	
	@RequestMapping("cadastraUsuario")
	public String cadastroUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
		
		return "cadastroUsuario.html";
	}
	
	@GetMapping("/usuario-listar")
	public String listarProjetos(ModelMap model) {
		List<Usuario> usuario = usuarioRepository.findAll();
		
		model.addAttribute("usuarios", usuario);
		return "listarUsuarios.html";
	}
}
