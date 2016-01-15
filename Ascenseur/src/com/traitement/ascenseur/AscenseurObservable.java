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
 * @author m13001362
 */
public abstract class AscenseurObservable {

    protected ArrayList<AfficheurObservateur> observateurs;
    
    abstract public void ajouterObserveur (AfficheurObservateur o);
    abstract public void retirerObserveur (AfficheurObservateur o);
    
    public void mettreAJourObservateurs (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes) {
        for (AfficheurObservateur o : observateurs) {
            o.mettreAJour (numEtage, enMouvement, ouvert, bloque, requetes);
        }
    }
}
