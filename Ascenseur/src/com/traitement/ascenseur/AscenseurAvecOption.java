/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Bprog, Gaëtan (modification du fichier et javadoc)
 */
public interface AscenseurAvecOption {
    
    /**
    *Bloque les portes de l'ascenseur
    *@param bloquer boolean
    */
    public void bloquer (boolean bloquer);
    
    /**
    *Ouvre les portes de l'ascenseur
    *@param ouvrir boolean
    */
    public void ouvrir (boolean ouvrir);
    
    /**
    *Met en mouvement l'ascenseur
    *@param mouvement boolean
    */
    public void mettreEnMouvement (boolean mouvement);
    
    /**
    *Ajoute une Requete à l'ascenseur
    *@param r Requete
    */
    public void ajouterRequete (Requete r);
    
    /**
    *Creer une RequeteInterne
    *@param numEtage int
    */
    public void creerRequeteInterne (int numEtage);
    
    /**
    *Retourne le numéro d'étage
    *@return int numEtage
    */
    public int getNumEtage ();
    
    /**
    *Retourne une List de Requete
    *@return LinkedList<Requete>
    */
    public LinkedList<Requete> getRequetes ();
    
    /**
    *Retourne toutes les options de l'ascenseur dans un HashMap<String,String>
    *@return HashMap<String,String>
    */
    public HashMap<String,String> getOptions();
    
    /**
    *execute l'action de l'ascenseur
    */
    public void action ();
    
}
