package com.edu.application.mapper;

import com.edu.domain.model.SalaEntity;
import com.edu.web.dto.request.SalaRequestDto;
import com.edu.web.dto.response.SalaResponseDto;

public interface SalaMapper {
    SalaEntity toEntity(SalaRequestDto salaRequestDto);
    SalaResponseDto toDto(SalaEntity salaEntity);
}
