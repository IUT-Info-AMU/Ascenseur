/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.Ascenseur;
import java.util.ArrayList;

/**
 *
 * @author Thorrsten, Gaëtan (modification du fichier)
 * 
 */
public class Immeuble {
    private int nombreEtage;
    private ArrayList<Ascenseur> ascenseurs;
    /*
    *Constructeur de la classe Immeuble
    *@param nombreEtage le nombre d'étage, un entier
    */
    public Immeuble (int nombreEtage) {
        this.ascenseurs = new ArrayList<Ascenseur> ();
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
    public ArrayList<Ascenseur> getAscenseurs(){
        
        return this.ascenseurs;
    }
    
    /*
    *Ajoute un Ascenseur à l'Immeuble
    *@param ascenseur un Ascenseur
    */
    public void ajouterAscenseur (Ascenseur ascenseur) {
        this.ascenseurs.add (ascenseur);
    }

}
