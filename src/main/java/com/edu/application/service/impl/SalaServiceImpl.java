package com.edu.application.service.impl;

import com.edu.application.mapper.SalaMapper;
import com.edu.application.service.SalaService;
import com.edu.domain.model.SalaEntity;
import com.edu.domain.repository.SalaRepository;
import com.edu.web.dto.request.SalaRequestDto;
import com.edu.web.dto.response.SalaResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SalaServiceImpl implements SalaService {
    private final SalaRepository salaRepository;
    private final SalaMapper salaMapper;

    @Transactional
    @Override
    public SalaResponseDto crear(SalaRequestDto salaRequestDto) {
        SalaEntity salaEntity = salaMapper.toEntity(salaRequestDto);
        SalaEntity salaRegistrada = salaRepository.save(salaEntity);
        return salaMapper.toDto(salaRegistrada);
    }

    @Override
    public List<SalaResponseDto> listar() {
        return salaRepository.findAll()
                .stream().map(salaMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public SalaResponseDto obtenerPorId(Long id) {

        SalaEntity salaEntity= salaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("La sala no existe"));
        return salaMapper.toDto(salaEntity);
    }

    @Override
    public void eliminarSala(Long id) {
        salaRepository.deleteById(id);
    }


}
