/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.Collection;


/**
 *
 * @author Bprog, Gaëtan (modification du fichier)
 */
public class AscenseurAvecMusique extends OptionAscenseur {
    
    private String musique;
    
    /*
    *Constructeur de AscenseurAvecMusique
    *@param ascenseur AscenseurAvecOption
    *@param nomMusique String
    */
    public AscenseurAvecMusique (AscenseurAvecOption ascenseur, String nomMusique) {
        super (ascenseur);
        this.musique = nomMusique;
    }
    
    @Override
    public void action () {
        super.action();
        System.out.println ("joue " + musique);
    }
    
    /*
    *Permet de changer de musique
    *@param musique String
    */
    public void changerMusique (String musique) {
        this.musique = musique;
    }
}
