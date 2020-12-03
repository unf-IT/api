package com.unfit.api.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.Duration;
import java.util.Date;

@Entity
@Data
@Table
public class Waterman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWaterman;

    @OneToOne(mappedBy = "waterman")
    private Session session;

    private String ville;
    private String spot;
    private String nomWaterman;
    private Date date;
    private Time heureDebut;
    private Time heureFin;
    private Duration dureeImmersion;

}
