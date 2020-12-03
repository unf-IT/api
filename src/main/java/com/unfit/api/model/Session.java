package com.unfit.api.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSession;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "frequentation_id", referencedColumnName = "idFrequentation")
    private Frequentation frequentation;
    private Long idWaterman;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prelevement_id", referencedColumnName = "idPrelevement")
    private Prelevement prelevement;


}
