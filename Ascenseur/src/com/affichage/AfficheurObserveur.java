/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

/**
 *
 * @author Bprog
 */
public interface AfficheurObserveur {
    
    public void mettreAJour (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque);
    
}
