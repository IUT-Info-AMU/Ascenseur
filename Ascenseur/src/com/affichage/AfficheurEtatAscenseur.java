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
public class AfficheurEtatAscenseur implements Afficheur, AscenseurObserveur {
    
    private int                 numEtage;
    private boolean             enMouvement;
    private boolean             ouvert;
    private boolean             bloque;
    private AscenseurObservable sujet;
    
    public AfficheurEtatAscenseur (AscenseurObservable ascenseur) {
        this.sujet = ascenseur;
        ascenseur.ajouterObserveur (this);
    }

    @Override
    public void afficher () {
        System.out.print ("---Ascenseur---\netage: " + numEtage + "\netat: ");
        if ( bloque )
            System.out.println ("BLOQUE");
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

    @Override
    public void mettreAJour(int numEtage, boolean enMouvement, boolean ouvert, boolean bloque) {
        this.numEtage = numEtage;
        this.enMouvement = enMouvement;
        this.ouvert = ouvert;
        this.bloque = bloque;
        afficher ();
    }
    
}
