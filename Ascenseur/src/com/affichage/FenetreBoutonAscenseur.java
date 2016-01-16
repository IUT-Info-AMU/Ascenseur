/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurObservable;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Collection;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Gaëtan
 */
public class FenetreBoutonAscenseur extends JPanel implements AfficheurObservateur{

    
    public FenetreBoutonAscenseur(AscenseurObservable ascenseur){
        super();
        creerBouton();
        ascenseur.ajouterObserveur (this);
    }
    
    @Override
    public void afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mettreAJour(int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void creerBouton(){
        
        ButtonGroup groupeBouton = new ButtonGroup();
        
        JRadioButton requeteInterne = new JRadioButton("Requete Interne");
        requeteInterne.setActionCommand("requete interne");
        groupeBouton.add(requeteInterne);
        
        JRadioButton requeteExterne = new JRadioButton("Requete Externe");
        requeteExterne.setActionCommand("requete interne");
        groupeBouton.add(requeteExterne);
        
        this.add(requeteInterne);
        this.add(requeteExterne);
        
        JTextField numEtage = new JTextField();
        numEtage.setPreferredSize( new Dimension( 30, 20 ) );
        this.add(numEtage);
    }
    
}
