/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;
import com.traitement.RequeteExterne;
import com.traitement.ascenseur.Ascenseur;
import java.util.LinkedList;

/**
 *
 * @author Thorrsten, Gaëtan (modification du fichier)
 */
public class ChoisirAscenseurSimple implements ControleurStrategie{
    
    /*
    *
    *@param requete RequeteExterne
    */
    public void choisirAscenseur (RequeteExterne requete) {
        
         LinkedList<RequeteExterne> requetes = Controleur.getRequetes ();
        
        //Pour chaque Ascenseur contenu dans ascenceurs
        for(Ascenseur ascenseur : Controleur.getAscenseurs () ){
            
            //si un Ascenseur n'a pas de requetes, alors on lui assigne celle-ci
            if (ascenseur.getRequetes().isEmpty()){
                ascenseur.ajouterRequete(requete);
                requetes.remove();
                break;
            }
        }//for()
    }//choisirAscenseur()  
}//class ChoisirAscenseurSimple
