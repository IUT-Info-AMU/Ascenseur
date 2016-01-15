/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.Requete;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author r14004493
 */
public class AfficheurTest {
    
    public AfficheurTest() {
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
     * Test of afficher method, of class Afficheur.
     */
    @Test
    public void testAfficher() {
        System.out.println("afficher");
        Afficheur instance = new AfficheurImpl();
        instance.afficher();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mettreAJour method, of class Afficheur.
     */
    @Test
    public void testMettreAJour() {
        System.out.println("mettreAJour");
        int numEtage = 0;
        boolean enMouvement = false;
        boolean ouvert = false;
        boolean bloque = false;
        Collection<Requete> requetes = null;
        Afficheur instance = new AfficheurImpl();
        instance.mettreAJour(numEtage, enMouvement, ouvert, bloque, requetes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AfficheurImpl implements Afficheur {

        public void afficher() {
        }

        public void mettreAJour(int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes) {
        }
    }
    
}
