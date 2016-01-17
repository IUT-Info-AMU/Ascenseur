/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurObservable;
import javax.swing.JFrame;
import java.util.Collection;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jalal
 */
public class FenetreBoutonAscenseurTest {
    
    AscenseurObservable ascenseur;
    JFrame cadre;
    
    public FenetreBoutonAscenseurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of afficher method, of class FenetreBoutonAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testAfficher() {
        System.out.println("afficher");
        FenetreBoutonAscenseur instance = new FenetreBoutonAscenseur(ascenseur, 10, cadre);
        instance.afficher();
        
    }

    /**
     * Test of mettreAJour method, of class FenetreBoutonAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testMettreAJour() {
        System.out.println("mettreAJour");
        int numEtage = 0;
        boolean enMouvement = false;
        boolean ouvert = false;
        boolean bloque = false;
        Collection<Requete> requetes = ascenseur.getRequetes();
        HashMap<String, String> options = ascenseur.getOptions();
        FenetreBoutonAscenseur instance = new FenetreBoutonAscenseur(ascenseur, 10, cadre);
        instance.mettreAJour(numEtage, enMouvement, ouvert, bloque, requetes, options);
        
    }
    
}
