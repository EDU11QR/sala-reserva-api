package com.edu.application.mapper;

import com.edu.domain.model.ReservaEntity;
import com.edu.domain.model.SalaEntity;
import com.edu.web.dto.request.ReservaRequestDto;
import com.edu.web.dto.response.ReservaResponseDto;

public interface ReservaMapper {

    ReservaEntity toEntity(ReservaRequestDto reservaRequestDto, SalaEntity salaEntity);
    ReservaResponseDto toDto(ReservaEntity reservaEntity);

}
