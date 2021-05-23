package com.api.agendamento.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name ="tb_carro")
@Data
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private String placa;
    private String cor;

    @ManyToOne
    @JoinColumn(name="agendamento_id")
    private Agendamento agendamento;
}
