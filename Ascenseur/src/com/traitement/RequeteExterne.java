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
public class RequeteExterne extends Requete {
    
    private boolean haut;
    
    /*
    *Constructeur de RequeteExterne
    *@param numEtage numéro de l'étage voulu
    *@param direction indique la direction avec un booléen
    */
    public RequeteExterne (int numEtage, boolean direction) {
        this.numEtage = numEtage;
        this.haut = direction;
    }
    
    /*
    *Retourne le numéro d'étage
    *@return int numEtage
    */
    public int getNumEtage () {
        return numEtage;
    }
    
    /*
    *Retourne la direction, un booléen
    *@return boolean haut
    */
    public boolean getDirection(){
        
        return haut;
    }
    
}
