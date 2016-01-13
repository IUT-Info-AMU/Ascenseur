/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.affichage.Afficheur;
import com.traitement.Requete;
import com.traitement.RequeteInterne;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Bprog
 */
public class AscenseurStandard implements Ascenseur {

    private int                             numEtage;
    private boolean                         enMouvement;
    private boolean                         ouvert;
    private boolean                         bloque;
    private LinkedList<Requete>             requetes;
    private ArrayList<Afficheur>            observeurs;
    
    public AscenseurStandard () {
        this.numEtage =     0;
        requetes =          new LinkedList<Requete> ();
        observeurs =        new ArrayList<Afficheur> ();
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
            if ( requetes.isEmpty() ){

                //Immobile
                this.mettreEnMouvement (false);
                this.ouvrir (false);
            }

            //si il y a des requetes ET etage requete == etage ascenseur
            else if ( requetes.get(0).getNumEtage() == this.numEtage ){

                //ouverture des portes
                this.mettreEnMouvement (false);
                this.ouvrir (true);
                
                //retrait des requetes effectuées
                while ( !requetes.isEmpty() && requetes.get(0).getNumEtage() == this.numEtage )
                    requetes.removeFirst ();
            }

            //si il y a des requetes ET etage requete != etage ascenseur
            else if ( requetes.get(0).getNumEtage() != this.numEtage ){

                //en mouvement
                this.ouvrir (false);
                this.mettreEnMouvement (true);

                //Etage requete < etage ascenseur
                if ( requetes.get(0).getNumEtage() < this.numEtage ){

                    //mouvement bas
                    -- this.numEtage;
                }
                //Etage requete > etage ascenseur
                else if ( requetes.get(0).getNumEtage() > this.numEtage ){

                    //mouvement haut
                    ++ this.numEtage;
                }
            }
        }
        
        mettreAJourObserveurs ();
    }// action()

    @Override
    public String toString () {
        return "Ascenseur{" + "numEtage=" + numEtage + ", enMouvement=" + enMouvement + ", ouvert=" + ouvert + ", bloque=" + bloque + ", requetes=" + requetes + '}';
    }

    public void ajouterObserveur (Afficheur o) {
        observeurs.add (o);
    }

    public void retirerObserveur (Afficheur o) {
        //todo
    }

    public void mettreAJourObserveurs () {
        for (Afficheur o : observeurs) {
            o.mettreAJour (numEtage, enMouvement, ouvert, bloque, requetes);
        }
    }
        
}//class AscenseurStandard
