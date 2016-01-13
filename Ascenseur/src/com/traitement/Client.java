/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.Ascenseur;
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
        * intancier l'immeuble
        * les ascensseurs
        * le controlleur
        * iteration 
        * + exception
        */
       
        Immeuble immeuble = new Immeuble(10);
       
       for(int i = 0 ;i < 2; ++i){
           
           immeuble.ajouterAscenseur(new AscenseurStandard());
           Controleur.getInstance().ajouterAscenseur(new AscenseurStandard());
       }
       
       for(Ascenseur a : Controleur.getInstance().getAscenseurs()){
               
            new AfficheurEtatAscenseur((AscenseurStandard)a);    
       }
       
       while(true){
           
           System.out.println("Voulez-vous ajoutez une requete ? (O/N)");
           String reponse = new Scanner(System.in).next();

           switch(reponse){
               
               case "O" :
                   System.out.println("Choisir votre type de requete :" + "\n" + 
                   "I pour interne"+ "\n" + 
                   "E pour externe" + "\n" + 
                   "autre pour ne rien faire");
           
                   String requeteChoisie = new Scanner(System.in).next();
                   
                   System.out.println("Entrez un numero d'etage (max " + immeuble.getNombreEtage() + "):");
                   int numeroEtage = new Scanner(System.in).nextInt();
                   
                   switch(requeteChoisie){
                       
                       case "I":
                            System.out.println("Entrez un numero d'ascenseur (entre 0 et " + immeuble.getAscenseurs().size() + "):");
                            int numeroAscenseur = new Scanner(System.in).nextInt();
                            Controleur.getInstance().getAscenseurs().get(numeroAscenseur).ajouterRequete(new RequeteInterne(numeroEtage));
                           break;
                           
                       case "E" :
                           Controleur.getInstance().creerRequeteExterne(numeroEtage, true);
                           Controleur.getInstance().choisirAscenseur(Controleur.getRequetes().getFirst());
                           break;
                       
                       default :
                           break;
                   }//swtich requeteChoisie
                   break;
                   
               case "N" :
                   System.out.println("Requete non ajoute");
                   break;
                   
               default :
                   break;
           }//switch reponse
           
           for(Ascenseur a : Controleur.getInstance().getAscenseurs()){
               
               a.action();
               
           }
       }//while(true)
    }
    
}
