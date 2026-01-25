package com.osanzana.mstransportrute.dto.ubicacion;

import lombok.Data;

@Data
public class UbicacionResponse {
    private Long id;
    private Long idVehiculo;
    private Double latitud;
    private Double longitud;
}
