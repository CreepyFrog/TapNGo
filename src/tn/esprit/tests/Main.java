/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn.esprit.tests;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import tn.esprit.entities.Evenement;
import tn.esprit.services.EvenementService;
import tn.esprit.utils.Datasource;

/**
 *
 * @author remo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        EvenementService es = new EvenementService();
        Evenement e = new Evenement(1,"foulen 2");
        es.ajouter(e); 
        
       // System.out.println( es.afficher() );
        
    }
    
}
