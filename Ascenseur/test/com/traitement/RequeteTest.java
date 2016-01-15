/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

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
public class RequeteTest {
    
    public RequeteTest() {
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
     * Test of getNumEtage method, of class Requete.
     */
    @Test
    public void testGetNumEtage() {
        System.out.println("getNumEtage");
        Requete instance = new Requete();
        int expResult = 0;
        int result = instance.getNumEtage();
        assertEquals(expResult, result);
        
    }
    
}
