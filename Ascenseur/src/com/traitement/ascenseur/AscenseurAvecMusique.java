/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.LinkedList;

/**
 *
 * @author Bprog
 */
public class AscenseurAvecMusique extends OptionAscenseur {
    
    private int                             numEtage;
    private LinkedList<Requete>             requetes;
    private String musique;
    
    public int getNumEtage () {
        return numEtage;
    }

    public LinkedList<Requete> getRequetes () {
        return requetes;
    }
    
    public AscenseurAvecMusique (Ascenseur ascenseur, String nomMusique) {
        super (ascenseur);
        this.musique = nomMusique;
    }
    
    @Override
    public void action () {
        super.action();
        System.out.println ("joue " + musique);
    }
    
}
