package com.example.Atividade20.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_professor")
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String nome;
	
	@NotNull
	private TipoProfessor tipoProfessor;
	
	@OneToOne
	@JsonBackReference
	private Sala sala;

	public Professor() {

	}

	public Professor(Long id, String nome, TipoProfessor tipoProfessor) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipoProfessor = tipoProfessor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoProfessor getTipoProfessor() {
		return tipoProfessor;
	}

	public void setTipoProfessor(TipoProfessor tipoProfessor) {
		this.tipoProfessor = tipoProfessor;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	

	

}
