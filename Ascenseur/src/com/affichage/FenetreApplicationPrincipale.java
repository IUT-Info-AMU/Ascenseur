/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.Immeuble;
import com.traitement.ascenseur.AscenseurAvecOption;
import com.traitement.ascenseur.AscenseurStandard;
import com.traitement.controleur.Controleur;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Gaëtan
 */
public class FenetreApplicationPrincipale extends JFrame{
    /*
    *Constructeur de FenetreApplicationPrincipale
    */
    public FenetreApplicationPrincipale (){
        super("Application");
        creerMenu ();
        
        final Immeuble immeuble = new Immeuble (10);
        
        JButton ajoutAscenseur = new JButton("+ Ascenseur");
        ajoutAscenseur.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent event) {
                AscenseurStandard a = new AscenseurStandard ();
                immeuble.ajouterAscenseur (a);
                Controleur.getInstance().ajouterAscenseur (a);
                new FenetreGestionAscenseur (a,immeuble.getNombreEtage());
            }
        });

        JButton action = new JButton("Action");
        action.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                for (AscenseurAvecOption a : Controleur.getInstance().getAscenseurs()) {
                    a.action();
                }
            }
        });
        JPanel p = new JPanel ();
        p.add (ajoutAscenseur);
        p.add (action);
        
        add (p);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    /*
    *Creer le menu et ses boutons
    */
    private void creerMenu() {
        JMenuBar menuBar = new JMenuBar();
        
        JMenu fichier = new JMenu("Fichier");
        JMenuItem fichierFermer = new JMenuItem("Fermer");
        fichierFermer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }        
        });
        fichier.add(fichierFermer);
        fichier.setMaximumSize(new Dimension(64,40));
        menuBar.add(fichier);
        
        JMenuItem documentation = new JMenuItem("Documentation");
        documentation.setMaximumSize(new Dimension(100,40));
        documentation.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    try {
                        //ouvre la javadoc
                        Desktop desktop = Desktop.getDesktop(); 
                        desktop.open(new File("./javadoc/index.html"));
                    } catch (IOException ex) {
                        Logger.getLogger(FenetreApplicationPrincipale.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Impossible d'ouvrir la javadoc !");
                    }
                }       
        });
        menuBar.add(documentation);
        
        JMenu aPropos = new JMenu("à propos de");
        JMenuItem equipe = new JMenuItem("Application crée par : Brice Maussang, "
                                        + "Jérémy Topalian, "
                                        +"Jalal Rabahi, "
                                        + "Victor Pedrazzini, "
                                        + "Gaëtan Perrot");
        aPropos.add(equipe);
        menuBar.add(aPropos);
        
        this.setJMenuBar(menuBar);
    }
}
