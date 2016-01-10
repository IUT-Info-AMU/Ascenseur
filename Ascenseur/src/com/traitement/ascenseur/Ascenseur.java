/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import com.traitement.RequeteInterne;
import java.util.ArrayList;

/**
 *
 * @author Bprog
 */
public class Ascenseur {

    private int numEtage;
    private boolean enMouvement;
    private boolean ouvert;
    private ArrayList<Requete> requetes;
    
    public Ascenseur () {
        requetes = new ArrayList<Requete>();
        this.enMouvement = false;
        this.ouvert = false;
    }
    
    public void bloquer () {
        this.enMouvement = false;
    }
    
    public void debloquer () {
        this.enMouvement = true;
    }
    
    public void ouvrir(){
        this.ouvert = true;
    }
    
    public void fermer(){
        this.ouvert = false;
    }
    
    public void ajouterRequete (Requete r) {
        this.requetes.add (r);
    }
    
    public void creerRequeteInterne (int numEtage) {
        RequeteInterne requete = new RequeteInterne (numEtage);
        this.requetes.add (requete);
    }
    
    public void action () {
       
        //si il n'y a plus de requetes : on ne fait rien
        if ( requetes.isEmpty() ){
            
            this.bloquer();
        }
        
        
        
        //si il y a des requetes ET etage requete == etage ascenseur
        else if ( !requetes.isEmpty() && requetes.get(0).getNumEtage() == this.numEtage ){
            
            //Ouverture des portes
            this.bloquer();
            this.ouvrir();
        }
        //si il y n'a plus de requetes OU etage requete != etage ascenseur
        else if ( requetes.isEmpty() || requetes.get(0).getNumEtage() != this.numEtage ){
            
            //Immobile fermé
            this.bloquer();
            this.fermer();
        }
        
        
        if (!requetes.isEmpty() && requetes.get(0).getNumEtage() != this.numEtage){
            
            //En mouvement
            
            //Etage requete < etage ascenseur
            if ( requetes.get(0).getNumEtage() < this.numEtage ){

                //Mouvement bas
                -- this.numEtage;
            }
            //Etage requete > etage ascenseur
            else if ( requetes.get(0).getNumEtage() > this.numEtage ){

                //mouvement haut
                ++ this.numEtage;
            }   
        }
    }// action()
}
