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
public abstract class OptionAscenseur implements Ascenseur {
    
    protected Ascenseur ascenseur;
    
    public OptionAscenseur (Ascenseur ascenseur) {
        this.ascenseur = ascenseur;
    }
    
    @Override
    public void action () {
        ascenseur.action ();
    }
    
}
