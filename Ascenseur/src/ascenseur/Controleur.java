/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascenseur;

import java.util.ArrayList;

/**
 *
 * @author jeremtop
 */
public class Controleur {
    
    private static Controleur instance;
    private ArrayList<Requete> requetes;
    private ArrayList<Ascenseur> ascenseurs;
    
    private Controleur () {
        
    }
    
    public void creerRequeteExterne (int numEtage, boolean direction){
        Requete r = new RequeteExterne (numEtage, direction);
        requetes.add (r);
    }
    public void choisirAscenseur (){
        
    }
    
    public static Controleur getInstance () {
        if (instance == null) {
            instance = new Controleur ();
        }
        return instance;
    }
   
}
