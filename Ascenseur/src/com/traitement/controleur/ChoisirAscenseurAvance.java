/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;
import com.traitement.RequeteExterne;
import com.traitement.ascenseur.AscenseurAvecOption;
import java.util.LinkedList;

/**
 *
 * @author Thorrsten, Gaëtan (modification du fichier et Javadoc)
 */
public class ChoisirAscenseurAvance implements ControleurStrategie{
  
    /*
    *Choix du bonne ascenseur pour la Requete entrante, le plus proche, celui qui n'a pas de Requete
    *@param requete RequeteExterne
    */
    @Override
    public void choisirAscenseur (RequeteExterne requete){
        
        LinkedList<RequeteExterne> requetes = Controleur.getRequetes ();
        
        //Pour chaque AscenseurAvecOption contenu dans ascenceurs :
        for(AscenseurAvecOption ascenseur : Controleur.getAscenseurs () ) {
            
            //si un AscenseurAvecOption n'a pas de requetes, alors on lui assigne celle-ci
            if (ascenseur.getRequetes().isEmpty()){
                
                ascenseur.ajouterRequete(requete);
                requetes.remove();
                break;
            }
            //si un ascenseur est au meme niveau que la requete à traiter
            else if (ascenseur.getRequetes().getFirst().getNumEtage() == requete.getNumEtage()){
                
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
