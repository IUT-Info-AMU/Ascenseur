/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurObservable;
import java.util.Collection;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Gaëtan
 */
public class FenetreRequete extends JPanel implements AfficheurObservateur{

    private Collection<Requete> requetes;
    private JTextArea zoneTexte;
    
    public FenetreRequete(AscenseurObservable ascenseur){
        super();
        creerZoneTexte();
        ascenseur.ajouterObserveur (this);
    }
    
    @Override
    public void afficher() {
        String requetesString = "Requetes en cours : \n";
        for(Requete requete : requetes){
            
        }
        zoneTexte.setText(requetesString);
    }

    @Override
    public void mettreAJour(int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes) {
        this.requetes = requetes;
        afficher();
    }
    
    public void creerZoneTexte(){
        zoneTexte = new JTextArea(10,50);
        this.add(zoneTexte);
    }
}
