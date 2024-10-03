package com.example.Atividade20.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_equipamentos")
public class Equipamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nome;
	
	@NotNull
	private Long codigoPatrimonio;

	private Integer anoAquisicao;

	@Size(max = 200)
	private String desc;

	private TipoEquipamento tipoEquipamento;

	private EstadoEquipamento estadoEquipamento;

	public Equipamento() {

	}

	public Equipamento(Long id, @NotBlank String nome, Long codigoPatrimonio, @Max(200) String desc,
			TipoEquipamento tipoEquipamento, EstadoEquipamento estadoEquipamento) {
		this.id = id;
		this.nome = nome;
		this.codigoPatrimonio = codigoPatrimonio;
		this.desc = desc;
		this.tipoEquipamento = tipoEquipamento;
		this.estadoEquipamento = estadoEquipamento;
		this.anoAquisicao = LocalDate.now().getYear();
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

	public Long getCodigoPatrimonio() {
		return codigoPatrimonio;
	}

	public void setCodigoPatrimonio(Long codigoPatrimonio) {
		this.codigoPatrimonio = codigoPatrimonio;
	}

	public Integer getAnoAquisicao() {
		return anoAquisicao;
	}

	public void setAnoAquisicao(Integer anoAquisicao) {
		this.anoAquisicao = anoAquisicao;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public TipoEquipamento getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public EstadoEquipamento getEstadoEquipamento() {
		return estadoEquipamento;
	}

	public void setEstadoEquipamento(EstadoEquipamento estadoEquipamento) {
		this.estadoEquipamento = estadoEquipamento;
	}
	
	

}
