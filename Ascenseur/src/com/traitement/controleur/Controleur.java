/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;

import com.traitement.RequeteExterne;
import com.traitement.ascenseur.AscenseurAvecOption;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author jeremtop, Gaëtan (modification du fichier et javadoc)
 */
public class Controleur {
    
    final private static Controleur instance = new Controleur ();
    private static LinkedList<RequeteExterne> requetes;
    private static ArrayList<AscenseurAvecOption> ascenseurs;
    private ControleurStrategie methode;
    
    /**
    *Constructeur du controleur
    */
    private Controleur () {
        ascenseurs  = new ArrayList<AscenseurAvecOption> ();
        requetes    = new LinkedList<RequeteExterne>   ();
        methode     = new ChoisirAscenseurAvance       ();
    }
    
    /**
    *Creer une Requete externe avec le num d'étage voulu et la direction (haut(true) ou bas(false))
    *@param int numEtage
    *@param boolean direction
    */
    public void creerRequeteExterne (int numEtage, boolean direction) {     
        RequeteExterne r = new RequeteExterne (numEtage, direction);
        requetes.add (r); 
    }
    
    /**
    *Choisir l'Ascenseur avec une Requete externe 
    *@param RequeteExterne requete
    */
    public void choisirAscenseur (RequeteExterne requete) {    
        if ( !requetes.isEmpty() ) {
            //appelle la methode appropriée de choisirAscenseur()
            methode.choisirAscenseur (requete);
        }
    }
    
    /**
    *Ajout de l'Ascenseur avec option
    *@param AscenseurAvecOption a
    */
    public void ajouterAscenseur (AscenseurAvecOption a) {
        ascenseurs.add (a);
    }
    
    /**
    *Accesseur de l'Ascenseur
    */
    public static ArrayList<AscenseurAvecOption> getAscenseurs () {
        return ascenseurs;
    }
    
    /**
    *Accesseur de Requetes
    */
    public static LinkedList<RequeteExterne> getRequetes () {
        return requetes;
    }
    
    /**
    *Mutateur de Methode
    *@param ControleurStrategie methode
    */
    public void setMethode (ControleurStrategie methode) {
        this.methode = methode;
    }
    
    /**
    *Accesseur d'Instance
    */
    public static Controleur getInstance () {
        return instance;
    }
}
