/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.eni.eniAsk.Model;

import fr.eni.eniAsk.Model.Theme;
import fr.eni.eniAsk.Model.ReponseSys;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ETY0007
 */
public class Question {

    private String enonce;
    private Integer idQuestion;
    private String lienImage;
    private String typeReponse;
    private Integer nbReponse;
    private Integer nbBonnesReponses;
    private Theme idTheme;
    private ArrayList<ReponseSys> reponsesSysList;

    public ArrayList<ReponseSys> getReponsesSysList() {
        return reponsesSysList;
    }

    public void setReponsesSysList(ArrayList<ReponseSys> reponsesSysList) {
        this.reponsesSysList = reponsesSysList;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public Integer getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getLienImage() {
        return lienImage;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

    public String getTypeReponse() {
        return typeReponse;
    }

    public void setTypeReponse(String typeReponse) {
        this.typeReponse = typeReponse;
    }

    public Integer getNbReponse() {
        return nbReponse;
    }

    public void setNbReponse(Integer nbReponse) {
        this.nbReponse = nbReponse;
    }

    public Integer getNbBonnesReponses() {
        return nbBonnesReponses;
    }

    public void setNbBonnesReponses(Integer nbBonnesReponses) {
        this.nbBonnesReponses = nbBonnesReponses;
    }

    public Theme getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(Theme idTheme) {
        this.idTheme = idTheme;
    }

    @Override
    public String toString() {
        return "Question{" + "enonce=" + enonce + ", idQuestion=" + idQuestion + ", lienImage=" + lienImage + ", typeReponse=" + typeReponse + ", nbReponse=" + nbReponse + ", nbBonnesReponses=" + nbBonnesReponses + ", idTheme=" + idTheme + '}';
    }
    
    public Question() {
        super();
    }
    
    public Question(String enonce, Integer idQuestion, String lienImage, String typeReponse, Integer nbReponse, Integer nbBonnesReponses, Theme idTheme) {
        this.enonce = enonce;
        this.idQuestion = idQuestion;
        this.lienImage = lienImage;
        this.typeReponse = typeReponse;
        this.nbReponse = nbReponse;
        this.nbBonnesReponses = nbBonnesReponses;
        this.idTheme = idTheme;
    }


}
