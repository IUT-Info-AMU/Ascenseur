/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.affichage.AfficheurObserveur;
import com.traitement.Requete;
import com.traitement.RequeteInterne;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Bprog
 */
public class Ascenseur implements AscenseurObservable {

    private int                             numEtage;
    private boolean                         enMouvement;
    private boolean                         ouvert;
    private boolean                         bloque;
    private LinkedList<Requete>             requetes;
    private ArrayList<AfficheurObserveur>   afficheurs;
    
    public Ascenseur () {
        this.numEtage =     0;
        afficheurs =        new ArrayList<AfficheurObserveur> ();
        requetes =          new LinkedList<Requete>();
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

    public int getNumEtage () {
        return numEtage;
    }

    public LinkedList<Requete> getRequetes () {
        return requetes;
    }
    
    public void action () {
        //si il n'y a plus de requetes 
        if ( requetes.isEmpty() ){
            
            //Immobile
            this.immobile();
            this.fermer();
        }
        
        //si il y a des requetes ET etage requete == etage ascenseur
        else if ( !requetes.isEmpty() && requetes.get(0).getNumEtage() == this.numEtage ){
            
            //Ouverture des portes
            this.immobile();
            this.ouvrir();
            while ( !requetes.isEmpty() && requetes.get(0).getNumEtage() == this.numEtage )
                requetes.removeFirst ();
        }

        //si il y a des requetes ET etage requete != etage ascenseur
        else if ( !requetes.isEmpty() && requetes.get(0).getNumEtage() != this.numEtage ){
            
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
        
        mettreAJourAfficheur ();
        
    }// action()

    @Override
    public String toString() {
        return "Ascenseur{" + "numEtage=" + numEtage + ", enMouvement=" + enMouvement + ", ouvert=" + ouvert + ", bloque=" + bloque + ", requetes=" + requetes + '}';
    }

    @Override
    public void ajouterAfficheur (AfficheurObserveur a) {
        this.afficheurs.add (a);
    }

    @Override
    public void retirerAfficheur (AfficheurObserveur a) {
        for (AfficheurObserveur b : afficheurs) {
            if (b == a) this.afficheurs.remove (b);
        }
    }

    @Override
    public void mettreAJourAfficheur () {
        for (int i = 0; i < afficheurs.size (); ++i) {
            AfficheurObserveur afficheur = (AfficheurObserveur) afficheurs.get (i);
            afficheur.mettreAJour (numEtage, enMouvement, ouvert, bloque);
        }
    }
        
}//class Ascenseur
