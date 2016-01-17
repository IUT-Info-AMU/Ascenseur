/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.Requete;
import java.util.Collection;

/**
 *
 * @author Bprog, Gaëtan (Javadoc)
 */
public interface AfficheurObservateur {
    
    /*
    *Actualise l'affichage
    */
    public void afficher ();
    
    /*
    *Met à jour l'observateur
    *@param int numEtage
    *@param boolean enMouvement
    *@param boolean ouvert
    *@param boolean bloque
    *@param Collection<Requete> requetes
    */
    public void mettreAJour (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes);
    
}
