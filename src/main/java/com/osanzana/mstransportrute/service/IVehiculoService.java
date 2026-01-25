package com.osanzana.mstransportrute.service;

import com.osanzana.mstransportrute.dto.vehiculo.CreateVehiculoRequest;
import com.osanzana.mstransportrute.dto.vehiculo.UpdateVehiculoRequest;
import com.osanzana.mstransportrute.dto.vehiculo.VehiculoResponse;

import java.util.List;

public interface IVehiculoService {
    List<VehiculoResponse> getAllVehiculos();
    VehiculoResponse getVehiculoById(Long id);
    VehiculoResponse createVehiculo(CreateVehiculoRequest request);
    VehiculoResponse updateVehiculo(UpdateVehiculoRequest request);
    void deleteVehiculo(Long id);
}
