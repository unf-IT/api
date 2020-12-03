package com.unfit.api.dto;

public class SessionDTO {

    private Long idFrequentation;
    private Long idWaterman;
    private Long idPrelevement;

    public SessionDTO(){
        super();
    }

    public Long getIdFrequentation() {
        return idFrequentation;
    }

    public void setIdFrequentation(Long idFrequentation) {
        this.idFrequentation = idFrequentation;
    }

    public Long getIdWaterman() {
        return idWaterman;
    }

    public void setIdWaterman(Long idWaterman) {
        this.idWaterman = idWaterman;
    }

    public Long getIdPrelevement() {
        return idPrelevement;
    }

    public void setIdPrelevement(Long idPrelevement) {
        this.idPrelevement = idPrelevement;
    }

    @Override
    public String toString() {
        return "SessionDTO{" +
                "idFrequentation=" + idFrequentation +
                ", idWaterman=" + idWaterman +
                ", idPrelevement=" + idPrelevement +
                '}';
    }
}
