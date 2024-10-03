package com.example.Atividade20.dto;

import com.example.Atividade20.entities.Professor;
import com.example.Atividade20.entities.TipoProfessor;

public class ProfessorDTO {

	private String nome;

	private TipoProfessor tipoProfessor;
	
	public ProfessorDTO() {
		
	}

	public ProfessorDTO(String nome, TipoProfessor tipoProfessor) {
		this.nome = nome;
		this.tipoProfessor = tipoProfessor;
	}
	
	public ProfessorDTO(Professor professor) {
		this.nome = professor.getNome();
		this.tipoProfessor = professor.getTipoProfessor();
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

	
	
	
	

}
