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
    
    /*
    *Constructeur de AscenseurAvecMusique
    *@param ascenseur AscenseurAvecOption
    *@param nomMusique String
    */
    public AscenseurAvecMusique (AscenseurAvecOption ascenseur, String nomMusique) {
        super (ascenseur);
        options.put("musique", nomMusique);
    }
    
    @Override
    /*
    *execute l'action de la classe parente et affiche la musique
    *@return void
    */
    public void action () {
        super.action();
        System.out.println ("joue " + this.options.get("musique"));
    }
    
    /*
    *Permet de changer de musique
    *@param musique String
    */
    public void changerMusique (String musique) {
        this.options.put("musique", musique);
    }
    
}
