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
import java.util.HashMap;

/**
 *
 * @author Bprog, Gaëtan (modification du fichier et javadoc)
 */
public class AscenseurStandard extends AscenseurObservable{

    private int                             numEtage;
    private boolean                         enMouvement;
    private boolean                         ouvert;
    private boolean                         bloque;
    private LinkedList<Requete>             requetes;
    private AscenseurStrategie              methode;
    private HashMap<String,String>          options;
    
    /**
    *Constructeur de AscenseurStandard
    */
    public AscenseurStandard () {
        this.numEtage     = 0;
        requetes          = new LinkedList<Requete> ();
        observateurs      = new ArrayList<AfficheurObservateur> ();
        methode           = new AjoutRequeteAvance ();
        options           = null;
        this.enMouvement  = false;
        this.ouvert       = false;
        this.bloque       = false;
    }
    
    @Override
    /**
    *Bloque la porte de l'Ascenseur
    *@param bloquer boolean
    */
    public void bloquer (boolean bloquer) {
        this.bloque = bloquer;
    }
  
    @Override
    /**
    *Ouvrir la porte de l'Ascenseur
    *@param ouvrir boolean
    */
    public void ouvrir (boolean ouvrir) {
        this.ouvert = ouvrir;
    }
    
    @Override
    /**
    *Met en mouvement l'Ascenseur
    *@param mouvement boolean
    */
    public void mettreEnMouvement (boolean mouvement) {
        this.enMouvement = mouvement;
    }    
    
    @Override
    /**
    *Ajoute une Requete
    *@param r Requete
    */
    public void ajouterRequete (Requete r) {       
        requetes = methode.ajouterRequete (numEtage, requetes, r);
        mettreAJourObservateurs (numEtage, enMouvement, ouvert, bloque, requetes,options);
    }
    
    @Override
    /**
    *Creer une RequeteInterne
    *@param numEtage int
    */
    public void creerRequeteInterne (int numEtage) {
        RequeteInterne requete = new RequeteInterne (numEtage);
        ajouterRequete (requete);
    }

    @Override
    /**
    *Retourne le numéro d'étage
    *@return int
    */
    public int getNumEtage () {
        return numEtage;
    }

    @Override
    /**
    *Retourne une List des Requete
    *@return LinkedList<Requete>
    */
    public LinkedList<Requete> getRequetes () {
        return requetes;
    }
    
    /**
    *Initialise la strategie à appliquer
    *@param AscenseurStrategie strategie
    */
    public void setMethode (AscenseurStrategie strategie) {
        this.methode = strategie;
    }
    
    @Override
    /**
    *l'action de l'ascenseur
    */
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
        
        mettreAJourObservateurs (numEtage, enMouvement, ouvert, bloque, requetes,options);
        
    }// action()

    @Override
    /**
     * Méthode ToString d'AscenseurStandard
     */
    public String toString () {
        return "Ascenseur{" + "numEtage=" + numEtage + ", enMouvement=" + enMouvement + ", ouvert=" + ouvert + ", bloque=" + bloque + ", requetes=" + requetes + '}';
    }

    @Override
    /**
    *Retourne toutes les options de l'ascenseur dans un ArrayList
    *@return ArrayList<String>
    */
    public HashMap<String,String> getOptions() {
        return options;
    }
        
}//class AscenseurStandard
