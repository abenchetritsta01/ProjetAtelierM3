/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetm3;

/**
 *
 * @author Utilisateur
 */
public class Operation {

    private String refOperation;
    private String dOperation;
    private String refEquipement;
    private float dureeOpreration;

    public Operation() {
    }
    public Operation(String refOperation, String dOperation,
                 String refEquipement, float dureeOpreration) {
    this.refOperation = refOperation;
    this.dOperation = dOperation;
    this.refEquipement = refEquipement;
    this.dureeOpreration = dureeOpreration;
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

    public String getRefEquipement() {
        return refEquipement;
    }

    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }

    public float getDureeOpreration() {
        return dureeOpreration;
    }

    public void setDureeOpreration(float dureeOpreration) {
        this.dureeOpreration = dureeOpreration;
    }
    
}