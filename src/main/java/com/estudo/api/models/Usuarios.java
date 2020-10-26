package com.estudo.api.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import org.springframework.data.annotation.Id;

@Entity(name="usuarios")
public class Usuarios implements Serializable { // Criamos um modelo usuario
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private long id;
	private String nome;
	private String senha;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="usuarios") // ao chamar o usuario ele também carrega as informações do nivel de acesso
	private List<NivelAcesso> nivelAcesso = new ArrayList<>(); // maiuscula "tipo" -> minuscula "variavel"	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

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

	public List<NivelAcesso> getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(List<NivelAcesso> nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
}
