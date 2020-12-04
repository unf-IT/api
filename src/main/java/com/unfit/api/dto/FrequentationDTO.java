package com.unfit.api.dto;

public class FrequentationDTO {

    private Long idFrequentation;
    private int nombreBaigneur;
    private int nombrePratiquantNautique;
    private int nombreBateaux;

    public FrequentationDTO(){ super();}

    public FrequentationDTO(Long idFrequentation, int nombreBaigneur, int nombrePratiquantNautique, int nombreBateaux) {
        this.idFrequentation = idFrequentation;
        this.nombreBaigneur = nombreBaigneur;
        this.nombrePratiquantNautique = nombrePratiquantNautique;
        this.nombreBateaux = nombreBateaux;
    }

    public Long getIdFrequentation() {
        return idFrequentation;
    }

    public void setIdFrequentation(Long idFrequentation) {
        this.idFrequentation = idFrequentation;
    }

    public int getNombreBaigneur() {
        return nombreBaigneur;
    }

    public void setNombreBaigneur(int nombreBaigneur) {
        this.nombreBaigneur = nombreBaigneur;
    }

    public int getNombrePratiquantNautique() {
        return nombrePratiquantNautique;
    }

    public void setNombrePratiquantNautique(int nombrePratiquantNautique) {
        this.nombrePratiquantNautique = nombrePratiquantNautique;
    }

    public int getNombreBateaux() {
        return nombreBateaux;
    }

    public void setNombreBateaux(int nombreBateaux) {
        this.nombreBateaux = nombreBateaux;
    }

    @Override
    public String toString() {
        return "FrequentationDTO{" +
                "idFrequentation=" + idFrequentation +
                ", nombreBaigneur=" + nombreBaigneur +
                ", nombrePratiquantNautique=" + nombrePratiquantNautique +
                ", nombreBateaux=" + nombreBateaux +
                '}';
    }
}
