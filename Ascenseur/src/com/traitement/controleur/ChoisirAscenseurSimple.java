/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;
import com.traitement.RequeteExterne;
import com.traitement.ascenseur.AscenseurStandard;
import java.util.LinkedList;

/**
 *
 * @author Thorrsten
 */
public class ChoisirAscenseurSimple implements ControleurStrategie{
    
    public void choisirAscenseur (RequeteExterne requete) {
        
         LinkedList<RequeteExterne> requetes = Controleur.getRequetes ();
        
        //Pour chaque AscenseurStandard contenu dans ascenceurs
        for(AscenseurStandard ascenseur : Controleur.getAscenseurs () ){
            
            //si un AscenseurStandard n'a pas de requetes, alors on lui assigne celle-ci
            if (ascenseur.getRequetes().isEmpty()){
                ascenseur.ajouterRequete(requete);
                requetes.remove();
                break;
            }
        }//for()
    }//choisirAscenseur()  
}//class ChoisirAscenseurSimple
