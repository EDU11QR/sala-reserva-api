package com.edu.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "salas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SalaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_sala")
    private Long cod_sala;
    private String nom_sala;
    private Integer capacidad;

}
