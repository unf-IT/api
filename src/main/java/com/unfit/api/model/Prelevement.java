package com.unfit.api.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="PRELEVEMENT")
public class Prelevement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idPrelevement;


    private String pratiqueSportif;
    private Boolean cremeSolaire;
    private Boolean deodorant;
    private Boolean getCremeSolaire;
    private Boolean cremeHydratante;
    private Boolean maquillage;
    private Boolean essence;
    private Boolean cigarette;
    private Boolean pesticide;
    private Boolean peinture;
    private String autre;

}
