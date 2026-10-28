package com.mycompany.projetm3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Utilisateur
 */
public class Equipement {

    private String refEquipement;
    private String dEquipement;

    public Equipement() {
    }
    
    public Equipement(String refEquipement,
                      String dEquipement) {
        this.refEquipement = refEquipement;
        this.dEquipement = dEquipement;
    }
    //getter
    public String getRefEquipement() {
        return refEquipement;
    }

    public String getdEquipement() {
        return dEquipement;
    }
    //setter
    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }

    public void setdEquipement(String dEquipement) {
        this.dEquipement = dEquipement;
    }

}