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
    @Test
    public void testBloquer() {
        System.out.println("bloquer");
        boolean bloquer = false;
        OptionAscenseur instance = null;
        instance.bloquer(bloquer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ouvrir method, of class OptionAscenseur.
     */
    @Test
    public void testOuvrir() {
        System.out.println("ouvrir");
        boolean ouvrir = false;
        OptionAscenseur instance = null;
        instance.ouvrir(ouvrir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mettreEnMouvement method, of class OptionAscenseur.
     */
    @Test
    public void testMettreEnMouvement() {
        System.out.println("mettreEnMouvement");
        boolean mouvement = false;
        OptionAscenseur instance = null;
        instance.mettreEnMouvement(mouvement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterRequete method, of class OptionAscenseur.
     */
    @Test
    public void testAjouterRequete() {
        System.out.println("ajouterRequete");
        Requete r = null;
        OptionAscenseur instance = null;
        instance.ajouterRequete(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerRequeteInterne method, of class OptionAscenseur.
     */
    @Test
    public void testCreerRequeteInterne() {
        System.out.println("creerRequeteInterne");
        int numEtage = 0;
        OptionAscenseur instance = null;
        instance.creerRequeteInterne(numEtage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumEtage method, of class OptionAscenseur.
     */
    @Test
    public void testGetNumEtage() {
        System.out.println("getNumEtage");
        OptionAscenseur instance = null;
        int expResult = 0;
        int result = instance.getNumEtage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequetes method, of class OptionAscenseur.
     */
    @Test
    public void testGetRequetes() {
        System.out.println("getRequetes");
        OptionAscenseur instance = null;
        LinkedList<Requete> expResult = null;
        LinkedList<Requete> result = instance.getRequetes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of action method, of class OptionAscenseur.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        OptionAscenseur instance = null;
        instance.action();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class OptionAscenseurImpl extends OptionAscenseur {

        public OptionAscenseurImpl() {
            super(null);
        }
    }
    
}
