/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;

import com.traitement.RequeteExterne;
import com.traitement.ascenseur.Ascenseur;
import java.util.ArrayList;
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
public class ControleurTest {
    
    ControleurStrategie methode;
    Ascenseur a;
    
    public ControleurTest() {
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
     * Test of creerRequeteExterne method, of class Controleur.
     */
    @Test
    public void testCreerRequeteExterne() {
        System.out.println("creerRequeteExterne");
        int numEtage = 0;
        boolean direction = false;
        Controleur.getInstance().creerRequeteExterne(numEtage, direction);
        
    }

    /**
     * Test of choisirAscenseur method, of class Controleur.
     */
    @Test(expected = NullPointerException.class)
    public void testChoisirAscenseur() {
        System.out.println("choisirAscenseur");
        RequeteExterne requete = new RequeteExterne(0, false);
        Controleur.getInstance().choisirAscenseur(requete);
        
    }

    /**
     * Test of ajouterAscenseur method, of class Controleur.
     */
    @Test
    public void testAjouterAscenseur() {
        System.out.println("ajouterAscenseur");
        Controleur.getInstance().ajouterAscenseur(a);
        
    }

    /**
     * Test of getAscenseurs method, of class Controleur.
     */
    @Test
    public void testGetAscenseurs() {
        System.out.println("getAscenseurs");
        ArrayList<Ascenseur> result = Controleur.getAscenseurs();
        assertEquals(Controleur.getAscenseurs(), result);
        
    }

    /**
     * Test of getRequetes method, of class Controleur.
     */
    @Test
    public void testGetRequetes() {
        System.out.println("getRequetes");
        LinkedList<RequeteExterne> result = Controleur.getRequetes();
        assertEquals(Controleur.getRequetes(), result);
    }

    /**
     * Test of setMethode method, of class Controleur.
     */
    @Test
    public void testSetMethode() {
        System.out.println("setMethode");
        Controleur.getInstance().setMethode(methode);
        
    }

    /**
     * Test of getInstance method, of class Controleur.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Controleur result = Controleur.getInstance();
        assertEquals(Controleur.getInstance(), result);
        
    }
    
}
