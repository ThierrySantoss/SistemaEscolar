package com.example.Atividade20.dto;

import com.example.Atividade20.entities.Equipamento;
import com.example.Atividade20.entities.EstadoEquipamento;
import com.example.Atividade20.entities.TipoEquipamento;

public class EquipamentoDTO {
	
	private String nome;

	private Long codigoPatrimonio;

	private Integer anoAquisicao;
	
	private String desc;
	
	private TipoEquipamento tipoEquipamento;

	private EstadoEquipamento estadoEquipamento;
	
	public EquipamentoDTO() {
		
	}

	public EquipamentoDTO(String nome, Long codigoPatrimonio, Integer anoAquisicao, String desc,
			TipoEquipamento tipoEquipamento, EstadoEquipamento estadoEquipamento) {
		this.nome = nome;
		this.codigoPatrimonio = codigoPatrimonio;
		this.anoAquisicao = anoAquisicao;
		this.desc = desc;
		this.tipoEquipamento = tipoEquipamento;
		this.estadoEquipamento = estadoEquipamento;
	}
	
	public EquipamentoDTO(Equipamento equipamento) {
		this.nome = equipamento.getNome();
		this.codigoPatrimonio = equipamento.getCodigoPatrimonio();
		this.anoAquisicao = equipamento.getAnoAquisicao();
		this.desc = equipamento.getDesc();
		this.tipoEquipamento = equipamento.getTipoEquipamento();
		this.estadoEquipamento = equipamento.getEstadoEquipamento();
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
