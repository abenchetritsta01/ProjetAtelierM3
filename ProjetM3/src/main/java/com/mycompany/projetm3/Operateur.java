/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetm3;

/**
 *
 * @author Utilisateur
 */
public class Operateur {

    private String code;
    private String nom;
    private String prenom;
    private String competences;
    private boolean occupe;

    public Operateur() {
    }
    
    public Operateur(String code, String nom, String prenom,
                String competences, boolean occupe) {
    this.code = code;
    this.nom = nom;
    this.prenom = prenom;
    this.competences = competences;
    this.occupe = occupe;
}
    //getter et setter

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCompetences() {
        return competences;
    }

    public void setCompetences(String competences) {
        this.competences = competences;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }
    
}