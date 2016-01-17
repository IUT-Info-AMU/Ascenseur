/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.affichage.FenetreApplicationPrincipale;


/**
 *
 * @author Brice, Gaëtan (modification du fichier)
 */
public class Client {
    
    public static void main (String[] args) {
        
        try {
                new FenetreApplicationPrincipale ();
        }catch(Exception e){
               System.err.println("Exception caught: "+e);         
        }
    } 
}
