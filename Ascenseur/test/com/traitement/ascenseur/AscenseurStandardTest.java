/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.affichage.Afficheur;
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
 * @author r14004493
 */
public class AscenseurStandardTest {
    
    public AscenseurStandardTest() {
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
     * Test of bloquer method, of class AscenseurStandard.
     */
    @Test
    public void testBloquer() {
        System.out.println("bloquer");
        boolean bloquer = false;
        AscenseurStandard instance = new AscenseurStandard();
        instance.bloquer(bloquer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ouvrir method, of class AscenseurStandard.
     */
    @Test
    public void testOuvrir() {
        System.out.println("ouvrir");
        boolean ouvrir = false;
        AscenseurStandard instance = new AscenseurStandard();
        instance.ouvrir(ouvrir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mettreEnMouvement method, of class AscenseurStandard.
     */
    @Test
    public void testMettreEnMouvement() {
        System.out.println("mettreEnMouvement");
        boolean mouvement = false;
        AscenseurStandard instance = new AscenseurStandard();
        instance.mettreEnMouvement(mouvement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterRequete method, of class AscenseurStandard.
     */
    @Test
    public void testAjouterRequete() {
        System.out.println("ajouterRequete");
        Requete r = null;
        AscenseurStandard instance = new AscenseurStandard();
        instance.ajouterRequete(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creerRequeteInterne method, of class AscenseurStandard.
     */
    @Test
    public void testCreerRequeteInterne() {
        System.out.println("creerRequeteInterne");
        int numEtage = 0;
        AscenseurStandard instance = new AscenseurStandard();
        instance.creerRequeteInterne(numEtage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumEtage method, of class AscenseurStandard.
     */
    @Test
    public void testGetNumEtage() {
        System.out.println("getNumEtage");
        AscenseurStandard instance = new AscenseurStandard();
        int expResult = 0;
        int result = instance.getNumEtage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequetes method, of class AscenseurStandard.
     */
    @Test
    public void testGetRequetes() {
        System.out.println("getRequetes");
        AscenseurStandard instance = new AscenseurStandard();
        LinkedList<Requete> expResult = null;
        LinkedList<Requete> result = instance.getRequetes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of action method, of class AscenseurStandard.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        AscenseurStandard instance = new AscenseurStandard();
        instance.action();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AscenseurStandard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AscenseurStandard instance = new AscenseurStandard();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterObserveur method, of class AscenseurStandard.
     */
    @Test
    public void testAjouterObserveur() {
        System.out.println("ajouterObserveur");
        Afficheur o = null;
        AscenseurStandard instance = new AscenseurStandard();
        instance.ajouterObserveur(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirerObserveur method, of class AscenseurStandard.
     */
    @Test
    public void testRetirerObserveur() {
        System.out.println("retirerObserveur");
        Afficheur o = null;
        AscenseurStandard instance = new AscenseurStandard();
        instance.retirerObserveur(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mettreAJourObserveurs method, of class AscenseurStandard.
     */
    @Test
    public void testMettreAJourObserveurs() {
        System.out.println("mettreAJourObserveurs");
        AscenseurStandard instance = new AscenseurStandard();
        instance.mettreAJourObserveurs();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
