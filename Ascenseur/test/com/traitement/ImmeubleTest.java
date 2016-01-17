/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.AscenseurAvecOption;
import java.util.ArrayList;
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
public class ImmeubleTest {
    
    AscenseurAvecOption ascenseur;
    
    public ImmeubleTest() {
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
     * Test of getNombreEtage method, of class Immeuble.
     */
    @Test
    public void testGetNombreEtage() {
        System.out.println("getNombreEtage");
        Immeuble instance = new Immeuble(10);
        int expResult = 10;
        int result = instance.getNombreEtage();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAscenseurs method, of class Immeuble.
     */
    @Test
    public void testGetAscenseurs() {
        System.out.println("getAscenseurs");
        Immeuble instance = new Immeuble(10);
        ArrayList<AscenseurAvecOption> expResult = new ArrayList<AscenseurAvecOption>() ;
        ArrayList<AscenseurAvecOption> result = instance.getAscenseurs();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ajouterAscenseur method, of class Immeuble.
     */
    @Test
    public void testAjouterAscenseur() {
        System.out.println("ajouterAscenseur");
        Immeuble instance = new Immeuble(10);
        instance.ajouterAscenseur(ascenseur);
        
    }
    
}
