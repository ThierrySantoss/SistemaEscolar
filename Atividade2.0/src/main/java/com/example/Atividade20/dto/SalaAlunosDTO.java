package com.example.Atividade20.dto;

import java.util.List;

import com.example.Atividade20.entities.Pessoa;
import com.example.Atividade20.entities.Sala;

public class SalaAlunosDTO {

	private Long numero;
	private List<Pessoa> alunos;

	public SalaAlunosDTO() {

	}

	public SalaAlunosDTO(Long numero, List<Pessoa> alunos) {

		this.numero = numero;
		this.alunos = alunos;
	}

	public SalaAlunosDTO(Sala sala) {
		this.numero = sala.getNumero();
		this.alunos = sala.getAlunos();
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public List<Pessoa> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Pessoa> alunos) {
		this.alunos = alunos;
	}

}
