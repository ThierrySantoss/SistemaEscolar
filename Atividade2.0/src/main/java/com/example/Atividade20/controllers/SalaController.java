package com.example.Atividade20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Atividade20.dto.SalaAlunosDTO;
import com.example.Atividade20.dto.SalaDTO;
import com.example.Atividade20.entities.Sala;
import com.example.Atividade20.services.SalaService;

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	@Autowired
	private SalaService salaService;
	
	@GetMapping
	public SalaDTO findById(Long idSala) {
		return salaService.findById(idSala);
	}
	
	@GetMapping("/listarAlunos")
	public SalaAlunosDTO listarAlunos(Long idSala) {
		return salaService.listarAlunos(idSala);
	}
	
	@PostMapping
	public Sala addSala(Sala sala) {
		return salaService.addSala(sala);
	}
	
	@PutMapping
	public Sala addEquipamento(Long idSala, Long idEquipamento) {
		return salaService.addEquipamento(idSala, idEquipamento);
	}
	
	@PutMapping("/abrirSala")
	public Sala abrirSala(Long idSala, Long idProfessor) {
		return salaService.abrirSala(idSala, idProfessor);
	}
	
	@PutMapping("/addAluno")
	public Sala addSala(Long idSala, Long idAluno) {
		return salaService.addAluno(idSala, idAluno);
	}

}
