package com.example.Atividade20.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Atividade20.dto.EquipamentoDTO;
import com.example.Atividade20.entities.Equipamento;
import com.example.Atividade20.entities.EstadoEquipamento;
import com.example.Atividade20.entities.TipoEquipamento;
import com.example.Atividade20.repositories.EquipamentoRepository;

@Service
public class EquipamentoService {
	
	@Autowired
	EquipamentoRepository equipamentoRepository;
	
	@Transactional
	public Equipamento addEquipamento(Equipamento equipamento) {
		if (equipamento.getTipoEquipamento() == TipoEquipamento.ELETRICO) {

			if (equipamento.getEstadoEquipamento() == null ||  !Set.of(EstadoEquipamento.DESLIGADO, EstadoEquipamento.LIGADO, EstadoEquipamento.QUEBRADO)
					.contains(equipamento.getEstadoEquipamento())) {
				throw new IllegalArgumentException("Equipamento Eletrico deve conter um estado!");
			}
		}
		
		return equipamentoRepository.save(equipamento);
	}
	
	@GetMapping
	public EquipamentoDTO findById(Long id) {
		
		EquipamentoDTO dto = new EquipamentoDTO(equipamentoRepository.findById(id).get());
		return dto;
	}

}
