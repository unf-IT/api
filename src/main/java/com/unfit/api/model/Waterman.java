package com.unfit.api.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.Duration;
import java.util.Date;

@Entity
@Data
@Table(name="WATERMAN")
public class Waterman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idWaterman;


    private String ville;
    private String spot;
    private String nomWaterman;
    private Date date;
    private Time heureDebut;
    private Time heureFin;
    private Duration dureeImmersion;

}
