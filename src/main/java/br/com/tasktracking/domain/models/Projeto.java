package br.com.tasktracking.domain.models;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "tasktracking.nu_seq_projeto_seq", sequenceName = "tasktracking.nu_seq_projeto_seq", allocationSize = 1, initialValue = 1)
@Table(name = "projeto")
public class Projeto {
	
	@Id
	@GeneratedValue(generator = "tasktracking.nu_seq_projeto_seq")
	@Column(name="nu_seq_projeto")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="dt_cadastro")
	private Date dtCadastro;
	
	@Column(name="ds_descricao")
	private String descricao;
	
	@Column(name="projeto_owner")
	private String po;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}
}
