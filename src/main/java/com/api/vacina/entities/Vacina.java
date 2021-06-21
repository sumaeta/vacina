package com.api.vacina.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vacina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String nome;
	
	public Vacina(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
