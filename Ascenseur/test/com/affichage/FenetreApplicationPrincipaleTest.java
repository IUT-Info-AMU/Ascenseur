/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

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
public class FenetreApplicationPrincipaleTest {
    
    public FenetreApplicationPrincipaleTest() {
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
     * Test of creerMenu method, of class FenetreApplicationPrincipale.
     */
    @Test
    public void testCreerMenu() {
        System.out.println("creerMenu");
        FenetreApplicationPrincipale instance = new FenetreApplicationPrincipale();
        instance.creerMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FenetreApplicationPrincipale.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FenetreApplicationPrincipale.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
