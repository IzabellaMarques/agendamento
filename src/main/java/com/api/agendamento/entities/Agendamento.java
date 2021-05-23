package com.api.agendamento.entities;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="tb_agendamento")
@Data
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeEmpresa;
    private String servico;
    private String data;
    private String horario;

    @OneToMany(mappedBy = "agendamento")
    List<Carro> carros = new ArrayList<>();




}
