package org.example;

import java.util.ArrayList;

public class Ligne {
    private int numero;
    private String depart;
    private String arrivee;
    private TypeTransp typeTransp;
    private ArrayList<Station> stations;

    public Ligne(int numero, String depart, String arrivee, TypeTransp typeTransp) {
        this.numero = numero;
        this.depart = depart;
        this.arrivee = arrivee;
        this.typeTransp = typeTransp;
        this.stations = new ArrayList<>();
    }



    public void afficherInfo() {
        System.out.println("numero ligne: " + numero);
        System.out.println("point depart: " + depart);
        System.out.println("point d'arrivee: " + arrivee);
        System.out.println("type transport: " + typeTransp);
        System.out.println("Stations: ");
        for (Station station : stations) {
            station.afficherInfo();
        }
    }

    public void ajouterStation(Station station) {
        stations.add(station);
    }
}
