package com.sd.eventoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sd.eventoapi.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String>{

}
