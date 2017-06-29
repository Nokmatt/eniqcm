package fr.eni.eniAsk.Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ETY0007
 */
public class Theme {
    private Integer idTheme;
    private String libelleTheme;
    private String description;
    private Integer nbQuestions;

    public Integer getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(Integer idTheme) {
        this.idTheme = idTheme;
    }

    public String getLibelleTheme() {
        return libelleTheme;
    }

    public void setLibelleTheme(String libelleTheme) {
        this.libelleTheme = libelleTheme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbQuestions() {
        return nbQuestions;
    }

    public void setNbQuestions(Integer nbQuestions) {
        this.nbQuestions = nbQuestions;
    }

    public Theme() {
    }

    public Theme(Integer idTheme, String libelleTheme, String description, Integer nbQuestions) {
        this.idTheme = idTheme;
        this.libelleTheme = libelleTheme;
        this.description = description;
        this.nbQuestions = nbQuestions;
    }
}
