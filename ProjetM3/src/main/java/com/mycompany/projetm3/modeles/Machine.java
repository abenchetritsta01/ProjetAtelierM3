/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetm3.modeles;

/**
 *
 * @author Utilisateur
 */
public class Machine extends Equipement {

    // refMachine et dMachine sont maintenant hérités de Equipement (refEquipement, dEquipement)
    private String type;
    private float cout;   // coût horaire
    private float x;
    private float y;
    private EtatMachine etat;

    public Machine() {
        super();
        this.etat = EtatMachine.DISPONIBLE;
    }

    public Machine(String refMachine, String dMachine,
                   String type, float cout, float x, float y, EtatMachine etat) {
        super(refMachine, dMachine);   // on transmet la référence et la désignation à la classe mère
        this.type = type;
        this.cout = cout;
        this.x = x;
        this.y = y;
        this.etat = etat;
    }

    @Override
    public float getCoutHoraire() {
        return cout;
    }

    public void afficheMachine() {
        System.out.println("Machine " + getRefMachine() + " (" + getdMachine() + "), type = " + type
                + ", coût horaire = " + cout + ", position = (" + x + ", " + y + "), état = " + etat);
    }

    public void modifierMachine() {
        // à faire
    }

    public void supprimerMachine() {
        // à faire
    }

    //getter et setter
    public String getRefMachine() {
        return getRefEquipement();
    }

    public void setRefMachine(String refMachine) {
        setRefEquipement(refMachine);
    }

    public String getdMachine() {
        return getdEquipement();
    }

    public void setdMachine(String dMachine) {
        setdEquipement(dMachine);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCout() {
        return cout;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public EtatMachine getEtat() {
        return etat;
    }

    public void setEtat(EtatMachine etat) {
        this.etat = etat;
    }
}