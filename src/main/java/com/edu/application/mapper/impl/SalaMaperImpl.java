package com.edu.application.mapper.impl;

import com.edu.application.mapper.SalaMapper;
import com.edu.domain.model.SalaEntity;
import com.edu.web.dto.request.SalaRequestDto;
import com.edu.web.dto.response.SalaResponseDto;
import org.springframework.stereotype.Component;

@Component
public class SalaMaperImpl implements SalaMapper {
    @Override
    public SalaEntity toEntity(SalaRequestDto salaRequestDto) {
        return SalaEntity.builder()
                .nom_sala(salaRequestDto.nom_sala())
                .capacidad(salaRequestDto.capacidad())
                .build();
    }

    @Override
    public SalaResponseDto toDto(SalaEntity salaEntity) {
        return new SalaResponseDto(salaEntity.getCod_sala(),
                salaEntity.getNom_sala(),
                salaEntity.getCapacidad());
    }
}
