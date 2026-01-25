package com.osanzana.mstransportrute.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "UBICACION")
@Data
public class UbicacionEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ubicacion_seq"
    )
    @SequenceGenerator(
            name = "ubicacion_seq",
            sequenceName = "SEQ_UBICACION",
            allocationSize = 1
    )
    @Column(name = "ID_UBICACION")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_VEHICULO")
    private VehiculoEntity vehiculo;

    private Double latitud;
    private Double longitud;
    private LocalDateTime fecha;
}
