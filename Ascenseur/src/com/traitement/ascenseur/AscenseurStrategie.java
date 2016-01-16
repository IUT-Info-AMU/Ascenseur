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
 * @author Bprog
 */
public interface AscenseurStrategie {
    
    public LinkedList<Requete> ajouterRequete (int etageCourant, LinkedList<Requete> requetes, Requete r);
    
}
