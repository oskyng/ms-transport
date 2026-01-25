package com.osanzana.mstransportrute.dto.vehiculo;

import lombok.Data;

@Data
public class VehiculoResponse {
    private long id;
    private String patente;
    private String tipo;
    private String estado;
}
