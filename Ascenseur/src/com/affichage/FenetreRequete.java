/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurObservable;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Gaëtan
 */
public class FenetreRequete extends JPanel implements AfficheurObservateur{

    private Collection<Requete> requetes;
    private JTextArea zoneTexte;
    
    /*
    *Constructeur de FenetreRequete, ajouteunObservateur à l'ascenseur passé en paramètre
    *@param AscenseurObservable ascenseur
    */
    public FenetreRequete(AscenseurObservable ascenseur){
        super();
        creerZoneTexte();
        ascenseur.ajouterObserveur (this);
    }
    
    @Override
    /*
    *Actualise l'affichage
    */
    public void afficher() {
        String requetesString = "Requetes en cours : \n";
        for(Requete requete : requetes){
            requetesString += requete.toString()+"\n";
        }
        zoneTexte.setText(requetesString);
    }

    @Override
    /*
    *Met à jour l'observateur
    *@param int numEtage
    *@param boolean enMouvement
    *@param boolean ouvert
    *@param boolean bloque
    *@param Collection<Requete> requetes
    */
    public void mettreAJour(int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes,HashMap<String,String> options) {
        this.requetes = requetes;
        afficher();
    }
    /*
    *Créer la zone de texte de la fenètre, appelé dans le constructeur
    */
    private void creerZoneTexte(){
        zoneTexte = new JTextArea(10,50);
        this.add(zoneTexte);
    }
}
