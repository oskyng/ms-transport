package com.osanzana.mstransportrute.dto.ruta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateRutaRequest {
    @NotNull(message = "El ID es obligatorio")
    private Long id;
    @NotBlank(message = "El nombre de la ruta es obligatorio")
    @Size(max = 100)
    private String nombre;

    @NotBlank(message = "El origen es obligatorio")
    private String origen;

    @NotBlank(message = "El destino es obligatorio")
    private String destino;
}
