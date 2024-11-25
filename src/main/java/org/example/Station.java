package org.example;

import java.util.ArrayList;

public class Station {
        private int numero;
        private String name;
        private StationType type;
        private int nombreLignes;
        private TypeTransp[] typesTransp;

        public Station(int numero, String name, StationType type, int nombreLignes, TypeTransp[] typesTransp) {
            this.numero = numero;
            this.name = name;
            this.type = type; // Principale ou bien Secondaire
            this.nombreLignes = nombreLignes;
            this.typesTransp = typesTransp;
        }



        public void afficherInfo() {
            System.out.println("numero station: " + numero);
            System.out.println("nom station: " + name);
            System.out.println("type station: " + type);
            System.out.println("nombre de lignes: " + nombreLignes);
            System.out.println("types transport: " + typesTransp);
        }

        public void modifierType(StationType nouveauType) {
            this.type = nouveauType;
        }
    }

}
