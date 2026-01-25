package com.osanzana.mstransportrute.dto.vehiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateVehiculoRequest {
    @NotNull(message = "El ID es obligatorio")
    private long id;

    @NotBlank(message = "La patente es obligatoria")
    @Size(max = 10, message = "La patente no puede exceder 10 caracteres")
    @Pattern(regexp = "^[A-Z0-9-]+$", message = "La patente solo puede contener letras mayúsculas y números")
    private String patente;

    @NotBlank(message = "El tipo de vehículo es obligatorio")
    private String tipo;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;
}
