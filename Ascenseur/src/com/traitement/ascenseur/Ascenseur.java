/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import com.traitement.RequeteInterne;
import java.util.ArrayList;

/**
 *
 * @author Bprog
 */
public class Ascenseur {

    private int numEtage;
    private boolean enMouvement;
    private boolean ouvert;
    private ArrayList<Requete> requetes;
    
    public Ascenseur () {
        this.enMouvement = false;
        this.ouvert = false;
    }
    
    public void bloquer () {
        this.enMouvement = false;
    }
    
    public void debloquer () {
        this.enMouvement = true;
    }
    
    public void ajouterRequete (Requete r) {
        this.requetes.add (r);
    }
    
    public void creerRequeteInterne (int numEtage) {
        RequeteInterne requete = new RequeteInterne (numEtage);
        this.requetes.add (requete);
    }
    
    public void action () {
        //todo
    }
}
