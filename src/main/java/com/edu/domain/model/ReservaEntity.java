package com.edu.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "reservas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_reserva")
    private Long num_reserva;
    private LocalDate fecha_reserva;
    private LocalTime hora_inicio;
    private LocalTime hora_fin;
    private String nom_cliente;
    @ManyToOne
    @JoinColumn(name = "cod_sala")
    private SalaEntity sala;

}
