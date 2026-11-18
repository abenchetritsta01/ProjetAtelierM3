/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetm3.modeles;

/**
 *
 * @author Utilisateur
 */
import java.util.ArrayList;

public class Gamme {

    private String refGamme;
    private Produit produit;   // le produit fabriqué avec cette gamme
    private ArrayList<Operation> listeOperations;
    private ArrayList<Equipement> listeEquipements;

    public Gamme() {
        this.listeOperations = new ArrayList<>();
        this.listeEquipements = new ArrayList<>();
    }

    public Gamme(String refGamme) {
        this.refGamme = refGamme;
        this.listeOperations = new ArrayList<>();
        this.listeEquipements = new ArrayList<>();
    }

    public Gamme(String refGamme,
                 ArrayList<Operation> listeOperations,
                 ArrayList<Equipement> listeEquipements) {
        this.refGamme = refGamme;
        this.listeOperations = (listeOperations != null) ? listeOperations : new ArrayList<>();
        this.listeEquipements = (listeEquipements != null) ? listeEquipements : new ArrayList<>();
    }

    // Ajoute une opération, et son équipement s'il n'est pas déjà dans la liste
    public void ajouterOperation(Operation operation) {
        listeOperations.add(operation);
        Equipement eq = operation.getEquipement();
        if (eq != null && !listeEquipements.contains(eq)) {
            listeEquipements.add(eq);
        }
    }

    public void creerGamme() {
        // à faire
    }

    public void modifierGamme() {
        // à faire
    }

    public void supprimerGamme() {
        // à faire
    }

    // Affiche la liste des équipements utilisés par la gamme
    public void afficheGamme() {
        System.out.println("Gamme " + refGamme
                + (produit != null ? " (produit : " + produit.getCodeProduit() + ")" : ""));
        for (Equipement eq : listeEquipements) {
            System.out.println("   - " + eq.getRefEquipement() + " : " + eq.getdEquipement());
        }
    }

    // Coût de la gamme = somme des coûts de ses opérations
    public float coutGamme() {
        float total = 0;
        for (Operation op : listeOperations) {
            total += op.getCout();
        }
        return total;
    }

    // Durée de la gamme = somme des durées de ses opérations (opérations l'une après l'autre)
    public float dureeGamme() {
        float total = 0;
        for (Operation op : listeOperations) {
            total += op.getDureeOpreration();
        }
        return total;
    }

    //getter et setter
    public String getRefGamme() {
        return refGamme;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
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