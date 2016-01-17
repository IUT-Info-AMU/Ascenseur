/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurObservable;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Gaëtan
 */
public class FenetreBoutonAscenseur extends JPanel implements AfficheurObservateur{
    private AscenseurObservable ascenseur;
    private int     numEtage;
    private boolean enMouvement;
    private boolean ouvert;
    private boolean bloque;
    JRadioButton requeteInterne;
    JRadioButton requeteExterne;
    
    /*
    *Constructeur de FenetreBoutonAscenseur, ajoute un observateur à l'ascenseur passé en paramètre
    *@param AscenseurObservable ascenseur
    */
    public FenetreBoutonAscenseur(AscenseurObservable ascenseur){
        super();
        creerBouton();
        this.ascenseur = ascenseur;
        ascenseur.ajouterObserveur (this);
        
    }
    
    @Override
    public void afficher() {
        
    }
    @Override
    public void mettreAJour (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes) {
        this.numEtage = numEtage;
        this.enMouvement = enMouvement;
        this.ouvert = ouvert;
        this.bloque = bloque;
    }
    
    /*
    *Creer les boutons pour le choix des requètes ainsi que la zone de texte pour rentrer le numéro d'étage
    */
    private void creerBouton(){
        
        ButtonGroup groupeBouton = new ButtonGroup();
        
        requeteInterne = new JRadioButton("Requete Interne");
        requeteInterne.setActionCommand("requete interne");
        groupeBouton.add(requeteInterne);
        
        requeteExterne = new JRadioButton("Requete Externe");
        requeteExterne.setActionCommand("requete interne");
        groupeBouton.add(requeteExterne);
        
        final JTextField numEtage = new JTextField();
        numEtage.setPreferredSize( new Dimension( 30, 20 ) );
       
        JButton envoyer = new JButton("Envoyer");
        envoyer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                if(!numEtage.getText().isEmpty()){
                    if(requeteInterne.isSelected()){
                        ascenseur.creerRequeteInterne(Integer.parseInt(numEtage.getText()));
                    }
                    else if(requeteExterne.isSelected()){
                        
                    }
                }
            }
        });
        
        this.add(requeteInterne);
        this.add(requeteExterne);
        this.add(numEtage);
        this.add(envoyer);          
    }
}
