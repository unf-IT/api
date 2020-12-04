package com.unfit.api.dto;

public class SessionDTO {

    private FrequentationDTO idFrequentation;
    private WatermanDTO idWaterman;
    private PrelevementDTO idPrelevement;

    public SessionDTO(){
        super();
    }

    public FrequentationDTO getIdFrequentation() {
        return idFrequentation;
    }

    public void setIdFrequentation(FrequentationDTO idFrequentation) {
        this.idFrequentation = idFrequentation;
    }

    public WatermanDTO getIdWaterman() {
        return idWaterman;
    }

    public void setIdWaterman(WatermanDTO idWaterman) {
        this.idWaterman = idWaterman;
    }

    public PrelevementDTO getIdPrelevement() {
        return idPrelevement;
    }

    public void setIdPrelevement(PrelevementDTO idPrelevement) {
        this.idPrelevement = idPrelevement;
    }
}
