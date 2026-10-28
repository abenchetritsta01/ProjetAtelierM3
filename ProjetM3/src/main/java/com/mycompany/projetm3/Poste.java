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

public class Poste extends Equipement {

    private String refPoste;
    private String dPoste;
    private ArrayList<Machine> listeMachines;

    public Poste() {
    }
    
    public Poste(String refPoste, String dPoste,
             ArrayList<Machine> listeMachines) {
    super();
    this.refPoste = refPoste;
    this.dPoste = dPoste;
    this.listeMachines = listeMachines;
}

    public void affichePoste() {
    }

    public void modifierPoste() {
    }

    public void supprimerPoste() {
    }
    //getter et setter

    public String getRefPoste() {
        return refPoste;
    }

    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public ArrayList<Machine> getListeMachines() {
        return listeMachines;
    }

    public void setListeMachines(ArrayList<Machine> listeMachines) {
        this.listeMachines = listeMachines;
    }
    
}