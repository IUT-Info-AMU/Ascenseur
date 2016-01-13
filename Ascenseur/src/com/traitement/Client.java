/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.AscenseurStandard;
import com.traitement.controleur.Controleur;
import com.affichage.AfficheurEtatAscenseur;
import java.util.Scanner;

/**
 *
 * @author Bprog
 */
public class Client {
    
    public static void main (String[] args) {
        
       /* 
        * To do: 
        * + exception
        */
       
        Immeuble immeuble = new Immeuble(10);
       
        for(int i = 0 ;i < 2; ++i){
           
           immeuble.ajouterAscenseur(new AscenseurStandard());
           Controleur.getInstance().ajouterAscenseur(new AscenseurStandard());
        }
       
        for(AscenseurStandard a : Controleur.getInstance().getAscenseurs()){
               
            new AfficheurEtatAscenseur(a);    
        }
        
        while(true){
            
            System.out.println("Voulez-vous ajoutez une requete ? (O/N)");
           String reponse = new Scanner(System.in).next();

           switch(reponse){
               
               case "O" :
                   System.out.println("Choisissez votre type de requete :\n \n" + 
                   "I pour interne \n" + 
                   "E pour externe \n");
           
                   String requeteChoisie = new Scanner(System.in).next();
                                      
                   switch(requeteChoisie){
                       
                       case "I":
                            System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                            int numeroEtageInt = new Scanner(System.in).nextInt();
                            
                            int nbAsc = immeuble.getAscenseurs().size() -1;
                            System.out.println("Entrez un numero d'ascenseur (entre 0 et " + nbAsc + "):");
                            
                            int numeroAscenseur = new Scanner(System.in).nextInt();
                            Controleur.getInstance().getAscenseurs().get(numeroAscenseur).creerRequeteInterne(numeroEtageInt);
                           break;
                           
                       case "E" :
                           System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                            int numeroEtageExt = new Scanner(System.in).nextInt();
                            Controleur.getInstance().creerRequeteExterne(numeroEtageExt, true);
                            Controleur.getInstance().choisirAscenseur(Controleur.getRequetes().getFirst());
                            break;
                       
                       default :
                           break;
                   }//swtich requeteChoisie
   
               case "N" :
        
                   break;
                   
               default :
                   break;
           }//switch reponse
           
           for(AscenseurStandard a : Controleur.getInstance().getAscenseurs()){
               
               a.action();
           }
       }//while(true)
            
            /*
             System.out.println(reponse);
            
            while(reponse != "N"){
                System.out.println("Voulez-vous ajoutez une requete ? (O/N)");
                reponse = new Scanner(System.in).next();
               
                System.out.println(reponse);
                
                
                System.out.println("Choisissez votre type de requete :\n \n" + 
                   "I pour interne \n" + 
                   "E pour externe \n");
               
                String requeteChoisie = new Scanner(System.in).next();
                   
                    switch(requeteChoisie){
                       
                        case "I":
                            
                            System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                            int numeroEtageInt = new Scanner(System.in).nextInt();
                            
                            int nbAsc = immeuble.getAscenseurs().size() -1;
                            System.out.println("Entrez un numero d'ascenseur (entre 0 et " + nbAsc + "):");
                            
                            int numeroAscenseur = new Scanner(System.in).nextInt();
                            Controleur.getInstance().getAscenseurs().get(numeroAscenseur).creerRequeteInterne(numeroEtageInt);
                           break;
                           
                        case "E" :
                            System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                            int numeroEtageExt = new Scanner(System.in).nextInt();
                            Controleur.getInstance().creerRequeteExterne(numeroEtageExt, true);
                            Controleur.getInstance().choisirAscenseur(Controleur.getRequetes().getFirst());
                            break;
                       
                        default :
                           System.out.println("Mauvaise entree \n");
                           break;
                    }//swtich requeteChoisie
            //}//for(;;)
           
            for(AscenseurStandard a : Controleur.getInstance().getAscenseurs()){
               
               a.action();
            }
        }//while(true)
*/
    } 
}
