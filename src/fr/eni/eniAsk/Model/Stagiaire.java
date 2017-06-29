package fr.eni.eniAsk.Model;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ETY0002
 */
public class Stagiaire extends Personne {

    private Integer idStagiaire;
    private List<Test> tests = new ArrayList<Test>();

    public Integer getIdStagiaire() {
        return idStagiaire;
    }

    public void setIdStagiaire(Integer idStagiaire) {
        this.idStagiaire = idStagiaire;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
    
    
}
