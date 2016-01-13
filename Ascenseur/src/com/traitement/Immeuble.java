/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.AscenseurStandard;
import java.util.ArrayList;

/**
 *
 * @author Thorrsten
 */
public class Immeuble {
    
    private int nombreEtage;
    private ArrayList<AscenseurStandard> ascenseurs;
    
    public Immeuble (int nombreEtage) {
        this.ascenseurs = new ArrayList<AscenseurStandard> ();
        this.nombreEtage = nombreEtage;
    }
    
     public int getNombreEtage(){
        
        return this.nombreEtage;
    }
    
    public ArrayList<AscenseurStandard> getAscenseurs(){
        
        return this.ascenseurs;
    }
    
    public void ajouterAscenseur (AscenseurStandard a) {
        this.ascenseurs.add (a);
    }

}
