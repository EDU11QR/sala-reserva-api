package com.edu.web.dto.request;


import java.time.LocalDate;
import java.time.LocalTime;

public record ReservaRequestDto(
        LocalDate fecha_reserva,
        LocalTime hora_inicio,
        LocalTime hora_fin,
        String nom_cliente,
        Long cod_sala
) {
}
