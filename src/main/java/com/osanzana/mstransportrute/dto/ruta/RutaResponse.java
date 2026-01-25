package com.osanzana.mstransportrute.dto.ruta;

import lombok.Data;

@Data
public class RutaResponse {
    private Long id;
    private String nombre;
    private String origen;
    private String destino;
}
