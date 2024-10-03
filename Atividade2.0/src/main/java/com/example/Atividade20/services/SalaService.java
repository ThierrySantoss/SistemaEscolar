package com.example.Atividade20.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Atividade20.dto.SalaAlunosDTO;
import com.example.Atividade20.dto.SalaDTO;
import com.example.Atividade20.entities.Equipamento;
import com.example.Atividade20.entities.Pessoa;
import com.example.Atividade20.entities.Professor;
import com.example.Atividade20.entities.Sala;
import com.example.Atividade20.entities.TipoPessoa;
import com.example.Atividade20.entities.TipoProfessor;
import com.example.Atividade20.entities.TipoSala;
import com.example.Atividade20.repositories.EquipamentoRepository;
import com.example.Atividade20.repositories.PessoaRepository;
import com.example.Atividade20.repositories.ProfessorRepository;
import com.example.Atividade20.repositories.SalaRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SalaService {

	@Autowired
	SalaRepository salaRepository;

	@Autowired
	EquipamentoRepository equipamentoRepository;

	@Autowired
	ProfessorRepository professorRepository;

	@Autowired
	PessoaRepository pessoaRepository;

	@Transactional(readOnly = true)
	public SalaDTO findById(Long idSala) {

		SalaDTO dto = new SalaDTO(salaRepository.findById(idSala).get());
		return dto;
	}
	
	@Transactional(readOnly = true)
	public SalaAlunosDTO listarAlunos(Long idSala) {
		Optional<Sala> optionalSala = salaRepository.findById(idSala);
		
		if(optionalSala.isPresent()) {
			Sala sala = optionalSala.get();
			return new SalaAlunosDTO(sala);
			
		}else {
			throw new EntityNotFoundException("Sala não Encontrada!");
		}
	}

	@Transactional
	public Sala addSala(Sala sala) {

		if (sala.getTipoSala() == TipoSala.NORMAL) {

			for (Equipamento equipamento : sala.getEquipamentos()) {

				if (Set.of("COMPUTADOR", "ESTUFA", "RESERVATORIO").contains(equipamento.getNome().toUpperCase())) {
					throw new IllegalArgumentException(
							"Equipamento " + equipamento.getNome() + " improprio para a Sala");
				}
			}

		}

		return salaRepository.save(sala);

	}

	@Transactional
	public Sala addEquipamento(Long idSala, Long idEquipamento) {
		Sala sala = salaRepository.findById(idSala).get();
		Equipamento equipamento = equipamentoRepository.findById(idEquipamento).get();
		List<Equipamento> equipamentos = sala.getEquipamentos();
		if (sala.getTipoSala() == TipoSala.NORMAL) {

			if (Set.of("COMPUTADOR", "ESTUFA", "RESERVATORIO").contains(equipamento.getNome().toUpperCase())) {
				throw new IllegalArgumentException("Equipamento " + equipamento.getNome() + " improprio para a Sala");
			}
		}

		equipamentos.add(equipamento);
		sala.setEquipamentos(equipamentos);
		return salaRepository.save(sala);

	}

	@Transactional
	public Sala addAluno(Long idSala, Long idAluno) {
		Sala sala = salaRepository.findById(idSala).get();
		Pessoa pessoa = pessoaRepository.findById(idAluno).get();
		List<Pessoa> alunos = sala.getAlunos();
		if (sala.getAberto() == true) {
			if (pessoa.getTipoPessoa() == TipoPessoa.ALUNO) {
				alunos.add(pessoa);
				sala.setAlunos(alunos);
				return salaRepository.save(sala);
				
			} else {
				throw new IllegalArgumentException(pessoa.getTipoPessoa() + " não pode entrar na Sala!");
			}

		} else {
			throw new IllegalArgumentException("Sala Fechada!");
		}

	}

	@Transactional
	public Sala abrirSala(Long idSala, Long idProfessor) {
		Sala sala = salaRepository.findById(idSala).get();
		Professor professor = professorRepository.findById(idProfessor).get();

		if (professor.getTipoProfessor() == TipoProfessor.PROFESSORPRATICO
				|| professor.getTipoProfessor() == TipoProfessor.PROFESSORTEORICO
						&& sala.getTipoSala() == TipoSala.NORMAL) {
			sala.setAberto(true);
			sala.setProfessor(professor);
			professor.setSala(sala);
			return salaRepository.save(sala);

		} else {
			throw new IllegalArgumentException(professor.getTipoProfessor() + " não pode abrir " + sala.getTipoSala());
		}

	}

}
