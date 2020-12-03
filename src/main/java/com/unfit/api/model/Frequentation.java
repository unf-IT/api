package com.unfit.api.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Frequentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFrequentation;
    private int nombreBaigneur;
    private int nombrePratiquantNautique;
    private int nombreBateaux;

}
