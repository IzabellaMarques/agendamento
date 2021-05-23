package com.api.agendamento.services;

import com.api.agendamento.entities.Agendamento;
import com.api.agendamento.entities.Carro;
import com.api.agendamento.repositories.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    @Transactional(readOnly= true)
    public List<Agendamento> findAll(){
        return repository.findAll();
    }

    @Transactional(readOnly= true)
    public Optional<Agendamento> findById(Long id){
        return repository.findById(id);
    }

    @Transactional(readOnly= true)
    public Agendamento save(Agendamento agendamento){
        return repository.save(agendamento);
    }

    @Transactional(readOnly= true)
    public void deleteAll(){
         repository.deleteAll();
    }

    @Transactional(readOnly= true)
    public void deleteById(Long id){
         repository.deleteById(id);
    }

}
