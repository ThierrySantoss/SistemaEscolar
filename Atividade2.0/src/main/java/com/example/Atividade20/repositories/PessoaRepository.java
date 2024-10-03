package com.example.Atividade20.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Atividade20.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
