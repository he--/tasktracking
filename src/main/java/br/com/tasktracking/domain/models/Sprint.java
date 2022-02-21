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
@Table(name = "sprint")
public class Sprint {
	
	@Id
	@Column(name="nu_seq_sprint")
	private Integer id;
	
	@Column(name = "ds_versao")
	private String versao;
	
	@Column(name = "nu_seq_projeto")
	private int projeto;
	
	@Column(name = "dt_inicio")
	private Date dtInicio;
	
	@Column(name = "dt_Fim")
	private Date dtFim;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public int getProjeto() {
		return projeto;
	}

	public void setProjeto(int projeto) {
		this.projeto = projeto;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
}
