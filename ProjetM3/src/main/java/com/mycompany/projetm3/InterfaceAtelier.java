/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetm3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class InterfaceAtelier extends Application {//partie interface graphique en JAVAFX

    private final BorderPane root = new BorderPane();
    private final VBox contenuMenu = new VBox(10);

   @Override
public void start(Stage stage) {

    // creation zones
    creerAtelier();
    creerMenu();
    creerBas();

    // creation scene
    Scene scene = new Scene(root, 1200, 750);

    // affichage
    stage.setTitle("Gestion de l'atelier");
    stage.setScene(scene);
    stage.setMaximized(true);
    stage.show();
}

    private void creerAtelier() {

        // zone atelier
        Pane atelier = new Pane();
        atelier.setStyle("-fx-border-color: black;"); //bordure provisoire pour situer le pane pour l'instant 

        root.setCenter(atelier);
    }

   
private void creerMenu() {

   
    VBox menu = new VBox(15);
    menu.setPrefWidth(300);
    menu.setStyle("-fx-padding: 20;");

    Label titre = new Label("Gestion de l'atelier");

    // choix de la caté
    ComboBox<String> choix = new ComboBox<>();
    choix.getItems().addAll(
        "Machine",
        "Poste",
        "Gamme",
        "Produit",
        "Opération",
        "Opérateur"
    );
    choix.setMaxWidth(Double.MAX_VALUE);

    // choix de l'action
    ComboBox<String> action = new ComboBox<>();
    action.getItems().addAll(
        "Créer",
        "Modifier",
        "Supprimer",
        "Afficher"
    );
    action.setMaxWidth(Double.MAX_VALUE);

    // maj formulaire
    Runnable actualiser = () -> {

        contenuMenu.getChildren().clear();

        String categorie = choix.getValue();
        String operation = action.getValue();

        if (categorie == null || operation == null) {
            return;
        }

        // choix d'un élément existant
        if (!operation.equals("Créer")) {

            ComboBox<String> elements = new ComboBox<>();
            elements.setPromptText("Sélectionner " + categorie);
            elements.setMaxWidth(Double.MAX_VALUE);

            // ajouts rééls ici

            contenuMenu.getChildren().add(elements);
        }

        // contenu selon la caté
        switch (categorie) {

            case "Machine" -> {

                if (operation.equals("Créer")) {

                    Label ref = new Label("Référence");
                    TextField refField = new TextField();

                    Label designation = new Label("Désignation");
                    TextField designationField = new TextField();

                    Label type = new Label("Type");
                    ComboBox<String> typeField = new ComboBox<>();
                    typeField.getItems().addAll(
                        "Découpe",
                        "Perçage",
                        "Soudage",
                        "Assemblage"
                    );

                    Label cout = new Label("Coût horaire");
                    TextField coutField = new TextField();

                    Label x = new Label("Position X");
                    TextField xField = new TextField();

                    Label y = new Label("Position Y");
                    TextField yField = new TextField();

                    Button ajouter = new Button("Créer machine");

                    contenuMenu.getChildren().addAll(
                        ref, refField,
                        designation, designationField,
                        type, typeField,
                        cout, coutField,
                        x, xField,
                        y, yField,
                        ajouter
                    );
                }

                if (operation.equals("Modifier")) {
                    // formulaire de modification à ajouter
                }

                if (operation.equals("Supprimer")) {
                    // bouton de suppression à ajouter
                }

                if (operation.equals("Afficher")) {
                    // affichage des caractéristiques à ajouter
                }
            }
            
            

            
            case "Poste" -> {

                if (operation.equals("Créer")) {

                    // ref poste
                    Label ref = new Label("Référence");
                    TextField refField = new TextField();

                    // dposte
                    Label designation = new Label("Désignation");
                    TextField designationField = new TextField();

                    // sélection des machines
                    Label machines = new Label("Machines du poste");

                    VBox listeMachines = new VBox(10);

                    // les cases à cocher seront ajoutées plus tard avec la BDD

                    // bouton de création
                    Button ajouter = new Button("Créer poste");

                    // ajout des champs
                    contenuMenu.getChildren().addAll(
                        ref, refField,
                        designation, designationField,
                        machines, listeMachines,
                        ajouter
                    );
                }

                if (operation.equals("Modifier")) {
                    // modification du poste
                }

                if (operation.equals("Supprimer")) {
                    // suppression du poste
                }

                if (operation.equals("Afficher")) {
                    // affichage du poste
                }
            }

            
            

            case "Gamme" -> {
                // contenu gamme
            }


            case "Produit" -> {

                if (operation.equals("Créer")) {

                    // code du produit
                    Label code = new Label("Code produit");
                    TextField codeField = new TextField();

                    // désignation du produit
                    Label designation = new Label("Désignation");
                    TextField designationField = new TextField();

                    // bouton de création
                    Button ajouter = new Button("Créer produit");

                    // ajout des champs
                    contenuMenu.getChildren().addAll(
                        code, codeField,
                        designation, designationField,
                        ajouter
                    );
                }

                if (operation.equals("Modifier")) {
                    // modification du produit
                }

                if (operation.equals("Supprimer")) {
                    // suppression du produit
                }

                if (operation.equals("Afficher")) {
                    // affichage du produit
                }
            }



            
            case "Opération" -> {

                if (operation.equals("Créer")) {

                    // référence de l'opération
                    Label ref = new Label("Référence");
                    TextField refField = new TextField();

                    // désignation de l'opération
                    Label designation = new Label("Désignation");
                    TextField designationField = new TextField();

                    // choix de l'équipement
                    Label equipement = new Label("Équipement");
                    ComboBox<String> equipementField = new ComboBox<>();
                    equipementField.setMaxWidth(Double.MAX_VALUE);

                    // les équipements seront ajoutés plus tard

                    // durée en heures
                    Label duree = new Label("Durée en heures");
                    TextField dureeField = new TextField();

                    // bouton de création
                    Button ajouter = new Button("Créer opération");

                    // ajout des champs
                    contenuMenu.getChildren().addAll(
                        ref, refField,
                        designation, designationField,
                        equipement, equipementField,
                        duree, dureeField,
                        ajouter
                    );
                }

                if (operation.equals("Modifier")) {
                    // modification de l'opération
                }

                if (operation.equals("Supprimer")) {
                    // suppression de l'opération
                }

                if (operation.equals("Afficher")) {
                    // affichage de l'opération
                }
            }



            case "Opérateur" -> {

                if (operation.equals("Créer")) {

                    // code de l'opérateur
                    Label code = new Label("Code opérateur");
                    TextField codeField = new TextField();

                    // nom de l'opérateur
                    Label nom = new Label("Nom");
                    TextField nomField = new TextField();

                    // prénom de l'opérateur
                    Label prenom = new Label("Prénom");
                    TextField prenomField = new TextField();

                    // sélection des compétences
                    Label competences = new Label("Compétences");
                    VBox listeCompetences = new VBox(10);

                    // les cases à cocher seront ajoutées plus tard

                    // bouton de création
                    Button ajouter = new Button("Créer opérateur");

                    // ajout des champs
                    contenuMenu.getChildren().addAll(
                        code, codeField,
                        nom, nomField,
                        prenom, prenomField,
                        competences, listeCompetences,
                        ajouter
                    );
                }

                if (operation.equals("Modifier")) {
                    // modification de l'opérateur
                }

                if (operation.equals("Supprimer")) {
                    // suppression de l'opérateur
                }

                if (operation.equals("Afficher")) {
                    // affichage de l'opérateur
                }
            }

        }
    };

    // actualisation lors des changements
    choix.setOnAction(e -> actualiser.run());
    action.setOnAction(e -> actualiser.run());

    // ajout des elts au panneau
    menu.getChildren().addAll(titre, choix, action, contenuMenu);

    root.setRight(menu);
}


    private void creerBas() {

        // barre du bas 
        HBox bas = new HBox(30);
        bas.setStyle("-fx-padding: 15;");

        Label journal = new Label("Journal d'activité :");
        Label cout = new Label("Coût de la gamme :  €");

        bas.getChildren().addAll(journal, cout);
        root.setBottom(bas);
    }
}
