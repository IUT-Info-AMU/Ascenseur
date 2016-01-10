/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

/**
 *
 * @author Bprog
 */
public class Musique extends OptionAscenseur {
    
    private String musique;
    
    public Musique (Ascenseur ascenseur, String nomMusique) {
        super (ascenseur);
        this.musique = nomMusique;
    }
    
    @Override
    public void action () {
        super.action();
        System.out.println ("joue " + musique);
    }
    
}
