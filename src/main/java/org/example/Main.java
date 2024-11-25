package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Créer des stations
        Station station1 = new Station(1, "Place de l'Indépendance", StationType.PRINCIPALE, new TypeTransp[]{TypeTransp.BUS, TypeTransp.METRO});
        Station station2 = new Station(2, "Bab El Bhar", StationType.SECONDAIRE, new TypeTransp[]{TypeTransp.BUS});
        Station station3 = new Station(3, "La Marsa", StationType.PRINCIPALE, new TypeTransp[]{TypeTransp.METRO, TypeTransp.TRAMWAY});
        Station station4 = new Station(4, "Ariana Ville", StationType.SECONDAIRE, new TypeTransp[]{TypeTransp.TRAMWAY});

        // Afficher les informations des stations
        System.out.println("Liste des stations :");
        station1.afficherInfo();
        station2.afficherInfo();
        station3.afficherInfo();
        station4.afficherInfo();

        // Créer une ligne de bus
        Ligne ligneBus = new Ligne(101, "Tunis", "Ben Arous", TypeTransp.BUS);
        ligneBus.ajouterStation(station1);
        ligneBus.ajouterStation(station2);

        // Créer une ligne de métro
        Ligne ligneMetro = new Ligne(201, "Tunis", "La Marsa", TypeTransp.METRO);
        ligneMetro.ajouterStation(station1);
        ligneMetro.ajouterStation(station3);

        // Créer une ligne de tramway
        Ligne ligneTramway = new Ligne(301, "Ariana", "La Marsa", TypeTransp.TRAMWAY);
        ligneTramway.ajouterStation(station4);
        ligneTramway.ajouterStation(station3);

        // Afficher les informations des lignes
        System.out.println("\nDétails des lignes :");
        ligneBus.afficherInfo();
        ligneMetro.afficherInfo();
        ligneTramway.afficherInfo();
    }
}
