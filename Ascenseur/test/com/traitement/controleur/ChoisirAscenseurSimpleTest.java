/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;

import com.traitement.RequeteExterne;
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
public class ChoisirAscenseurSimpleTest {
    
    public ChoisirAscenseurSimpleTest() {
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
     * Test of choisirAscenseur method, of class ChoisirAscenseurSimple.
     */
    @Test
    public void testChoisirAscenseur() {
        System.out.println("choisirAscenseur");
        RequeteExterne requete = null;
        ChoisirAscenseurSimple instance = new ChoisirAscenseurSimple();
        instance.choisirAscenseur(requete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
