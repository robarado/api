package com.estudo.api.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import org.springframework.data.annotation.Id;

@Entity(name="usuarios")
public class Usuarios { // Criamos um modelo usuario
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private long id;
	private String nome;
	private String senha;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="usuarios") // ao chamar o usuario ele também carrega as informações do nivel de acesso
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
