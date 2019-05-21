package org.isj.gestionrdvapp.api.domaine.entities;


import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "emploidetemps")
public class EmploiDeTemps {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idEmploi;
    private Time hdebut;
    private Time hfin;

    public int getIdEmploi() {
        return idEmploi;
    }

    public void setIdEmploi(int idEmploi) {
        this.idEmploi = idEmploi;
    }

    public Time getHdebut() {
        return hdebut;
    }

    public void setHdebut(Time hdebut) {
        this.hdebut = hdebut;
    }

    public Time getHfin() {
        return hfin;
    }

    public void setHfin(Time hfin) {
        this.hfin = hfin;
    }

    public EmploiDeTemps( int idEmploi, Time hdebut, Time hfin) {
        this.idEmploi = idEmploi;
        this.hdebut = hdebut;
        this.hfin = hfin;
    }

    @Override
    public String toString() {
        return "EmploiDeTemps{" +
                "idEmploi=" + idEmploi +
                ", hdebut=" + hdebut +
                ", hfin=" + hfin +
                '}';
    }
}
