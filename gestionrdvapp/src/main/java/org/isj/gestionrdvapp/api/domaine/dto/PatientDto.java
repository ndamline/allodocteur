package org.isj.gestionrdvapp.api.domaine.dto;

import java.io.Serializable;
import java.util.Date;

public class PatientDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idPatient;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String sexe;
    private String email;
    private int telephone;


    public PatientDto(){super();}

    public PatientDto(int idPatient, String nom, String prenom, Date dateNaissance, String sexe, String email, int telephone) {
        this.idPatient = idPatient;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.email = email;
        this.telephone = telephone;

    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }



    @Override
    public String toString() {
        return "PatientDto{" +
                "idPatient=" + idPatient +
                ", nom='" + nom +
                ", prenom='" + prenom +
                ", dateNaissance=" + dateNaissance +
                ", sexe='" + sexe +
                ", email='" + email +
                ", telephone=" + telephone +

                '}';
    }
}
