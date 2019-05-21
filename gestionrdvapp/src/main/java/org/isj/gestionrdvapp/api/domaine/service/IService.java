package org.isj.gestionrdvapp.api.domaine.service;

import org.isj.gestionrdvapp.api.domaine.entities.EmploiDeTemps;
import org.isj.gestionrdvapp.api.domaine.entities.Medecin;
import org.isj.gestionrdvapp.api.domaine.entities.Patient;
import org.isj.gestionrdvapp.api.domaine.entities.Rdv;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface IService {
    //liste des patients
    public List<Patient> getAllPatient();

    //liste des medecins
    public List<Medecin> getAllMedecin();

    //liste des emplois de temps des differents medecins
    public List<EmploiDeTemps> getAllEmploiTemps(Medecin medecin);

    //liste des rdv d'un medecin un jour donné
    public List<Rdv> getAllRdvMedecinJour(Medecin medecin, Date jourRdv);

    //ajouter un emploi de temps
    public EmploiDeTemps AjouterEmploiDeTemps(Time hdebut, Time hfin, Date jourRdv);

    //supprimer un rdv
    public void supprimerRdv(Rdv rdv);

    //trouver un medecin identifié par sa specialite
    public Medecin getMedecinBySpecialite(String specialite);
}
