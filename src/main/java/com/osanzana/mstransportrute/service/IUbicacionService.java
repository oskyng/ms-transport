package com.osanzana.mstransportrute.service;

import com.osanzana.mstransportrute.dto.ubicacion.UbicacionResponse;

import java.util.List;

public interface IUbicacionService {
    List<UbicacionResponse> getAllUbicaciones();
    UbicacionResponse getUbicacionById(Long id);
    UbicacionResponse createUbicacion(UbicacionResponse ubicacionDto);
    UbicacionResponse updateUbicacion(UbicacionResponse ubicacionDto);
    void deleteUbicacion(Long id);
}
