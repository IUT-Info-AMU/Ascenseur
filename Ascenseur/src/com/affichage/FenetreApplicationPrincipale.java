/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Gaëtan
 */
public class FenetreApplicationPrincipale extends JFrame{
    FenetreApplicationPrincipale(){
        super("Fenètre principale");
        creerMenu();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public void creerMenu(){
        JMenuBar menuBar = new JMenuBar();
        
        JMenu parametre = new JMenu("Paramètres"); 
        menuBar.add(parametre);
        
        JMenuItem documentation = new JMenuItem("Documentation");
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
                                        + "Jérémie Topalian, "
                                        +"Jalal Rabahi, "
                                        + "Victor Pedrazzini, "
                                        + "Gaëtan Perrot");
        aPropos.add(equipe);
        menuBar.add(aPropos);
        
        this.setJMenuBar(menuBar);
    }
    
    public static void main (String[] args) {
        FenetreApplicationPrincipale application = new FenetreApplicationPrincipale();

    }
}