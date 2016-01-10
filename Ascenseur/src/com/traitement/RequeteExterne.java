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
    
    private int numEtage;
    private boolean direction;
    
    public RequeteExterne (int numEtage, boolean direction) {
        this.numEtage = numEtage;
        this.direction = direction;
    }
    
    public int getNumEtage () {
        return numEtage;
    }
    
}
