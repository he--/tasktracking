package br.com.tasktracking.domain.models;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@SequenceGenerator(name="task_sequece", sequenceName="tasktracking.nu_seq_task_seq")
	@Column(name="nu_seq_task")
	private Integer id;
	
	@Column(name="ds_descricao")
	private String descricao;
	
	@Column(name="nu_seq_historia")
	private Integer historia;
	
	@Column(name="dt_cadastro")
	private Date dtCadastro;
	
	@Column(name="ds_status")
	private String status;
	
	@Column(name="observacao")
	private String observacao;
	
	@Column(name="estimativa")
	private String estimativa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getHistoria() {
		return historia;
	}

	public void setHistoria(Integer historia) {
		this.historia = historia;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getEstimativa() {
		return estimativa;
	}

	public void setEstimativa(String estimativa) {
		this.estimativa = estimativa;
	}
}
