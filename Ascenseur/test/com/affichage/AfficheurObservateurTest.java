/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.Requete;
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
public class AfficheurObservateurTest {
    
    public AfficheurObservateurTest() {
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
     * Test of afficher method, of class AfficheurObservateur.
     */
    @Test
    public void testAfficher() {
        System.out.println("afficher");
        AfficheurObservateur instance = new AfficheurObservateurImpl();
        instance.afficher();
        
    }

    /**
     * Test of mettreAJour method, of class AfficheurObservateur.
     */
    @Test
    public void testMettreAJour() {
        System.out.println("mettreAJour");
        int numEtage = 0;
        boolean enMouvement = false;
        boolean ouvert = false;
        boolean bloque = false;
        Collection<Requete> requetes = null;
        HashMap<String, String> options = null;
        AfficheurObservateur instance = new AfficheurObservateurImpl();
        instance.mettreAJour(numEtage, enMouvement, ouvert, bloque, requetes, options);
        
    }

    public class AfficheurObservateurImpl implements AfficheurObservateur {

        public void afficher() {
        }

        public void mettreAJour(int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes, HashMap<String, String> options) {
        }
    }
    
}
