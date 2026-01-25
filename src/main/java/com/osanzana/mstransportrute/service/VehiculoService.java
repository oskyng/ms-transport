package com.osanzana.mstransportrute.service;

import com.osanzana.mstransportrute.dto.vehiculo.CreateVehiculoRequest;
import com.osanzana.mstransportrute.dto.vehiculo.UpdateVehiculoRequest;
import com.osanzana.mstransportrute.dto.vehiculo.VehiculoResponse;
import com.osanzana.mstransportrute.entity.VehiculoEntity;
import com.osanzana.mstransportrute.exception.ResourceNotFoundException;
import com.osanzana.mstransportrute.repository.IVehiculoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class VehiculoService implements IVehiculoService {

    private final IVehiculoRepository vehiculoRepository;

    public VehiculoService(IVehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @Override
    public List<VehiculoResponse> getAllVehiculos() {
        log.info("getAllVehiculos");
        List<VehiculoResponse> response = new ArrayList<>();

        List<VehiculoEntity> vehiculoEntities = vehiculoRepository.findAll();
        for (VehiculoEntity vehiculoEntity : vehiculoEntities) {
            response.add(toResponse(vehiculoEntity));
        }

        return response;
    }

    @Override
    public VehiculoResponse getVehiculoById(Long id) {
        log.info("Buscando vehiculo por id: {}", id);
        VehiculoEntity vehiculo = vehiculoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Vehículo no encontrado"));

        return toResponse(vehiculo);
    }

    @Override
    public VehiculoResponse createVehiculo(CreateVehiculoRequest request) {
        log.info("Creando vehiculo: {}", request.toString());

        VehiculoEntity vehiculo = new VehiculoEntity();
        vehiculo.setPatente(request.getPatente());
        vehiculo.setTipo(request.getTipo());
        vehiculo.setEstado(request.getEstado());

        return toResponse(vehiculoRepository.save(vehiculo));
    }

    @Override
    public VehiculoResponse updateVehiculo(UpdateVehiculoRequest request) {
        log.info("Actualizando vehiculo por id: {}", request.getId());
        VehiculoEntity foundVehiculo = vehiculoRepository.findById(request.getId()).orElseThrow(() -> new ResourceNotFoundException("Vehículo no encontrado con ID: " + request.getId()));

        if (request.getPatente() != null) foundVehiculo.setPatente(request.getPatente());
        if (request.getTipo() != null) foundVehiculo.setTipo(request.getTipo());
        if (request.getEstado() != null) foundVehiculo.setEstado(request.getEstado());

        return toResponse(vehiculoRepository.save(foundVehiculo));
    }

    @Override
    public void deleteVehiculo(Long id) {
        log.info("Eliminando vehiculo por id: {}", id);
        VehiculoEntity vehiculo = vehiculoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Vehículo no encontrado"));
        vehiculoRepository.delete(vehiculo);
    }

    private VehiculoResponse toResponse(VehiculoEntity entity) {
        VehiculoResponse vehiculoResponse = new VehiculoResponse();
        vehiculoResponse.setId(entity.getId());
        vehiculoResponse.setPatente(entity.getPatente());
        vehiculoResponse.setTipo(entity.getTipo());
        vehiculoResponse.setEstado(entity.getEstado());
        return vehiculoResponse;
    }
}
