package br.com.tasktracking.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import br.com.tasktracking.domain.models.Projeto;
import br.com.tasktracking.domain.models.Historia;

@Repository
@Transactional
public interface HistoriaRepository extends JpaRepository<Historia, Integer> {
	
	Historia save(Historia historia);
	
	List<Historia> findAll();
	
	Historia findById(int id);
	
	List<Historia> findBySprint(int sprint);
}
