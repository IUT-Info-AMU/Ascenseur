/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.LinkedList;

/**
 *
 * @author Bprog, Gaëtan (javadoc)
 */
public interface AscenseurStrategie {
    /*
    *Ajoute une Requete
    *@param int etageCourant
    *@param LinkedList<Requete> requetes , la liste des requetes actuelles
    @param Requete r , la nouvelle Requete
    *@return LinkedList<Requete>
    */
    public LinkedList<Requete> ajouterRequete (int etageCourant, LinkedList<Requete> requetes, Requete r);
    
}
