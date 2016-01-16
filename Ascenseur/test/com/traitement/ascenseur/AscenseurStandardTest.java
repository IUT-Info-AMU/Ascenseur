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
public class AscenseurStandardTest {
    
    AscenseurStrategie strategie;
    
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
        
    }

    /**
     * Test of getRequetes method, of class AscenseurStandard.
     */
    @Test
    public void testGetRequetes() {
        System.out.println("getRequetes");
        AscenseurStandard instance = new AscenseurStandard();
        LinkedList<Requete> expResult = instance.getRequetes();
        LinkedList<Requete> result = instance.getRequetes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMethode method, of class AscenseurStandard.
     */
    @Test
    public void testSetMethode() {
        System.out.println("setMethode");
        AscenseurStandard instance = new AscenseurStandard();
        instance.setMethode(strategie);
        
    }

    /**
     * Test of action method, of class AscenseurStandard.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        AscenseurStandard instance = new AscenseurStandard();
        instance.action();
        
    }

    /**
     * Test of toString method, of class AscenseurStandard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AscenseurStandard instance = new AscenseurStandard();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
