package br.com.tasktracking.domain.models;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@SequenceGenerator(name = "tasktracking.nu_seq_historia_seq", sequenceName = "tasktracking.nu_seq_historia_seq", allocationSize = 1, initialValue = 1)
@Table(name = "historia")
public class Historia {
	
	@Id
	@GeneratedValue(generator = "tasktracking.nu_seq_historia_seq")
	@Column(name="nu_seq_historia")
	private Integer id;
	
	@Column(name="nu_seq_sprint")
	private Integer sprint;
	
	@Column(name="ds_descricao")
	private String descricao;
	
	@Column(name="dt_cadastro")
	private Date dtCadastro;
	
	@Column(name="nu_seq_usuario")
	private Integer usuario;
	
	@Column(name="titulo")
	private String titulo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSprint() {
		return sprint;
	}

	public void setSprint(Integer sprint) {
		this.sprint = sprint;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
