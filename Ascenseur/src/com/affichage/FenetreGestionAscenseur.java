/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.ascenseur.AscenseurObservable;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Gaëtan
 */
public class FenetreGestionAscenseur extends JFrame{
    /*
    *Constructeur de FenetreGestionAscenseur
    */
    public FenetreGestionAscenseur (AscenseurObservable ascenseur){
        super("Ascenseur");
        setLayout(new BorderLayout());
        add(new FenetreBoutonAscenseur(ascenseur), BorderLayout.WEST);
        add(new FenetreRequete(ascenseur),BorderLayout.EAST);
        add(new FenetreAscenseur(ascenseur),BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
}
