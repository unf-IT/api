package com.unfit.api.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSession;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="FREQUENTATION_ID")
    private Frequentation frequentation;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="WATERMAN_ID")
    private Waterman waterman;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name="PRELEVEMENT_ID")
    private Prelevement prelevement;


}
