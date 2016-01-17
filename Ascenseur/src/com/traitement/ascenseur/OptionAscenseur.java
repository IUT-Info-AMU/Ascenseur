/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Bprog, Gaëtan (modification du fichier et javadoc)
 */
public abstract class OptionAscenseur extends AscenseurObservable {
    
    protected AscenseurAvecOption ascenseur;
    protected HashMap<String,String> options;
    /*
    *COnstructeur de OptionAscenseur
    *@param AscenseurAvecOption ascenseur
    */
    public OptionAscenseur (AscenseurAvecOption ascenseur) {
        this.ascenseur = ascenseur;
    }
    
    @Override
    /*
    *Bloque les portes de l'ascenseur
    *@param boolean bloquer
    */
    public void bloquer (boolean bloquer) {
        ascenseur.bloquer (bloquer);
    }
    
    @Override
    /*
    *Ouvre les portes de l'ascenseur
    *@param boolean ouvrir
    */
    public void ouvrir (boolean ouvrir) {
        ascenseur.ouvrir (ouvrir);
    }
    
    @Override
    /*
    *Met en mouvement l'ascenseur
    *@param boolena mouvement
    */
    public void mettreEnMouvement (boolean mouvement) {
        ascenseur.mettreEnMouvement (mouvement);
    } 
    
    @Override
    /*
    *Ajoute une Requete à l'ascenseur
    *@param Requete r
    */
    public void ajouterRequete (Requete r) {
        ascenseur.ajouterRequete (r);
    }
    
    @Override
    /*
    *Creer une Requete Interne
    *@param int numEtage
    */
    public void creerRequeteInterne (int numEtage) {
        ascenseur.creerRequeteInterne (numEtage);
    }  
    
    @Override
    /*
    *Retourne le numéro d'étage
    *@return int numEtage
    */
    public int getNumEtage () {
        return ascenseur.getNumEtage ();
    }
    
    @Override
    /*
    *Retourne la list des Requetes de l'ascenseur
    *@return LinkedList<Requete>
    */
    public LinkedList<Requete> getRequetes () {
        return ascenseur.getRequetes ();
    }
    
    @Override
    /*
    *execute l'action de l'ascenseur
    *@return void
    */
    public void action () {
        ascenseur.action ();
    }
    
    @Override
    /*
    *Retourne toutes les options de l'ascenseur dans un ArrayList
    *@return ArrayList<String>
    */
    public HashMap<String,String> getOptions() {
        return options;
    }
    
}
