/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.affichage.AscenseurObserveur;

/**
 *
 * @author Bprog
 */
public interface AscenseurObservable {
    
    abstract void ajouterObserveur (AscenseurObserveur o);
    abstract void retirerObserveur (AscenseurObserveur o);
    abstract void mettreAJourObserveurs ();
    
}
