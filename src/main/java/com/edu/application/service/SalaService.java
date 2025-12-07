package com.edu.application.service;

import com.edu.web.dto.request.SalaRequestDto;
import com.edu.web.dto.response.ReservaResponseDto;
import com.edu.web.dto.response.SalaResponseDto;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface SalaService {
    SalaResponseDto crear(SalaRequestDto salaRequestDto);
    List<SalaResponseDto> listar();
    SalaResponseDto obtenerPorId(Long id);
    void eliminarSala(Long id);
}
