package br.com.tasktracking.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

	@Query(value = "SELECT ta.* "
			+ "FROM tasktracking.task ta "
			+ "join tasktracking.historia hi on ta.nu_seq_historia = hi.nu_seq_historia "
			+ "join tasktracking.sprint sp on hi.nu_seq_sprint = sp.nu_seq_sprint "
			+ "WHERE sp.nu_seq_sprint = ?1 and ta.ds_status = ?2", nativeQuery = true
			)
	List<Task> getTasksPorSprintStatus(int sprint, String status);
}
