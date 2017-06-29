

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
public class ReponseSys {
    private Integer idReponse;
    private String libelleReponse;
    private String lienImage;
    private Integer position;
    private Boolean isValid;
    private Question idQuestion;
    private ReponseUti reponseUtilisateur;

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

    public ReponseUti getReponseUtilisateur() {
        return reponseUtilisateur;
    }

    public void setReponseUtilisateur(ReponseUti reponseUtilisateur) {
        this.reponseUtilisateur = reponseUtilisateur;
    }    

    public ReponseSys() {
        super();
    }
    
    public ReponseSys(Integer idReponse, String libelleReponse, String lienImage, Integer position, Boolean isValid, Question idQuestion, ReponseUti reponseUtilisateur) {
        this.idReponse = idReponse;
        this.libelleReponse = libelleReponse;
        this.lienImage = lienImage;
        this.position = position;
        this.isValid = isValid;
        this.idQuestion = idQuestion;
        this.reponseUtilisateur = reponseUtilisateur;
    }


}
