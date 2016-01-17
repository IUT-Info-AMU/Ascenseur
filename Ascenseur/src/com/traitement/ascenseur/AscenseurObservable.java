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

/**
 *
 * @author m13001362, Gaëtan (modification du fichier)
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
    
    public void mettreAJourObservateurs (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes) {
        for (AfficheurObservateur o : observateurs) {
            o.mettreAJour (numEtage, enMouvement, ouvert, bloque, requetes);
        }
    }
    
}
