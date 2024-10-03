package com.example.Atividade20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Atividade20.dto.PessoaDTO;
import com.example.Atividade20.entities.Pessoa;
import com.example.Atividade20.services.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public PessoaDTO findById(Long id) {
		return pessoaService.findById(id);
	}
	
	@PostMapping
	public Pessoa addPessoa(Pessoa pessoa) {
		return pessoaService.addPessoa(pessoa);
	}

}
