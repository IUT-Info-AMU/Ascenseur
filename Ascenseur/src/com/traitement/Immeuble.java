/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.Ascenseur;
import java.util.ArrayList;

/**
 *
 * @author Thorrsten
 */
public class Immeuble {
    
    private int nombreEtage;
    private ArrayList<Ascenseur> ascenseurs;
    
    public Immeuble (int nombreEtage) {
        this.ascenseurs = new ArrayList<Ascenseur> ();
        this.nombreEtage = nombreEtage;
    }
    
     public int getNombreEtage(){
        
        return this.nombreEtage;
    }
    
    public ArrayList<Ascenseur> getAscenseurs(){
        
        return this.ascenseurs;
    }
    
    public void ajouterAscenseur (Ascenseur a) {
        this.ascenseurs.add (a);
    }

}
