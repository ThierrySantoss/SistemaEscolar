package com.example.Atividade20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Atividade20.dto.ProfessorDTO;
import com.example.Atividade20.entities.Professor;
import com.example.Atividade20.services.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping
	public ProfessorDTO findById(Long id) {
		return professorService.findById(id);
	}
	
	@PostMapping
	public Professor addPessoa(Professor pessoa) {
		return professorService.addPessoa(pessoa);
	}

}
