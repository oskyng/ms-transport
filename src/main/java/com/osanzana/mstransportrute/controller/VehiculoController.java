package com.osanzana.mstransportrute.controller;

import com.osanzana.mstransportrute.dto.vehiculo.CreateVehiculoRequest;
import com.osanzana.mstransportrute.dto.vehiculo.UpdateVehiculoRequest;
import com.osanzana.mstransportrute.dto.vehiculo.VehiculoResponse;
import com.osanzana.mstransportrute.service.VehiculoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
@AllArgsConstructor
@Tag(name = "Vehículos", description = "Gestión de vehículos del sistema")
public class VehiculoController {
    private final VehiculoService service;

    @GetMapping
    @Operation(summary = "Listar vehículos")
    public List<VehiculoResponse> listar() {
        return service.getAllVehiculos();
    }

    @PostMapping
    @Operation(summary = "Crear vehículo")
    public ResponseEntity<VehiculoResponse> crear(
            @Valid @RequestBody CreateVehiculoRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.createVehiculo(request));
    }

    @PutMapping
    @Operation(summary = "Actualizar vehículo")
    public VehiculoResponse actualizar(
            @Valid @RequestBody UpdateVehiculoRequest request) {
        return service.updateVehiculo(request);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar vehículo")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        service.deleteVehiculo(id);
    }
}
