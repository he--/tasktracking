package br.com.tasktracking.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import br.com.tasktracking.domain.models.Projeto;

@Repository
@Transactional
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
	
	Projeto save(Projeto projeto);
	
	List<Projeto> findAll();
	
	Projeto findById(int id);

}
