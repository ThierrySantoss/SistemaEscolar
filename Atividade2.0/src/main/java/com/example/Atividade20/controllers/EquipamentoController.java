package com.example.Atividade20.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Atividade20.dto.EquipamentoDTO;
import com.example.Atividade20.entities.Equipamento;
import com.example.Atividade20.services.EquipamentoService;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
	
	@Autowired
	EquipamentoService equipamentoService;
	
	
	@GetMapping
	public EquipamentoDTO findById(Long id) {
		return equipamentoService.findById(id);
	}
	
	@PostMapping
	public Equipamento addEquipamento(Equipamento equipamento) {
		return equipamentoService.addEquipamento(equipamento);
	}

}
