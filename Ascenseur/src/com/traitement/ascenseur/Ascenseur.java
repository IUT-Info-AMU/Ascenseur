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

    private int                 numEtage;
    private boolean             enMouvement;
    private boolean             ouvert;
    private boolean             bloque;
    private ArrayList<Requete>  requetes;
    
    public Ascenseur () {
        this.numEtage =          0;
        requetes =          new ArrayList<Requete>();
        this.enMouvement =  false;
        this.ouvert =       false;
        this.bloque =       false;
    }
    
    public void bloquer () {
        this.bloque = true;
    }
    
    public void debloquer () {
        this.bloque = false;
    }
  
    public void fermer (){
        this.ouvert = false;
    }
    
    public void ouvrir (){
        this.ouvert = true;
    }
    
    public void immobile (){
        this.enMouvement = false;
    }
    
    public void mouvement (){
        this.enMouvement = true;
    }
    
    
    public void ajouterRequete (Requete r) {
        this.requetes.add (r);
    }
    
    public void creerRequeteInterne (int numEtage) {
        RequeteInterne requete = new RequeteInterne (numEtage);
        this.requetes.add (requete);
    }
    
    public void action () {
       
        //si il n'y a plus de requetes 
        if ( requetes.isEmpty() ){
            
            //Immobile
            this.immobile();
            this.fermer();
        }
        
        //si il y a des requetes ET etage requete == etage ascenseur
        if ( !requetes.isEmpty() && requetes.get(0).getNumEtage() == this.numEtage ){
            
            //Ouverture des portes
            this.immobile();
            this.ouvrir();
        }

        //si il y a des requetes ET etage requete != etage ascenseur
        if (!requetes.isEmpty() && requetes.get(0).getNumEtage() != this.numEtage){
            
            //En mouvement
            this.fermer();
            this.mouvement();
            
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

    @Override
    public String toString() {
        return "Ascenseur{" + "numEtage=" + numEtage + ", enMouvement=" + enMouvement + ", ouvert=" + ouvert + ", bloque=" + bloque + ", requetes=" + requetes + '}';
    }
        
}//class Ascenseur
