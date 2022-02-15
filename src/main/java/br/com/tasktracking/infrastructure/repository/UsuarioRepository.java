package br.com.tasktracking.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import br.com.tasktracking.domain.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByLogin(String login);
	
	Usuario save(Usuario usuario);
	
	List<Usuario> findAll();

}
