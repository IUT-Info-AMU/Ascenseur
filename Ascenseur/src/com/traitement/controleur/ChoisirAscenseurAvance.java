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
public class ChoisirAscenseurAvance implements ControleurStrategie{
  
    @Override
    public void choisirAscenseur (RequeteExterne requete){
        
        LinkedList<RequeteExterne> requetes = Controleur.getRequetes ();
        
        //Pour chaque AscenseurStandard a contenu dans ascenceurs
        for(AscenseurStandard ascenseur : Controleur.getAscenseurs () ){
            
            //si un AscenseurStandard a n'a pas de requetes, alors on lui assigne celle-ci
            if (ascenseur.getRequetes().isEmpty()){
                ascenseur.ajouterRequete(requete);
                requetes.remove();
                break;
            }
            else {
                //Si l'Assenceur  monte 
                if (ascenseur.getRequetes().getFirst().getNumEtage() > ascenseur.getNumEtage() && 
                    //Et requete ascendante
                    requete.getDirection() == true && 
                    //ET requete sur le chemin de l'ascenseur
                    requete.getNumEtage() > ascenseur.getNumEtage()){
                        
                        //On ajoute la requete à l'ascenseur
                        ascenseur.ajouterRequete(requete);
                        //La requete est assigné au bon ascenseur, le controlleur ne s'en charge plus
                        requetes.removeFirst();
                        break;
                    
                }
                //Si l'Assenceur  descend
                else if (ascenseur.getRequetes().getFirst().getNumEtage() < ascenseur.getNumEtage() &&
                    //Et requete descendante
                    requete.getDirection() == false && 
                    //ET requete sur le chemin de l'ascenseur
                    requete.getNumEtage() < ascenseur.getNumEtage()){
                    
                    //On ajoute la requete en position 0 et devient prioritaire
                    ascenseur.ajouterRequete(requete);
                    //La requete est assigné au bon ascenseur, le controlleur ne s'en charge plus
                    requetes.removeFirst();
                    break;
                }
            }
        }//for()
    }//choisirAscenseur()
}//class ChoisirAscenseurAvance
