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
public interface Ascenseur {
    
    public void bloquer (boolean bloquer);
    public void ouvrir (boolean ouvrir);
    public void mettreEnMouvement (boolean mouvement);
    
    public void ajouterRequete (Requete r);
    public void creerRequeteInterne (int numEtage);
    
    public int getNumEtage ();
    public LinkedList<Requete> getRequetes ();
    
    public void action ();
    
}
