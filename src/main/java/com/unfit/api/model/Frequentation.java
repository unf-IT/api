package com.unfit.api.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="FREQUENTATION")
public class Frequentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long idFrequentation;

    private int nombreBaigneur;
    private int nombrePratiquantNautique;
    private int nombreBateaux;


}
