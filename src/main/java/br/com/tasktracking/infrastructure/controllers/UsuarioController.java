package br.com.tasktracking.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.tasktracking.domain.models.Usuario;
import br.com.tasktracking.infrastructure.dao.UsuarioDao;

@Controller
public class UsuarioController {
	
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@GetMapping("/usuarios")
	@ResponseBody
	public String listar() {
		List<Usuario> usuarios = usuarioDao.listar();

        return usuarios.toString();
	}
}
