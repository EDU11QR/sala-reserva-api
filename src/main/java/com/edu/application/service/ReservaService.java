package com.edu.application.service;

import com.edu.web.dto.request.ReservaRequestDto;
import com.edu.web.dto.response.ReservaResponseDto;

import java.util.List;

public interface ReservaService {
    ReservaResponseDto crear(ReservaRequestDto reservaRequestDto);
    List<ReservaResponseDto> listar();
    ReservaResponseDto obtenerPorId(Long id);
    void eliminarReserva(Long id);

}
