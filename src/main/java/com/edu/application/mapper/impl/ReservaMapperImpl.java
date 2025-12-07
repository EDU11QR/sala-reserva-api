package com.edu.application.mapper.impl;

import com.edu.application.mapper.ReservaMapper;
import com.edu.domain.model.ReservaEntity;
import com.edu.domain.model.SalaEntity;
import com.edu.web.dto.request.ReservaRequestDto;
import com.edu.web.dto.response.ReservaResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ReservaMapperImpl implements ReservaMapper {
    @Override
    public ReservaEntity toEntity(ReservaRequestDto reservaRequestDto, SalaEntity salaEntity) {
        return ReservaEntity.builder()
                .fecha_reserva(reservaRequestDto.fecha_reserva())
                .hora_inicio(reservaRequestDto.hora_inicio())
                .hora_fin(reservaRequestDto.hora_fin())
                .nom_cliente(reservaRequestDto.nom_cliente())
                .sala(salaEntity)
                .build();
    }

    @Override
    public ReservaResponseDto toDto(ReservaEntity reservaEntity) {
        return new ReservaResponseDto(reservaEntity.getNum_reserva(),
                reservaEntity.getFecha_reserva(),
                reservaEntity.getHora_inicio(),
                reservaEntity.getHora_fin(),
                reservaEntity.getNom_cliente(),
                reservaEntity.getSala().getCod_sala(),
                reservaEntity.getSala().getNom_sala());
    }
}
