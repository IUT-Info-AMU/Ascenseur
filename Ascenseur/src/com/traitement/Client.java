/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.affichage.AfficheurEtatAscenseur;
import com.traitement.ascenseur.Ascenseur;
import com.traitement.ascenseur.AscenseurAvecMusique;
import com.traitement.ascenseur.AscenseurObservable;
import com.traitement.ascenseur.AscenseurStandard;
import com.traitement.controleur.Controleur;
import java.util.Scanner;

/**
 *
 * @author Bprog, Gaëtan (modification du fichier)
 */
public class Client {
    
    public static void main (String[] args) {
        
       
       /* 
        * To do: 
        * + exception
        */
       try{
        Immeuble immeuble = new Immeuble(10);
        
        for(int i = 0 ;i < 2; ++i){
           
           immeuble.ajouterAscenseur(new AscenseurStandard());
           Controleur.getInstance().ajouterAscenseur(new AscenseurStandard());
        }
           
        for(Ascenseur a : Controleur.getInstance().getAscenseurs()){
            new AfficheurEtatAscenseur ((AscenseurObservable) a);
        }
        
        while(true){
            
           System.out.println("Voulez-vous ajoutez une requete ? (O/N)");
           String reponse = new Scanner(System.in).next();
           while(reponse.length() > 1 ){ 
               System.out.println("un caractere seulement par requete (O/N)");
               reponse = new Scanner(System.in).next();
            }
           /*if(reponse.length()>1)throw new Exception("This exception is handled here.");*/
           reponse = reponse.toUpperCase(); 
           switch(reponse){
               
               case "O" :
                   System.out.println("Choisissez votre type de requete :\n \n" + 
                   "I pour interne \n" + 
                   "E pour externe \n");
           
                   String requeteChoisie = new Scanner(System.in).next();
                   requeteChoisie= requeteChoisie.toUpperCase();
                   switch(requeteChoisie){
                       
                       case "I":
                            System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                            int numeroEtageInt = new Scanner(System.in).nextInt();
                            while(numeroEtageInt > immeuble.getNombreEtage() ){ 
                                System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                                numeroEtageInt = new Scanner(System.in).nextInt();
                             }
                            int nbAsc = immeuble.getAscenseurs().size() -1;
                            System.out.println("Entrez un numero d'ascenseur (entre 0 et " + nbAsc + "):");
                            
                            int numeroAscenseur = new Scanner(System.in).nextInt();
                            while(numeroAscenseur > nbAsc ){ 
                                System.out.println("Entrez un numero d'ascenseur (entre 0 et " + nbAsc + "):");
                                numeroAscenseur = new Scanner(System.in).nextInt();
                             }
                            Controleur.getInstance().getAscenseurs().get(numeroAscenseur).creerRequeteInterne(numeroEtageInt);
                           break;
                           
                       case "E" :
                           System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                            int numeroEtageExt = new Scanner(System.in).nextInt();
                            while(numeroEtageExt > immeuble.getNombreEtage() ){ 
                                System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                                numeroEtageExt = new Scanner(System.in).nextInt();
                             }
                            Controleur.getInstance().creerRequeteExterne(numeroEtageExt, true);
                            Controleur.getInstance().choisirAscenseur(Controleur.getRequetes().getFirst());
                            break;
                       
                       default :
                           break;
                   }//switch requeteChoisie
   
               case "N" :
        
                   break;
                   
               default :
                   break;
           }//switch reponse
           
           for(Ascenseur a : Controleur.getInstance().getAscenseurs()){
               
               a.action();
           }
       }//while(true)
       } 
       catch(Exception e){
           System.err.println("Exception caught: "+e);         
       }
    } 
}
