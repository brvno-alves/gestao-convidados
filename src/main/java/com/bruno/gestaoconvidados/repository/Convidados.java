package com.bruno.gestaoconvidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.gestaoconvidados.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
