package com.exTestetdd.Exerciciotdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exTestetdd.Exerciciotdd.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}