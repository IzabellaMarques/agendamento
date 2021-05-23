package com.api.agendamento.controllers;


import com.api.agendamento.entities.Agendamento;
import com.api.agendamento.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @GetMapping(value = "/getAll")
    public List<Agendamento> getAll(){
       return service.findAll();
    }

    @GetMapping(value = "/getById/{id}")
    public Optional<Agendamento> getById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping(value = "/save")
    public Agendamento agendamento(@RequestBody Agendamento agendamento){
        return service.save(agendamento);
    }

    @DeleteMapping( value = "/deleteAll")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public HttpStatus deleteAll(){
         service.deleteAll();
         return  HttpStatus.NOT_FOUND;
    }

    @DeleteMapping(value = "/deleteById/{id}")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public HttpStatus deletebyID(@PathVariable Long id) {
        service.deleteById(id);
        return HttpStatus.NOT_FOUND;
    }
}
