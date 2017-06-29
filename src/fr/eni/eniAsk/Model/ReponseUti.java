package fr.eni.eniAsk.Model;


import fr.eni.eniAsk.Model.Question;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ETY0007
 */
class ReponseUti {

    private Integer idReponse;
    private String libelleReponse;
    private String lienImage;
    private Integer position;
    private Boolean isValid;
    private Question idQuestion;
    private ReponseSys reponseSys;

    public Integer getIdReponse() {
        return idReponse;
    }

    public void setIdReponse(Integer idReponse) {
        this.idReponse = idReponse;
    }

    public String getLibelleReponse() {
        return libelleReponse;
    }

    public void setLibelleReponse(String libelleReponse) {
        this.libelleReponse = libelleReponse;
    }

    public String getLienImage() {
        return lienImage;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Question getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Question idQuestion) {
        this.idQuestion = idQuestion;
    }

    public ReponseSys getReponseSys() {
        return reponseSys;
    }

    public void setReponseSys(ReponseSys reponseSys) {
        this.reponseSys = reponseSys;
    }
    
    

    @Override
    public String toString() {
        return "ReponseUti{" + "idReponse=" + idReponse + ", libelleReponse=" + libelleReponse + ", lienImage=" + lienImage + ", position=" + position + ", isValid=" + isValid + ", idQuestion=" + idQuestion + ", reponseSys=" + reponseSys + '}';
    }

    public ReponseUti() {
    }

    
    
    public ReponseUti(Integer idReponse, String libelleReponse, String lienImage, Integer position, Boolean isValid, Question idQuestion, ReponseSys reponseSys) {
        this.idReponse = idReponse;
        this.libelleReponse = libelleReponse;
        this.lienImage = lienImage;
        this.position = position;
        this.isValid = isValid;
        this.idQuestion = idQuestion;
        this.reponseSys = reponseSys;
    }

}
