package com.example.Atividade20.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.Atividade20.entities.Equipamento;
import com.example.Atividade20.entities.Pessoa;
import com.example.Atividade20.entities.Professor;
import com.example.Atividade20.entities.Sala;
import com.example.Atividade20.entities.TipoSala;

public class SalaDTO {

	private Long numero;
	private Long bloco;
	private String apelido;
	private TipoSala tipoSala;
	private List<Equipamento> equipamentos = new ArrayList<>();
	private List<Pessoa> alunos = new ArrayList<>();
	private Boolean aberto;
	private Professor professor;

	public SalaDTO() {

	}

	public SalaDTO(Long numero, Long bloco, String apelido, TipoSala tipoSala, List<Equipamento> equipamentos,
			Boolean aberto, Professor professor, List<Pessoa> alunos) {
		this.numero = numero;
		this.bloco = bloco;
		this.apelido = apelido;
		this.tipoSala = tipoSala;
		this.equipamentos = equipamentos;
		this.aberto = aberto;
		this.professor = professor;
		this.alunos = alunos;
	}

	public SalaDTO(Sala sala) {
		this.numero = sala.getNumero();
		this.bloco = sala.getBloco();
		this.apelido = sala.getApelido();
		this.tipoSala = sala.getTipoSala();
		this.equipamentos = sala.getEquipamentos();
		this.aberto = sala.getAberto();
		this.professor = sala.getProfessor();
		this.alunos = sala.getAlunos();
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getBloco() {
		return bloco;
	}

	public void setBloco(Long bloco) {
		this.bloco = bloco;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public TipoSala getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(TipoSala tipoSala) {
		this.tipoSala = tipoSala;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

	public Boolean getAberto() {
		return aberto;
	}

	public void setAberto(Boolean aberto) {
		this.aberto = aberto;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Pessoa> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Pessoa> alunos) {
		this.alunos = alunos;
	}

}
