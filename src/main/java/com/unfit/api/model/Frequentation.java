package com.unfit.api.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Frequentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFrequentation;

    @OneToOne(mappedBy = "frequentation")
    private Session session;
    private int nombreBaigneur;
    private int nombrePratiquantNautique;
    private int nombreBateaux;


}
