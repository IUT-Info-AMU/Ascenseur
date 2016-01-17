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
public class FenetreAscenseur extends JPanel implements AfficheurObservateur{

    private int     numEtage;
    private boolean enMouvement;
    private boolean ouvert;
    private boolean bloque;
    private JTextArea zoneTexte;
    private HashMap<String, String> options;
    
    /*
    *Cosntructeur de FenetreAscenseur, ajoute un observateur à l'ascenseur passé en paramètre
    *@param AscenseurObservable ascenseur
    */
    public FenetreAscenseur(AscenseurObservable ascenseur){
        ascenseur.ajouterObserveur (this);
        add(this.zoneTexte = new JTextArea("Vue Ascenseur sous forme de texte",10,50));
    }
    
    @Override
    /*
    *actualise l'affichage
    */
    public void afficher() {
        String ascenseurEtat = "---Ascenseur---\netage: " + numEtage + "\netat: ";
        
        if ( bloque )
            ascenseurEtat += "BLOQUE";
        else {
            if ( ouvert )
                ascenseurEtat += "ouvert, ";
            else
                ascenseurEtat += "fermé, ";
            if ( enMouvement )
                ascenseurEtat += "en mouvement";
            else
                ascenseurEtat += "à l'arrêt";
        }
        if(options != null)
            zoneTexte.setText(ascenseurEtat + "\n" + options.toString());
        else{
            zoneTexte.setText(ascenseurEtat);
        }
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
    public void mettreAJour (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes,HashMap<String,String> options) {
        this.numEtage = numEtage;
        this.enMouvement = enMouvement;
        this.ouvert = ouvert;
        this.bloque = bloque;
        this.options = options;
        afficher ();
    }
    
}
