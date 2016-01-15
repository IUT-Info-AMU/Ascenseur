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
        
        LinkedList<RequeteExterne> requetes = Controleur.getInstance().getRequetes ();
        
        //Pour chaque AscenseurStandard a contenu dans ascenceurs
        for(AscenseurStandard a : Controleur.getInstance().getAscenseurs () ){
            
            //si un AscenseurStandard a n'a pas de requetes, alors on lui assigne celle-ci
            if (a.getRequetes().isEmpty()){
                a.ajouterRequete(requete);
                requetes.remove();
                break;
            }
            else {
                //Si l'Assenceur a monte
                if (a.getRequetes().getFirst().getNumEtage() > a.getNumEtage() && 
                        //ET la requete a traité se trouve sur le chemin de l'Ascensseur a
                        requete.getNumEtage() < a.getRequetes().getFirst().getNumEtage() &&
                        requete.getNumEtage() > a.getNumEtage()){
                    
                    //On ajoute la requete en position 0 et devient prioritaire
                    a.ajouterRequete(requete);
                    //La requete est assigné au bon ascenseur, le controlleur ne s'en charge plus
                    requetes.removeFirst();
                    break;
                }
                //Si l'Assenceur a descend
                else if (a.getRequetes().getFirst().getNumEtage() < a.getNumEtage() &&
                        //ET la requete a traité se trouve sur le chemin de l'Ascensseur a
                        requete.getNumEtage() > a.getRequetes().getFirst().getNumEtage() &&
                        requete.getNumEtage() < a.getNumEtage()){
                    
                    //On ajoute la requete en position 0 et devient prioritaire
                    a.ajouterRequete(requete);
                    //La requete est assigné au bon ascenseur, le controlleur ne s'en charge plus
                    requetes.removeFirst();
                    break;
                }
            }
        }
    }//choisirAscenseur()
    
}//class ChoisirAscenseurAvance
