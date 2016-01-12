/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;

import com.traitement.Requete;
import com.traitement.RequeteExterne;
import com.traitement.ascenseur.AscenseurStandard;
import com.traitement.ascenseur.Ascenseur;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author jeremtop
 */
public class Controleur {
    
    private static Controleur                instance;
    private LinkedList<Requete>              requetes;
    private ArrayList<AscenseurStandard>     ascenseurs;
    
    private Controleur () {
        
        ascenseurs  = new ArrayList<AscenseurStandard> ();
        requetes    = new LinkedList<Requete>          ();
    }
    
    public void creerRequeteExterne (int numEtage, boolean direction){
        Requete r = new RequeteExterne (numEtage, direction);
        requetes.add (r);
    }
    public void choisirAscenseur (RequeteExterne requete, ControleurStrategie methode){
        
        methode.choisirAscenseur(requete);
    }
    
    public static Controleur getInstance () {
        if (instance == null) {
            instance = new Controleur ();
        }
        return instance;
    }
   
}
