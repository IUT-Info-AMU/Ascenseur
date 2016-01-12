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
    public void choisirAscenseur (RequeteExterne requete){
        
        //Pour chaque AscenseurStandard a contenu dans ascenceurs
        for(AscenseurStandard a : ascenseurs){
            
            //si un AscenseurStandard a n'a pas de requetes, alors on lui assigne celle-ci
            if(a.getRequetes().isEmpty()){
                a.getRequetes().add(requete);
            }
            else{
                //Si l'Assenceur a monte
                if (a.getRequetes().get(0).getNumEtage() > a.getNumEtage() && 
                        //ET la requete a traité se trouve sur le chemin de l'Ascensseur a
                        requete.getNumEtage() < a.getRequetes().get(0).getNumEtage() &&
                        requete.getNumEtage() > a.getNumEtage()){
                    
                    //On ajoute la requete en position 0 et devient prioritaire
                    a.getRequetes().add(0, requete);
                    //La requete est assigné au bon ascenseur, le controlleur ne s'en charge plus
                    this.requetes.removeFirst();
                }
                //Si l'Assenceur a descend
                else if (a.getRequetes().get(0).getNumEtage() < a.getNumEtage() &&
                        //ET la requete a traité se trouve sur le chemin de l'Ascensseur a
                        requete.getNumEtage() > a.getRequetes().get(0).getNumEtage() &&
                        requete.getNumEtage() < a.getNumEtage()){
                    
                    //On ajoute la requete en position 0 et devient prioritaire
                    a.getRequetes().add(0, requete);
                    //La requete est assigné au bon ascenseur, le controlleur ne s'en charge plus
                    this.requetes.removeFirst();
                }
            }
        }
        
        /* 
         * Si aucun ascenseur ne peut répondre aux conditions ci-dessus,
         * on attend une iteration supplementaire
         */
        
    }//choisirAscenseur()
    
    public static Controleur getInstance () {
        if (instance == null) {
            instance = new Controleur ();
        }
        return instance;
    }
   
}
