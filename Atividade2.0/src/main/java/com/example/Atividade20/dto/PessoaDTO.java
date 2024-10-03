package com.example.Atividade20.dto;

import com.example.Atividade20.entities.Pessoa;
import com.example.Atividade20.entities.TipoPessoa;

public class PessoaDTO {
	
	private String nome;
	private TipoPessoa tipoPessoa;
	
	public PessoaDTO() {
		
	}

	public PessoaDTO(String nome, TipoPessoa tipoPessoa) {
		super();
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
	}
	
	public PessoaDTO(Pessoa pessoa) {
		this.nome = pessoa.getNome();
		this.tipoPessoa = pessoa.getTipoPessoa();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
	

}
