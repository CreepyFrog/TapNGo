/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.esprit.services;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tn.esprit.entities.IService;
import tn.esprit.entities.Evenement;
import tn.esprit.utils.Datasource;
/**
 *
 * @author remo
 */
public class EvenementService implements IService<Evenement>{
    private Connection conn;
    private PreparedStatement pst;
    private Statement ste;

    public EvenementService() {
        conn = Datasource.getInstance().getCnx();
    }

    @Override
    public void ajouter(Evenement e) {
         String req = "INSERT INTO `evenement`( `Id_Restaurant`, `Date_Evenement`, `Id_Artiste`, `Id_Evenement`) VALUES (?,?,?,?)";
        
        try {
            pst = conn.prepareStatement(req);
            pst.setString(1, "1");
            pst.setString(2, e.getDate_Evenement());
            pst.setString(3, "1");
            pst.setString(4, "1");
            pst.executeUpdate();
            System.out.println("evenement ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimer(Evenement entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifier(Evenement entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evenement> afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
