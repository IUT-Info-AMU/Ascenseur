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
public abstract class OptionAscenseur extends AscenseurObservable {
    
    protected AscenseurAvecOption ascenseur;
    
    public OptionAscenseur (AscenseurAvecOption ascenseur) {
        this.ascenseur = ascenseur;
    }
    
    @Override
    public void bloquer (boolean bloquer) {
        ascenseur.bloquer (bloquer);
    }
    @Override
    public void ouvrir (boolean ouvrir) {
        ascenseur.ouvrir (ouvrir);
    }
    @Override
    public void mettreEnMouvement (boolean mouvement) {
        ascenseur.mettreEnMouvement (mouvement);
    }   
    @Override
    public void ajouterRequete (Requete r) {
        ascenseur.ajouterRequete (r);
    }
    @Override
    public void creerRequeteInterne (int numEtage) {
        ascenseur.creerRequeteInterne (numEtage);
    }   
    @Override
    public int getNumEtage () {
        return ascenseur.getNumEtage ();
    }
    @Override
    public LinkedList<Requete> getRequetes () {
        return ascenseur.getRequetes ();
    }
    
    @Override
    public void action () {
        ascenseur.action ();
    }
    
}
