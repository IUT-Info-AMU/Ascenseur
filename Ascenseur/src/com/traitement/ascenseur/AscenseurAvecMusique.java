/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.affichage.AfficheurObservateur;


/**
 *
 * @author Bprog
 */
public class AscenseurAvecMusique extends OptionAscenseur {
    
    private String musique;
    
    public AscenseurAvecMusique (Ascenseur ascenseur, String nomMusique) {
        super (ascenseur);
        this.musique = nomMusique;
    }
    
    @Override
    public void action () {
        super.action();
        System.out.println ("joue " + musique);
    }
    
    public void changerMusique (String musique) {
        this.musique = musique;
    }

    @Override
    public void ajouterObserveur(AfficheurObservateur o) {
        
    }

    @Override
    public void retirerObserveur(AfficheurObservateur o) {
        
    }
    
}
