/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import com.traitement.RequeteInterne;
import java.util.ArrayList;
import java.util.LinkedList;
import com.affichage.AfficheurObservateur;

/**
 *
 * @author Bprog
 */
public class AscenseurStandard extends AscenseurObservable implements Ascenseur {

    private int                             numEtage;
    private boolean                         enMouvement;
    private boolean                         ouvert;
    private boolean                         bloque;
    private LinkedList<Requete>             requetes;
    
    public AscenseurStandard () {
        this.numEtage =     0;
        requetes =          new LinkedList<Requete> ();
        observateurs =      new ArrayList<AfficheurObservateur> ();
        this.enMouvement =  false;
        this.ouvert =       false;
        this.bloque =       false;
    }
    
    public void bloquer (boolean bloquer) {
        this.bloque = bloquer;
    }
  
    public void ouvrir (boolean ouvrir) {
        this.ouvert = ouvrir;
    }
    
    public void mettreEnMouvement (boolean mouvement) {
        this.enMouvement = mouvement;
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
    
    @Override
    public void action () {
        //si l'ascenseur n'est pas bloque
        if ( !bloque ) {
            
            //si il n'y a plus de requetes 
            if ( this.requetes.isEmpty() ) {

                //Immobile
                this.mettreEnMouvement (false);
                this.ouvrir (false);
            }

            //si il y a des requetes ET etage requete == etage ascenseur
            else if ( this.requetes.getFirst().getNumEtage() == this.numEtage ){

                //ouverture des portes
                this.mettreEnMouvement (false);
                this.ouvrir (true);
                
                //retrait des requetes effectuées
                while ( !this.requetes.isEmpty() && this.requetes.getFirst().getNumEtage() == this.numEtage )
                    this.requetes.removeFirst ();
            }

            //si il y a des requetes ET etage requete != etage ascenseur
            else {//( requetes.get(0).getNumEtage() != this.numEtage ){

                //en mouvement
                this.ouvrir (false);
                this.mettreEnMouvement (true);

                //Etage requete < etage ascenseur
                if ( this.requetes.getFirst().getNumEtage() < this.numEtage ){

                    //mouvement bas
                    -- this.numEtage;
                }
                //Etage requete > etage ascenseur
                else if ( requetes.getFirst().getNumEtage() > this.numEtage ){

                    //mouvement haut
                    ++ this.numEtage;
                    
                }
            }
        }
        
        mettreAJourObservateurs (numEtage, enMouvement, ouvert, bloque, requetes);
        
    }// action()

    @Override
    public String toString () {
        return "Ascenseur{" + "numEtage=" + numEtage + ", enMouvement=" + enMouvement + ", ouvert=" + ouvert + ", bloque=" + bloque + ", requetes=" + requetes + '}';
    }

    @Override
    public void ajouterObserveur (AfficheurObservateur o) {
        observateurs.add (o);
    }

    @Override
    public void retirerObserveur (AfficheurObservateur o) {
        //todo
    }
        
}//class AscenseurStandard
