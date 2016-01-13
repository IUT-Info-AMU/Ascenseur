/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;

import com.traitement.Requete;
import com.traitement.RequeteExterne;
import com.traitement.ascenseur.AscenseurStandard;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author jeremtop
 */
public class Controleur {
    
    final private static Controleur instance = new Controleur ();
    private static LinkedList<RequeteExterne> requetes;
    private static ArrayList<AscenseurStandard> ascenseurs;
    private ControleurStrategie methode;
    
    private Controleur () {
        ascenseurs  = new ArrayList<AscenseurStandard> ();
        requetes    = new LinkedList<RequeteExterne>   ();
        methode     = new ChoisirAscenseurAvance       ();
    }
    
    public void creerRequeteExterne (int numEtage, boolean direction) {     
        RequeteExterne r = new RequeteExterne (numEtage, direction);
        requetes.add (r);
        
    }
    
    public void choisirAscenseur (RequeteExterne requete) {   
        
        if ( !requetes.isEmpty() ) {
            //appelle la methode approprié de choisirAscenseur()
            methode.choisirAscenseur (requete);
        }
    }
    
    public void ajouterAscenseur (AscenseurStandard a) {
        ascenseurs.add (a);
    }
    
    public static ArrayList<AscenseurStandard> getAscenseurs () {
        return ascenseurs;
    }
    
    public static LinkedList<RequeteExterne> getRequetes () {
        return requetes;
    }
    
    public void setMethode (ControleurStrategie methode) {
        this.methode = methode;
    }
    
    public static Controleur getInstance () {
        return instance;
    }

}
