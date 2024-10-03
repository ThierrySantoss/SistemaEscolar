package com.example.Atividade20.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Atividade20.dto.PessoaDTO;
import com.example.Atividade20.entities.Pessoa;
import com.example.Atividade20.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Transactional(readOnly = true)
	public PessoaDTO findById(Long id) {
		 PessoaDTO dto = new PessoaDTO(pessoaRepository.findById(id).get());
		 return dto;
	}
	
	@Transactional
	public Pessoa addPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

}
