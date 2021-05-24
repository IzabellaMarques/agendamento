package com.api.agendamento.repositories;

import com.api.agendamento.entities.Agendamento;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    //@EntityGraph(attributePaths= {"carro","empresa"})
    List<Agendamento> findAll();
}
