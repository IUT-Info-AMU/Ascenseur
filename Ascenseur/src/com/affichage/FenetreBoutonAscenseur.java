/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurObservable;
import com.traitement.controleur.Controleur;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
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
    JRadioButton haut;
    JRadioButton bas;
    
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
    /*
    *actualise l'affichage (ici il n'y en a pas, mais la possibilité est à garder)
    */
    public void afficher() {
        //Do nothing
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
    }
    
    /*
    *Creer les boutons pour le choix des requêtes ainsi que la zone de texte pour rentrer le numéro d'étage
    */
    private void creerBouton(){
        
        ButtonGroup requetes = new ButtonGroup();
        ButtonGroup direction = new ButtonGroup();
        
        final JRadioButton haut = new JRadioButton("haut");
        haut.setVisible(false);
        direction.add(haut);
        final JRadioButton bas = new JRadioButton("bas");
        bas.setVisible(false);
        direction.add(bas);
        
        requeteInterne = new JRadioButton("Requete Interne");
        requeteInterne.setActionCommand("requete interne");
        requeteInterne.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                haut.setVisible(false);
                bas.setVisible(false);
            }     
        });
        requetes.add(requeteInterne);
        
        requeteExterne = new JRadioButton("Requete Externe");
        requeteExterne.setActionCommand("requete interne");
        requeteExterne.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                haut.setVisible(true);
                bas.setVisible(true);
            }     
        });
        requetes.add(requeteExterne);
        
        
        final JTextField numEtageTexte = new JTextField();
        numEtageTexte.setPreferredSize( new Dimension( 30, 20 ) );
       
        JButton envoyer = new JButton("Envoyer");
        envoyer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                if(!numEtageTexte.getText().isEmpty()){
                    if(requeteInterne.isSelected()){
                        ascenseur.creerRequeteInterne(Integer.parseInt(numEtageTexte.getText()));
                    }
                    else if(requeteExterne.isSelected()){
                        if(haut.isSelected()) {
                            Controleur.getInstance().creerRequeteExterne(Integer.parseInt(numEtageTexte.getText()), true);
                            Controleur.getInstance().choisirAscenseur(Controleur.getRequetes().getFirst());
                        }
                        else{
                            Controleur.getInstance().creerRequeteExterne(Integer.parseInt(numEtageTexte.getText()), false);
                            Controleur.getInstance().choisirAscenseur(Controleur.getRequetes().getFirst());
                        }
                    }
                }
            }
        });
        
        this.add(requeteInterne);
        this.add(requeteExterne);
        this.add(haut);
        this.add(bas);
        this.add(numEtageTexte);
        this.add(envoyer);          
    }
}
