package com.api.agendamento.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name ="tb_agendamento")
@Data
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String servico;
    private String data;
    private String horario;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch= FetchType.EAGER)
    @JoinColumn(name = "id_empresa", foreignKey = @ForeignKey(name = "empresa_fk"))
    private Empresa empresa;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch= FetchType.EAGER)
    @JoinColumn(name = "id_carro", foreignKey = @ForeignKey(name = "carro_fk"))
    private Carro carro;
}
