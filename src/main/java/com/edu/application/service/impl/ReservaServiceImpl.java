package com.edu.application.service.impl;

import com.edu.application.mapper.ReservaMapper;
import com.edu.application.service.ReservaService;
import com.edu.domain.model.ReservaEntity;
import com.edu.domain.model.SalaEntity;
import com.edu.domain.repository.ReservaRepository;
import com.edu.domain.repository.SalaRepository;
import com.edu.web.dto.request.ReservaRequestDto;
import com.edu.web.dto.response.ReservaResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository reservaRepository;
    private final ReservaMapper reservaMapper;
    private final SalaRepository salaRepository;


    @Override
    public ReservaResponseDto crear(ReservaRequestDto reservaRequestDto) {
        SalaEntity salaEntity = salaRepository.findById(reservaRequestDto.cod_sala())
                .orElseThrow(() -> new RuntimeException("No se encontro el codigo de la sala"));
        ReservaEntity reservaEntity = reservaMapper.toEntity(reservaRequestDto, salaEntity);
        ReservaEntity reservaRegistrada = reservaRepository.save(reservaEntity);
        return reservaMapper.toDto(reservaRegistrada);
    }

    @Override
    public List<ReservaResponseDto> listar() {
        return reservaRepository.findAll()
                .stream().map(reservaMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ReservaResponseDto obtenerPorId(Long id) {
        ReservaEntity reservaEntity = reservaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reserva no Encontrada"));
        return reservaMapper.toDto(reservaEntity);
    }

    @Override
    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
