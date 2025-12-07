package com.edu.web.controller;

import com.edu.application.service.ReservaService;
import com.edu.web.dto.request.ReservaRequestDto;
import com.edu.web.dto.response.ReservaResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
@RequiredArgsConstructor
public class ReservaController {
    private final ReservaService reservaService;

    @PostMapping
    public ResponseEntity<ReservaResponseDto> crear
            (@RequestBody ReservaRequestDto reservaRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(reservaService.crear(reservaRequestDto));
    }

    @GetMapping
    public ResponseEntity<List<ReservaResponseDto>> listar
            (){
        return ResponseEntity.ok(reservaService.listar());
    }


    @GetMapping("/{id}")
    public ResponseEntity<ReservaResponseDto    > obtenerPorId(@PathVariable Long id){
        return ResponseEntity.ok(reservaService.obtenerPorId(id));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar (@PathVariable Long id){
        reservaService.eliminarReserva(id);
        return ResponseEntity.noContent().build();
    }


}
