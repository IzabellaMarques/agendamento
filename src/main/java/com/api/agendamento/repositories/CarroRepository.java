package com.api.agendamento.repositories;

import com.api.agendamento.entities.Agendamento;
import com.api.agendamento.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {



}
