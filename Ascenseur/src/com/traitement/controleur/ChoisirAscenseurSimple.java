/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;
import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurStandard;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Thorrsten
 */
public class ChoisirAscenseurSimple implements ComportementControleur{
    
    private LinkedList<Requete>              requetes;
    private ArrayList<AscenseurStandard>     ascenseurs;
    
     public void choisirAscenseur(Requete requete){
         
         int nbRequete;
         
        //Pour chaque AscenseurStandard a contenu dans ascenceurs
        for(AscenseurStandard a : ascenseurs){
            
            a.getRequetes();
        }
    }
}//class ChoisirAscenseurSimple
