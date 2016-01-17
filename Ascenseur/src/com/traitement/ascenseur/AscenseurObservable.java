/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.ArrayList;
import java.util.Collection;
import com.affichage.AfficheurObservateur;
import java.util.HashMap;

/**
 *
 * @author m13001362, Gaëtan (modification du fichier et javadoc)
 */
public abstract class AscenseurObservable implements AscenseurAvecOption{

    protected ArrayList<AfficheurObservateur> observateurs;
    
    /*
    *Ajoute un Observateur
    *@param o AfficheurObservateur
    */
    public void ajouterObserveur (AfficheurObservateur o) {
        observateurs.add (o);
    }
    
    /*
    *Retirer un Observateur
    *@param o AfficheurObservateur
    */
    public void retirerObserveur (AfficheurObservateur o) {
        observateurs.remove(o);
    }
    
    /*
    *Met à jour les Observateurs
    *@param int numEtage
    *@param boolean enMouvement
    *@param boolean ouvert
    *@param boolean bloque
    *@param Collection<Requete> requetes
    *@return void
    */
    public void mettreAJourObservateurs (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes,HashMap<String,String> options) {
        for (AfficheurObservateur o : observateurs) {
            o.mettreAJour (numEtage, enMouvement, ouvert, bloque, requetes, options);
        }
    }
    
}
