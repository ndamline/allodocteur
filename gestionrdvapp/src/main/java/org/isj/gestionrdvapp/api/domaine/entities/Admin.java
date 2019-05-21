package org.isj.gestionrdvapp.api.domaine.entities;

import javax.persistence.*;

public class Admin {


    @Entity
    @Table(name = "emploidetemps")
    public class EmploiDeTemps {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)


        private int idAdmin;
        private String nom;
        private String prenom;


        public int getIdAdmin() {
            return idAdmin;
        }

        public void setIdAdmin(int idAdmin) {
            this.idAdmin = idAdmin;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public EmploiDeTemps(int idAdmin, String nom, String prenom) {
            this.idAdmin = idAdmin;
            this.nom = nom;
            this.prenom = prenom;
        }

        @Override
        public String toString() {
            return "EmploiDeTemps{" +
                    "idAdmin=" + idAdmin +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }
    }


}
