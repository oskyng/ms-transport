package com.osanzana.mstransportrute.service;

import com.osanzana.mstransportrute.dto.ruta.CreateRutaRequest;
import com.osanzana.mstransportrute.dto.ruta.RutaResponse;
import com.osanzana.mstransportrute.dto.ruta.UpdateRutaRequest;

import java.util.List;

public interface IRutaService {
    List<RutaResponse> getAllRutas();
    RutaResponse getRutaById(Long id);
    RutaResponse createRuta(CreateRutaRequest request);
    RutaResponse updateRuta(UpdateRutaRequest request);
    void deleteRuta(Long id);
}
