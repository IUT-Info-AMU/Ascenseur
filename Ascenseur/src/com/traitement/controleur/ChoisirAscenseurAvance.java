/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;
import com.traitement.Requete;
import com.traitement.RequeteExterne;
import com.traitement.ascenseur.AscenseurStandard;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Thorrsten
 */
public class ChoisirAscenseurAvance implements ControleurStrategie{
  
    public void choisirAscenseur (RequeteExterne requete){
        
        LinkedList<RequeteExterne> requetes = Controleur.getInstance().getRequetes ();
        ArrayList<AscenseurStandard> ascenseurs = Controleur.getInstance().getAscenseurs ();
        //Pour chaque AscenseurStandard a contenu dans ascenceurs
        for(AscenseurStandard a : ascenseurs){
            
            //si un AscenseurStandard a n'a pas de requetes, alors on lui assigne celle-ci
            if (a.getRequetes().isEmpty()){
                a.getRequetes().add (requete);
            }
            else {
                //Si l'Assenceur a monte
                if (a.getRequetes().get(0).getNumEtage() > a.getNumEtage() && 
                        //ET la requete a traité se trouve sur le chemin de l'Ascensseur a
                        requete.getNumEtage() < a.getRequetes().get(0).getNumEtage() &&
                        requete.getNumEtage() > a.getNumEtage()){
                    
                    //On ajoute la requete en position 0 et devient prioritaire
                    a.getRequetes().add(0, requete);
                    //La requete est assigné au bon ascenseur, le controlleur ne s'en charge plus
                    requetes.removeFirst();
                }
                //Si l'Assenceur a descend
                else if (a.getRequetes().get(0).getNumEtage() < a.getNumEtage() &&
                        //ET la requete a traité se trouve sur le chemin de l'Ascensseur a
                        requete.getNumEtage() > a.getRequetes().get(0).getNumEtage() &&
                        requete.getNumEtage() < a.getNumEtage()){
                    
                    //On ajoute la requete en position 0 et devient prioritaire
                    a.getRequetes().add(0, requete);
                    //La requete est assigné au bon ascenseur, le controlleur ne s'en charge plus
                    requetes.removeFirst();
                }
            }
            
            //todo ascenseur par default
        }
        
        
    }//choisirAscenseur()
    
}//class ChoisirAscenseurAvance
