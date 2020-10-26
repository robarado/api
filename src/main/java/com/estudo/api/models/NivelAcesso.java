package com.estudo.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id; // sempre usar!

@Entity
public class NivelAcesso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private long id;
	private String nome;
	
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
}
