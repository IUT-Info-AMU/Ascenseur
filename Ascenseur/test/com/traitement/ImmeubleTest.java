/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.Ascenseur;
import com.traitement.ascenseur.AscenseurStandard;
import java.util.ArrayList;
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
public class ImmeubleTest {
    
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
        Immeuble instance = new Immeuble(0);
        int expResult = 0;
        int result = instance.getNombreEtage();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAscenseurs method, of class Immeuble.
     */
    @Test
    public void testGetAscenseurs() {
        System.out.println("getAscenseurs");
        Immeuble instance = new Immeuble(0);
        ArrayList<Ascenseur> expResult = new ArrayList<Ascenseur> ();
        ArrayList<Ascenseur> result = instance.getAscenseurs();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ajouterAscenseur method, of class Immeuble.
     */
    @Test
    public void testAjouterAscenseur() {
        System.out.println("ajouterAscenseur");
        AscenseurStandard a = new AscenseurStandard();
        Immeuble instance = new Immeuble(0);
        instance.ajouterAscenseur(a);
        
    }
    
}
