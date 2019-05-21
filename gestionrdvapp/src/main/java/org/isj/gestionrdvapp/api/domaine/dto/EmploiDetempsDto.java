package org.isj.gestionrdvapp.api.domaine.dto;

import java.io.Serializable;
import java.sql.Time;

public class EmploiDetempsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idEmploi;
    private Time hdebut;
    private Time hfin;

    public EmploiDetempsDto(){super();}
    public EmploiDetempsDto(int idEmploi, Time hdebut, Time hfin){
        this.idEmploi=idEmploi;
        this.hdebut=hdebut;
        this.hfin=hfin;
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    @Override
    public String toString() {
        return "EmploiDetempsDto{" +
                "idEmploi=" + idEmploi +
                ", hdebut=" + hdebut +
                ", hfin=" + hfin +
                '}';
    }
}
