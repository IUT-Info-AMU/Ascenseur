/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;

import com.traitement.Requete;
import com.traitement.RequeteExterne;
import com.traitement.ascenseur.Ascenseur;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author jeremtop
 */
public class Controleur {
    
    private static Controleur       instance;
    private LinkedList<Requete>     requetes;
    private ArrayList<Ascenseur>    ascenseurs;
    
    private Controleur () {
        
        ascenseurs = new ArrayList<Ascenseur> ();
    }
    
    public void creerRequeteExterne (int numEtage, boolean direction){
        Requete r = new RequeteExterne (numEtage, direction);
        requetes.add (r);
    }
    public void choisirAscenseur (RequeteExterne requete){
        
        //Pour chaque Ascenseur a contenu dans ascenceurs
        for(Ascenseur a : ascenseurs){
            
            //si un Ascenseur a n'a pas de requetes, alors on lui assigne celle-ci
            if(a.getRequetes().isEmpty()){
                a.getRequetes().add(requete);
            }
            else{
                //Si l'Assenceur a monte
                if (a.getRequetes().get(0).getNumEtage() > a.getNumEtage() && 
                        //ET
                        requete.getNumEtage() < a.getRequetes().get(0).getNumEtage() &&
                        requete.getNumEtage() > a.getNumEtage()){
                    
                }
                //Si l'Assenceur a descend
                if (a.getRequetes().get(0).getNumEtage() < a.getNumEtage() &&
                         requete.getNumEtage() > a.getRequetes().get(0).getNumEtage() &&
                        requete.getNumEtage() < a.getNumEtage()){
                    
                }
            }
        }
    }
    
    public static Controleur getInstance () {
        if (instance == null) {
            instance = new Controleur ();
        }
        return instance;
    }
   
}
