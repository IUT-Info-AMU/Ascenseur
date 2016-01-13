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
    
    private static Controleur                   instance;
    private static LinkedList<Requete>          requetes;
    private static ArrayList<AscenseurStandard> ascenseurs;
    private ControleurStrategie                 methode;
    
    private Controleur () {      
        ascenseurs  = new ArrayList<AscenseurStandard> ();
        requetes    = new LinkedList<Requete>          ();
        methode     = new ChoisirAscenseurAvance       ();
    }
    
    public void creerRequeteExterne (int numEtage, boolean direction) {
        
        Requete r = new RequeteExterne (numEtage, direction);
        requetes.add (r);
    }
    
    public void choisirAscenseur (RequeteExterne requete) {   
        //appelle la methode approprié de choisirAscenseur()
        methode.choisirAscenseur (requete);
    }
    
    public void ajouterAscenseur (AscenseurStandard a) {
        ascenseurs.add (a);
    }
    
    public static ArrayList<AscenseurStandard> getAscenseurs () {
        return ascenseurs;
    }
    
    public static LinkedList<Requete> getRequetes () {
        return requetes;
    }
    
    public void setMethode (ControleurStrategie methode) {
        this.methode = methode;
    }
    
    public static Controleur getInstance () {
        if (instance == null) {
            instance = new Controleur ();
        }
        return instance;
    }

}
