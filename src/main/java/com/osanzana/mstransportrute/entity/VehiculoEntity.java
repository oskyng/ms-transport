package com.osanzana.mstransportrute.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VEHICULO")
@Data
public class VehiculoEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vehiculo_seq"
    )
    @SequenceGenerator(
            name = "vehiculo_seq",
            sequenceName = "SEQ_VEHICULO",
            allocationSize = 1
    )
    @Column(name = "ID_VEHICULO")
    private Long id;

    @Column(name = "PATENTE")
    private String patente;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "ESTADO")
    private String estado;
}
