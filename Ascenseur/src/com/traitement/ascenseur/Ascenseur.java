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
 * @author Bprog
 */
public abstract class Ascenseur extends AscenseurObservable{
    
    abstract public void bloquer (boolean bloquer);
    abstract public void ouvrir (boolean ouvrir);
    abstract public void mettreEnMouvement (boolean mouvement);
    
    abstract public void ajouterRequete (Requete r);
    abstract public void creerRequeteInterne (int numEtage);
    
    abstract public int getNumEtage ();
    abstract public LinkedList<Requete> getRequetes ();
    
    abstract public void action ();
    
}
