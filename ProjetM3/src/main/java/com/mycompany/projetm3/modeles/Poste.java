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


public class Poste extends Equipement {

    // refPoste et dPoste sont maintenant hérités de Equipement (refEquipement, dEquipement)
    private ArrayList<Machine> listeMachines;

    public Poste() {
        super();
        this.listeMachines = new ArrayList<>();
    }

    public Poste(String refPoste, String dPoste) {
        super(refPoste, dPoste);
        this.listeMachines = new ArrayList<>();
    }

    public Poste(String refPoste, String dPoste,
                 ArrayList<Machine> listeMachines) {
        super(refPoste, dPoste);
        this.listeMachines = (listeMachines != null) ? listeMachines : new ArrayList<>();
    }

    // Coût horaire d'un poste = somme des coûts horaires de ses machines
    // (hypothèse : toutes les machines du poste tournent pendant l'opération)
    @Override
    public float getCoutHoraire() {
        float total = 0;
        for (Machine m : listeMachines) {
            total += m.getCoutHoraire();
        }
        return total;
    }

    // Modifier la composition du poste
    public void ajouterMachine(Machine machine) {
        if (!listeMachines.contains(machine)) {
            listeMachines.add(machine);
        }
    }

    public void retirerMachine(Machine machine) {
        listeMachines.remove(machine);
    }

    public void affichePoste() {
        System.out.println("Poste " + getRefPoste() + " (" + getdPoste() + ")");
        for (Machine m : listeMachines) {
            System.out.println("   - " + m.getRefMachine() + " : " + m.getdMachine());
        }
    }

    public void modifierPoste() {
        // à faire
    }

    public void supprimerPoste() {
        // à faire
    }

    //getter et setter
    public String getRefPoste() {
        return getRefEquipement();
    }

    public void setRefPoste(String refPoste) {
        setRefEquipement(refPoste);
    }

    public String getdPoste() {
        return getdEquipement();
    }

    public void setdPoste(String dPoste) {
        setdEquipement(dPoste);
    }

    public ArrayList<Machine> getListeMachines() {
        return listeMachines;
    }

    public void setListeMachines(ArrayList<Machine> listeMachines) {
        this.listeMachines = listeMachines;
    }
}