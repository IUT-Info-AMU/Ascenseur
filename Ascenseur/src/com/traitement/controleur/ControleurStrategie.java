/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;
import com.traitement.RequeteExterne;

/**
 *
 * @author Thorrsten, Gaëtan et Jérémy (Javadoc)
 */
public interface ControleurStrategie {
    /**
    *Choix du bon ascenseur pour la Requete entrante
    *@param req RequeteExterne
    */
    public void choisirAscenseur (RequeteExterne req);
    
}
