/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.ascenseur.AscenseurObservable;

/**
 *
 * @author Bprog
 */
public class AfficheurEtatAscenseur implements Afficheur, AfficheurObserveur {

    private int numEtage;
    private boolean bloque;
    private boolean enMouvement;
    private boolean ouvert;
    private AscenseurObservable ascenseur;
    
    public AfficheurEtatAscenseur (AscenseurObservable ascenseur) {
        this.ascenseur = ascenseur;
        ascenseur.ajouterAfficheur (this);
    }
    
    @Override
    public void mettreAJour (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque) {
        this.numEtage =     numEtage;
        this.bloque =       bloque;
        this.enMouvement =  enMouvement;
        this.ouvert =       ouvert;
        afficher ();
    }

    @Override
    public void afficher () {
        System.out.print ("----Ascenseur----\netage: " + numEtage + "\netat: ");
        if ( bloque )
            System.out.println ("bloqué");
        else {
            if ( ouvert )
                System.out.print ("ouvert, ");
            else
                System.out.print ("fermé, ");
            
            if ( enMouvement )
                System.out.println ("en mouvement");
            else
                System.out.println ("à l'arrêt");
        }            
    }
    
}
