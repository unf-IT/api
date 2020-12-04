package com.unfit.api.dto;

import java.sql.Time;
import java.time.Duration;
import java.util.Date;

public class WatermanDTO {

    private Long idWaterman;

    private String ville;
    private String spot;
    private String nomWaterman;
    private Date date;
    private Time heureDebut;
    private Time heureFin;
    private Duration dureeImmersion;

    public WatermanDTO(){ super();}

    public WatermanDTO(Long idWaterman, String ville, String spot, String nomWaterman, Date date, Time heureDebut, Time heureFin, Duration dureeImmersion) {
        this.idWaterman = idWaterman;
        this.ville = ville;
        this.spot = spot;
        this.nomWaterman = nomWaterman;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.dureeImmersion = dureeImmersion;
    }

    public Long getIdWaterman() {
        return idWaterman;
    }

    public void setIdWaterman(Long idWaterman) {
        this.idWaterman = idWaterman;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getNomWaterman() {
        return nomWaterman;
    }

    public void setNomWaterman(String nomWaterman) {
        this.nomWaterman = nomWaterman;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Time heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Time getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Time heureFin) {
        this.heureFin = heureFin;
    }

    public Duration getDureeImmersion() {
        return dureeImmersion;
    }

    public void setDureeImmersion(Duration dureeImmersion) {
        this.dureeImmersion = dureeImmersion;
    }

    @Override
    public String toString() {
        return "WatermanDTO{" +
                "idWaterman=" + idWaterman +
                ", ville='" + ville + '\'' +
                ", spot='" + spot + '\'' +
                ", nomWaterman='" + nomWaterman + '\'' +
                ", date=" + date +
                ", heureDebut=" + heureDebut +
                ", heureFin=" + heureFin +
                ", dureeImmersion=" + dureeImmersion +
                '}';
    }

}
