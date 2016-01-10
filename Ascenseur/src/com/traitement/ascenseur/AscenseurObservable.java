/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.affichage.AfficheurObserveur;

/**
 *
 * @author Bprog
 */
public interface AscenseurObservable {
    
    public void ajouterAfficheur (AfficheurObserveur a);
    public void retirerAfficheur (AfficheurObserveur a);
    public void mettreAJourAfficheur ();
    
}
