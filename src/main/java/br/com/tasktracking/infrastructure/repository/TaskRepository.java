package br.com.tasktracking.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import br.com.tasktracking.domain.models.Task;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task, Integer> {
	
	List<Task> findByHistoria(int historia);
	
	Task save(Task task);
	
	List<Task> findAll();

}
