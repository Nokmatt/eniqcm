package fr.eni.eniAsk.Model;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ETY0002
 */
public class Test {

    private Integer idTest;
    private Integer nbrQuestion;
    private Date dateCreation;
    private String libelleTest;
    private Integer tempsTest;
    private TypeTest typeTest;

    public Integer getIdTest() {
        return idTest;
    }

    public void setIdTest(Integer idTest) {
        this.idTest = idTest;
    }

    public Integer getNbrQuestion() {
        return nbrQuestion;
    }

    public void setNbrQuestion(Integer nbrQuestion) {
        this.nbrQuestion = nbrQuestion;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getLibelleTest() {
        return libelleTest;
    }

    public void setLibelleTest(String libelleTest) {
        this.libelleTest = libelleTest;
    }

    public Integer getTempsTest() {
        return tempsTest;
    }

    public void setTempsTest(Integer tempsTest) {
        this.tempsTest = tempsTest;
    }

    public TypeTest getTypeTest() {
        return typeTest;
    }

    public void setTypeTest(TypeTest typeTest) {
        this.typeTest = typeTest;
    }

}
