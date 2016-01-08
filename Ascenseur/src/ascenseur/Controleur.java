/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascenseur;

/**
 *
 * @author jeremtop
 */
public class Controleur {
    private static Controleur instance;
    
    private Controleur () {
        
    }
    
    public void creerRequeteExterne(){
        //todo
    }
    public void choisirAscenseur(){
        //todo
    }
    
    public static Controleur getInstance () {
        if (instance == null) {
            instance = new Controleur ();
        }
        return instance;
    }
   
}
