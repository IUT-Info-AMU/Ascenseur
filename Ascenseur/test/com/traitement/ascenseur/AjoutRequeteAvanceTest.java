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
public class AjoutRequeteAvanceTest {
    
    public AjoutRequeteAvanceTest() {
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
     * Test of ajouterRequete method, of class AjoutRequeteAvance.
     */
    @Test
    public void testAjouterRequete() {
        System.out.println("ajouterRequete");
        int etageCourant = 0;
        LinkedList<Requete> requetes = new LinkedList<Requete>();
        Requete r = new Requete();
        AjoutRequeteAvance instance = new AjoutRequeteAvance();
        LinkedList<Requete> expResult = instance.ajouterRequete(etageCourant, requetes, r);;
        LinkedList<Requete> result = instance.ajouterRequete(etageCourant, requetes, r);
        assertEquals(expResult, result);
        
    }
    
}
