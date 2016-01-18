/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;


/**
 *
 * @author Bprog, Gaëtan (modification du fichier et javadoc)
 */
public class AscenseurAvecMusique extends OptionAscenseur {
    
    final String optionName = "musique";
    /*
    *Constructeur de AscenseurAvecMusique
    *@param ascenseur AscenseurAvecOption
    *@param nomMusique String
    */
    public AscenseurAvecMusique (AscenseurAvecOption ascenseur, String nomMusique) {
        super (ascenseur);
        ascenseur.getOptions().put(optionName, nomMusique);
    }

    /**
    *Permet de changer de musique
    *@param musique String
    */
    public void changerMusique (String musique) {
        this.options.put(optionName, musique);
    }
    
}