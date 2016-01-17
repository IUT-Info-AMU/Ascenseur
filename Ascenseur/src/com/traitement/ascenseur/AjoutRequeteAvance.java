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
 * @author Bprog, Gaëtan(Javadoc)
 */
public class AjoutRequeteAvance implements AscenseurStrategie {
    
    @Override
    /*
    *Ajoute une nouvelle Requete
    *@param int etageCounrant
    *@param LinkedList<Requete> requetes , les requetes
    *@param Requete r , nouvelle Requete
    *@return LinkedList<Requete> , retourne les requetes de l'ascenseur
    */
    public LinkedList<Requete> ajouterRequete (int etageCourant, LinkedList<Requete> requetes, Requete r) {
        
        LinkedList<Requete> requetesAscenseur = requetes;
        //si il n'y a pas de requete
        if (requetesAscenseur.isEmpty()) {
            requetesAscenseur.add (r);
        }
        //si il y a au mois une requete
        else {
            int i = 0;
            //si l'ascenseur monte
            if (requetesAscenseur.get(0).getNumEtage() > etageCourant) {
                if (r.getNumEtage() > etageCourant) {
                    while (i < requetesAscenseur.size() &&
                           requetesAscenseur.get(i).getNumEtage() < r.getNumEtage()) {
                        ++i;
                    }
                }
                else {  
                    while (i < requetesAscenseur.size() &&
                           requetesAscenseur.get(i).getNumEtage() > r.getNumEtage()) {
                        ++i;
                    }
                }
            }
            //si l'ascenseur descend
            else {
                if (r.getNumEtage() < etageCourant) {
                    while (i < requetesAscenseur.size() &&
                           requetesAscenseur.get(i).getNumEtage() > r.getNumEtage()) {
                        ++i;
                    }
                }
                else {  
                    while (i < requetesAscenseur.size() &&
                           requetesAscenseur.get(i).getNumEtage() < r.getNumEtage()) {
                        ++i;
                    }
                }
            }
            
            requetesAscenseur.add (i, r);
        }
        
        return requetesAscenseur;
    }
}
