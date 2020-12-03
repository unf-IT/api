package com.unfit.api.dto;

public class PrelevementDTO {

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

    public PrelevementDTO(Long idPrelevement, String pratiqueSportif, Boolean cremeSolaire, Boolean deodorant, Boolean getCremeSolaire, Boolean cremeHydratante, Boolean maquillage, Boolean essence, Boolean cigarette, Boolean pesticide, Boolean peinture, String autre) {
        this.idPrelevement = idPrelevement;
        this.pratiqueSportif = pratiqueSportif;
        this.cremeSolaire = cremeSolaire;
        this.deodorant = deodorant;
        this.getCremeSolaire = getCremeSolaire;
        this.cremeHydratante = cremeHydratante;
        this.maquillage = maquillage;
        this.essence = essence;
        this.cigarette = cigarette;
        this.pesticide = pesticide;
        this.peinture = peinture;
        this.autre = autre;
    }

    public Long getIdPrelevement() {
        return idPrelevement;
    }

    public void setIdPrelevement(Long idPrelevement) {
        this.idPrelevement = idPrelevement;
    }

    public String getPratiqueSportif() {
        return pratiqueSportif;
    }

    public void setPratiqueSportif(String pratiqueSportif) {
        this.pratiqueSportif = pratiqueSportif;
    }

    public Boolean getCremeSolaire() {
        return cremeSolaire;
    }

    public void setCremeSolaire(Boolean cremeSolaire) {
        this.cremeSolaire = cremeSolaire;
    }

    public Boolean getDeodorant() {
        return deodorant;
    }

    public void setDeodorant(Boolean deodorant) {
        this.deodorant = deodorant;
    }

    public Boolean getGetCremeSolaire() {
        return getCremeSolaire;
    }

    public void setGetCremeSolaire(Boolean getCremeSolaire) {
        this.getCremeSolaire = getCremeSolaire;
    }

    public Boolean getCremeHydratante() {
        return cremeHydratante;
    }

    public void setCremeHydratante(Boolean cremeHydratante) {
        this.cremeHydratante = cremeHydratante;
    }

    public Boolean getMaquillage() {
        return maquillage;
    }

    public void setMaquillage(Boolean maquillage) {
        this.maquillage = maquillage;
    }

    public Boolean getEssence() {
        return essence;
    }

    public void setEssence(Boolean essence) {
        this.essence = essence;
    }

    public Boolean getCigarette() {
        return cigarette;
    }

    public void setCigarette(Boolean cigarette) {
        this.cigarette = cigarette;
    }

    public Boolean getPesticide() {
        return pesticide;
    }

    public void setPesticide(Boolean pesticide) {
        this.pesticide = pesticide;
    }

    public Boolean getPeinture() {
        return peinture;
    }

    public void setPeinture(Boolean peinture) {
        this.peinture = peinture;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }

    @Override
    public String toString() {
        return "PrelevementDTO{" +
                "idPrelevement=" + idPrelevement +
                ", pratiqueSportif='" + pratiqueSportif + '\'' +
                ", cremeSolaire=" + cremeSolaire +
                ", deodorant=" + deodorant +
                ", getCremeSolaire=" + getCremeSolaire +
                ", cremeHydratante=" + cremeHydratante +
                ", maquillage=" + maquillage +
                ", essence=" + essence +
                ", cigarette=" + cigarette +
                ", pesticide=" + pesticide +
                ", peinture=" + peinture +
                ", autre='" + autre + '\'' +
                '}';
    }
}
