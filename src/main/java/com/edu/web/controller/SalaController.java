package com.edu.web.controller;


import com.edu.application.service.SalaService;
import com.edu.web.dto.request.SalaRequestDto;
import com.edu.web.dto.response.SalaResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salas")
@RequiredArgsConstructor
public class SalaController {
    private final SalaService salaService;

    @PostMapping
    public ResponseEntity<SalaResponseDto> crear(@RequestBody SalaRequestDto salaRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(salaService.crear(salaRequestDto));
    }

    @GetMapping
    public ResponseEntity<List<SalaResponseDto>> listar(){
        return  ResponseEntity.ok(salaService.listar());
    }



    @GetMapping("/{id}")
    public ResponseEntity<SalaResponseDto> obtenerPorId    (@PathVariable Long id) {
        return ResponseEntity.ok(salaService.obtenerPorId(id));
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar    (@PathVariable Long id) {
        salaService.eliminarSala(id);
        return ResponseEntity.noContent().build();
    }

}
