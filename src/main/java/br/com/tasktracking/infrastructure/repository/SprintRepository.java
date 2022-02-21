package br.com.tasktracking.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import br.com.tasktracking.domain.models.Sprint;

@Repository
@Transactional
public interface SprintRepository extends JpaRepository<Sprint, Integer> {
	
	Sprint save(Sprint sprint);
	
	List<Sprint> findAll();
	
	List<Sprint> findByProjeto(int projeto);
	
	Sprint findById(int id);
}