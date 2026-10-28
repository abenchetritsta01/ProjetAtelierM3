/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetm3;

/**
 *
 * @author Utilisateur
 */
public class Produit {

    private String codeProduit;
    private String dproduit;

    public Produit() {
    }
    
    public Produit(String codeProduit, String dproduit) {
    this.codeProduit = codeProduit;
    this.dproduit = dproduit;
}

    public void afficheProduit() {
    }

    public void modifierProduit() {
    }

    public void supprimerProduit() {
    }
    //getter et setter

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getDproduit() {
        return dproduit;
    }

    public void setDproduit(String dproduit) {
        this.dproduit = dproduit;
    }
    
}