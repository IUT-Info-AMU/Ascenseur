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
public class RequeteInterneTest {
    
    public RequeteInterneTest() {
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
     * Test of getNumEtage method, of class RequeteInterne.
     */
    @Test//(expected = NullPointerException.class)
    public void testGetNumEtage() {
        System.out.println("getNumEtage");
        RequeteInterne instance = new RequeteInterne(2);
        int expResult = 2;
        int result = instance.getNumEtage();
        assertEquals(expResult, result);
        
    }
    
}
