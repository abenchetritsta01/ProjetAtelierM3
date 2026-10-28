/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetm3;

/**
 *
 * @author Utilisateur
 */
import java.util.ArrayList;

public class Gamme {

    private String refGamme;
    private ArrayList<Operation> listeOperations;
    private ArrayList<Equipement> listeEquipements;

    public Gamme() {
    }
    
    public Gamme(String refGamme,
             ArrayList<Operation> listeOperations,
             ArrayList<Equipement> listeEquipements) {
    this.refGamme = refGamme;
    this.listeOperations = listeOperations;
    this.listeEquipements = listeEquipements;
}

    public void creerGamme() {
    }

    public void modifierGamme() {
    }

    public void supprimerGamme() {
    }

    public void afficheGamme() {
    }

    public float coutGamme() {
        return 0;//à param
    }

    public float dureeGamme() {
        return 0;//à param
    }
    //getter et setter

    public String getRefGamme() {
        return refGamme;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public ArrayList<Operation> getListeOperations() {
        return listeOperations;
    }

    public void setListeOperations(ArrayList<Operation> listeOperations) {
        this.listeOperations = listeOperations;
    }

    public ArrayList<Equipement> getListeEquipements() {
        return listeEquipements;
    }

    public void setListeEquipements(ArrayList<Equipement> listeEquipements) {
        this.listeEquipements = listeEquipements;
    }
    
}
