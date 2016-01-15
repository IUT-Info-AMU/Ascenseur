/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

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
public class AscenseurAvecMusiqueTest {
    
    public AscenseurAvecMusiqueTest() {
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
     * Test of action method, of class AscenseurAvecMusique.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        AscenseurAvecMusique instance = null;
        instance.action();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changerMusique method, of class AscenseurAvecMusique.
     */
    @Test
    public void testChangerMusique() {
        System.out.println("changerMusique");
        String musique = "lala";
        AscenseurAvecMusique instance = null;
        instance.changerMusique(musique);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
