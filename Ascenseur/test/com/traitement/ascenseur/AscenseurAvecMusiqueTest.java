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
 * @author jalal
 */
public class AscenseurAvecMusiqueTest {
    
    AscenseurAvecOption a;
            
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
    @Test(expected = NullPointerException.class)
    public void testAction() {
        System.out.println("action");
        AscenseurAvecMusique instance = new AscenseurAvecMusique(a, "lala") ;
        instance.action();
        
    }

    /**
     * Test of changerMusique method, of class AscenseurAvecMusique.
     */
    @Test(expected = NullPointerException.class)
    public void testChangerMusique() {
        System.out.println("changerMusique");
        String musique = "lala";
        AscenseurAvecMusique instance = new AscenseurAvecMusique(a, "lala");
        instance.changerMusique(musique);
        
    }
    
}
