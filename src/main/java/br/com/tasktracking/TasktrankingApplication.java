package br.com.tasktracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.tasktracking.domain.models.Usuario;
import br.com.tasktracking.infrastructure.repository.UsuarioRepository;

@SpringBootApplication
public class TasktrankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasktrankingApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
}
