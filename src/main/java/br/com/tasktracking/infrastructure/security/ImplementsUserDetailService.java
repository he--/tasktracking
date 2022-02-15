package br.com.tasktracking.infrastructure.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.tasktracking.domain.models.Usuario;
import br.com.tasktracking.infrastructure.repository.UsuarioRepository;

@Repository
public class ImplementsUserDetailService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository ur;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = ur.findByLogin(login);
		
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuário não encontrado");
		}
		
		return usuario;
	}
}
