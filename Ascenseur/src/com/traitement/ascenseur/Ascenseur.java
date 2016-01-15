/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.LinkedList;

/**
 *
 * @author Bprog, Gaëtan (modification du fichier)
 */
public abstract class Ascenseur extends AscenseurObservable{
    
    /*
    *Bloque les portes de l'ascenseur
    *@param bloquer boolean
    */
    abstract public void bloquer (boolean bloquer);
    
    /*
    *Ouvre les portes de l'ascenseur
    *@param ouvrir boolean
    */
    abstract public void ouvrir (boolean ouvrir);
    
    /*
    *MEt en mouvement l'ascenseur
    *@param mouvement boolean
    */
    abstract public void mettreEnMouvement (boolean mouvement);
    
    /*
    *Ajoute une Requete à l'ascenseur
    *@param r Requete
    */
    abstract public void ajouterRequete (Requete r);
    
    /*
    *Creer une RequeteInterne
    *@param numEtage int
    */
    abstract public void creerRequeteInterne (int numEtage);
    
    /*
    *Retourne le numéro d'étage
    *@return int numEtage
    */
    abstract public int getNumEtage ();
    
    /*
    *Retourne une List de Requete
    *@return LinkedList<Requete>
    */
    abstract public LinkedList<Requete> getRequetes ();
    
    /*
    *
    */
    abstract public void action ();
    
}
