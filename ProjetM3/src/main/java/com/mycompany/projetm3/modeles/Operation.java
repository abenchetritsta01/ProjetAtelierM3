/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetm3.modeles;

/**
 *
 * @author Utilisateur
 */
public class Operation {

    private String refOperation;
    private String dOperation;
    private Equipement equipement;     // la machine ou le poste qui réalise l'opération
    private float dureeOpreration;     // durée en heures

    public Operation() {
    }

    public Operation(String refOperation, String dOperation,
                     Equipement equipement, float dureeOpreration) {
        this.refOperation = refOperation;
        this.dOperation = dOperation;
        this.equipement = equipement;
        this.dureeOpreration = dureeOpreration;
    }

    // Coût de l'opération = coût horaire de l'équipement x durée de l'opération
    public float getCout() {
        if (equipement == null) {
            return 0;
        }
        return equipement.getCoutHoraire() * dureeOpreration;
    }

    //getter et setter
    public String getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(String refOperation) {
        this.refOperation = refOperation;
    }

    public String getdOperation() {
        return dOperation;
    }

    public void setdOperation(String dOperation) {
        this.dOperation = dOperation;
    }

    public Equipement getEquipement() {
        return equipement;
    }

    public void setEquipement(Equipement equipement) {
        this.equipement = equipement;
    }

    // Référence de l'équipement (comme dans la consigne)
    public String getRefEquipement() {
        return (equipement == null) ? null : equipement.getRefEquipement();
    }

    public float getDureeOpreration() {
        return dureeOpreration;
    }

    public void setDureeOpreration(float dureeOpreration) {
        this.dureeOpreration = dureeOpreration;
    }
}