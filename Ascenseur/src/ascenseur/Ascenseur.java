/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascenseur;

import java.util.ArrayList;

/**
 *
 * @author Bprog
 */
public class Ascenseur {

    private int numEtage;
    private ArrayList<Requete> requetes;
    
    public Ascenseur () {
        
    }
    
    public void bloquer () {
        
    }
    
    public void debloquer () {
        
    }
    
    public void ajouterRequete (Requete r) {
        this.requetes.add (r);
    }
    
    public void creerRequeteInterne (int numEtage) {
        RequeteInterne requete = new RequeteInterne (numEtage);
        this.requetes.add (requete);
    }
    
    public void action () {

    }
}
