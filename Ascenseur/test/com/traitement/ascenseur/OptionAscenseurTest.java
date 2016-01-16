/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.LinkedList;
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
public class OptionAscenseurTest {
    
    OptionAscenseur instance;
    
    public OptionAscenseurTest() {
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
     * Test of bloquer method, of class OptionAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testBloquer() {
        System.out.println("bloquer");
        boolean bloquer = false;
        instance.bloquer(bloquer);
        
    }

    /**
     * Test of ouvrir method, of class OptionAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testOuvrir() {
        System.out.println("ouvrir");
        boolean ouvrir = false;
        instance.ouvrir(ouvrir);
        
    }

    /**
     * Test of mettreEnMouvement method, of class OptionAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testMettreEnMouvement() {
        System.out.println("mettreEnMouvement");
        boolean mouvement = false;
        instance.mettreEnMouvement(mouvement);
        
    }

    /**
     * Test of ajouterRequete method, of class OptionAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testAjouterRequete() {
        System.out.println("ajouterRequete");
        Requete r = new Requete();
        instance.ajouterRequete(r);
        
    }

    /**
     * Test of creerRequeteInterne method, of class OptionAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testCreerRequeteInterne() {
        System.out.println("creerRequeteInterne");
        int numEtage = 0;
        instance.creerRequeteInterne(numEtage);

    }

    /**
     * Test of getNumEtage method, of class OptionAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testGetNumEtage() {
        System.out.println("getNumEtage");
        int expResult = 0;
        int result = instance.getNumEtage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRequetes method, of class OptionAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testGetRequetes() {
        System.out.println("getRequetes");
        LinkedList<Requete> expResult = instance.getRequetes();
        LinkedList<Requete> result = instance.getRequetes();
        assertEquals(expResult, result);

    }

    /**
     * Test of action method, of class OptionAscenseur.
     */
    @Test(expected = NullPointerException.class)
    public void testAction() {
        System.out.println("action");
        instance.action();

    }

    public class OptionAscenseurImpl extends OptionAscenseur {

        public OptionAscenseurImpl() {
            super(null);
        }
    }
    
}
