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
public class Section {
    
    Integer idSection;
    Integer idTest;
    Integer idTheme;
    Integer nbQuestions;

    public Integer getIdSection() {
        return idSection;
    }

    public void setIdSection(Integer idSection) {
        this.idSection = idSection;
    }

    public Integer getIdTest() {
        return idTest;
    }

    public void setIdTest(Integer idTest) {
        this.idTest = idTest;
    }

    public Integer getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(Integer idTheme) {
        this.idTheme = idTheme;
    }

    public Integer getNbQuestions() {
        return nbQuestions;
    }

    public void setNbQuestions(Integer nbQuestions) {
        this.nbQuestions = nbQuestions;
    }
    
    public Section() {
    }
    
    public Section(Integer idSection, Integer idTest, Integer idTheme, Integer nbQuestions) {
        this.idSection = idSection;
        this.idTest = idTest;
        this.idTheme = idTheme;
        this.nbQuestions = nbQuestions;
    }
}
