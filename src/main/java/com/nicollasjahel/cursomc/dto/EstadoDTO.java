package com.nicollasjahel.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.nicollasjahel.cursomc.domain.Estado;

public class EstadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private Integer id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	private String nome;
	
	
	public EstadoDTO() {
	}

	public EstadoDTO(Estado estado) {
		super();
		this.id = estado.getId();
		this.nome = estado.getNome();
	}

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

}

