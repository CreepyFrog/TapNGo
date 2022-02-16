/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.esprit.entities;

import java.util.Date;

/**
 *
 * @author remo
 */
public class Evenement {
    private int Id_Evenement;
    private String Date_Evenement;

    public int getId_Evenement() {
        return Id_Evenement;
    }

    public void setId_Evenement(int Id_Evenement) {
        this.Id_Evenement = Id_Evenement;
    }

    public String getDate_Evenement() {
        return Date_Evenement;
    }

    public void setDate_Evenement(String Date_Evenement) {
        this.Date_Evenement = Date_Evenement;
    }

    public Evenement() {
    }

    public Evenement(int Id_Evenement, String Date_Evenement) {
        this.Id_Evenement = Id_Evenement;
        this.Date_Evenement = Date_Evenement;
    }

    @Override
    public String toString() {
        return "Evenement{" + "Id_Evenement=" + Id_Evenement + ", Date_Evenement=" + Date_Evenement + '}';
    }

    public Evenement(String Date_Evenement) {
        this.Date_Evenement = Date_Evenement;
    }

   
}
