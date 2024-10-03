package com.example.Atividade20.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Atividade20.dto.ProfessorDTO;
import com.example.Atividade20.entities.Professor;
import com.example.Atividade20.repositories.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	ProfessorRepository professorRepository;
	
	@Transactional
	public Professor addPessoa(Professor pessoa) {
		return professorRepository.save(pessoa);
	}
	
	@Transactional(readOnly = true)
	public ProfessorDTO findById(Long id) {
		ProfessorDTO dto = new ProfessorDTO(professorRepository.findById(id).get());
		return dto;
		
	}

}
