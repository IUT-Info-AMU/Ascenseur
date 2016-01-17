/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.AscenseurAvecOption;
import java.util.ArrayList;

/**
 *
 * @author Thorrsten, Gaëtan (javadoc)
 * 
 */
public class Immeuble {
    private int nombreEtage;
    private ArrayList<AscenseurAvecOption> ascenseurs;
    /*
    *Constructeur de la classe Immeuble
    *@param nombreEtage le nombre d'étage, un entier
    */
    public Immeuble (int nombreEtage) {
        this.ascenseurs = new ArrayList<AscenseurAvecOption> ();
        this.nombreEtage = nombreEtage;
    }
    
    /*
    *Cette fonction renvoit le nombre d'étage de l'Immeuble
    *@return int le nombre d'étage
    */
     public int getNombreEtage(){
        
        return this.nombreEtage;
    }
    
    /*
    * Cette fonction renvoit un tableau contenant els ascenseur de l'Immeuble
    *@return ArrayList<Ascenseur> un tableau d'ascenseurs
    */
    public ArrayList<AscenseurAvecOption> getAscenseurs(){
        
        return this.ascenseurs;
    }
    
    /*
    *Ajoute un AscenseurAvecOption à l'Immeuble
    *@param ascenseur un AscenseurAvecOption
    */
    public void ajouterAscenseur (AscenseurAvecOption ascenseur) {
        this.ascenseurs.add (ascenseur);
    }

}
