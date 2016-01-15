/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

/**
 *
 * @author Thorrsten
 */
public class RequeteInterne extends Requete {
    
    /*
    *Constructeur RequeteInterne
    *@param numEtage un int, le numéro étage
    */
    public RequeteInterne (int numEtage) {
        this.numEtage = numEtage;
    }
    
    /*
    *Retourne le numéro d'étage
    *@return int numEtage
    */
    public int getNumEtage () {
        return numEtage;
    }
    
}
