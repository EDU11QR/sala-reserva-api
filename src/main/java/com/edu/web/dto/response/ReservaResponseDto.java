package com.edu.web.dto.response;

import java.time.LocalDate;
import java.time.LocalTime;

public record ReservaResponseDto(
        Long num_reserva,
        LocalDate fecha_reserva,
        LocalTime hora_inicio,
        LocalTime hora_fin,
        String nom_cliente,
        Long cod_sala,
        String nom_sala

) {
}
