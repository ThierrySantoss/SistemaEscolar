package com.example.Atividade20.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_sala")
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Numero da Sala não pode ser nulo!")
	private Long numero;

	@NotNull(message = "Bloco da Sala não pode ser nulo!")
	private Long bloco;

	private String apelido;

	@NotNull(message = "Tipo da Sala não pode ser nulo!")
	private TipoSala tipoSala;

	@ElementCollection
	private List<Equipamento> equipamentos = new ArrayList<Equipamento>();

	@ElementCollection
	private List<Pessoa> alunos = new ArrayList<Pessoa>();

	private Boolean aberto = false;

	@OneToOne(mappedBy = "sala", cascade = CascadeType.PERSIST)
	@JsonManagedReference
	private Professor professor;

	public Sala() {

	}

	public Sala(Long id, Long numero, Long bloco, String apelido, TipoSala tipoSala, List<Equipamento> equipamentos, List<Pessoa> alunos) {
		this.id = id;
		this.numero = numero;
		this.bloco = bloco;
		this.apelido = apelido;
		this.tipoSala = tipoSala;
		this.equipamentos = equipamentos;
		this.alunos = alunos;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Pessoa> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Pessoa> alunos) {
		this.alunos = alunos;
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

}
