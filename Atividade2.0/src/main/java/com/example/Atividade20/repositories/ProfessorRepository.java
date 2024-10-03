package com.example.Atividade20.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Atividade20.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
