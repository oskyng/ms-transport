package com.osanzana.mstransportrute.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "RUTA")
@Data
public class RutaEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ruta_seq"
    )
    @SequenceGenerator(
            name = "ruta_seq",
            sequenceName = "SEQ_RUTA",
            allocationSize = 1
    )
    @Column(name = "ID_RUTA")
    private Long id;

    private String nombre;
    private String origen;
    private String destino;
}
