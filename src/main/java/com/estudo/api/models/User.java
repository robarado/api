package com.estudo.api.models;

import javax.persistence.Entity; // persistencia sempre usar!
import javax.persistence.ManyToMany;

@Entity
public class User {
	
	private long id;
	private String nome;
	private String senha;
	
	@ManyToMany
	private NivelAcesso nivelAcesso; // maiuscula "tipo" -> minuscula "variavel"
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
}
