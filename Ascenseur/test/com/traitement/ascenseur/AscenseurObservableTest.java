/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.affichage.AfficheurObservateur;
import com.traitement.Requete;
import java.util.Collection;
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
public class AscenseurObservableTest {
    
    public AscenseurObservableTest() {
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
     * Test of ajouterObserveur method, of class AscenseurObservable.
     */
    @Test
    public void testAjouterObserveur() {
        System.out.println("ajouterObserveur");
        AfficheurObservateur o = null;
        AscenseurObservable instance = new AscenseurObservableImpl();
        instance.ajouterObserveur(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirerObserveur method, of class AscenseurObservable.
     */
    @Test
    public void testRetirerObserveur() {
        System.out.println("retirerObserveur");
        AfficheurObservateur o = null;
        AscenseurObservable instance = new AscenseurObservableImpl();
        instance.retirerObserveur(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mettreAJourObservateurs method, of class AscenseurObservable.
     */
    @Test
    public void testMettreAJourObservateurs() {
        System.out.println("mettreAJourObservateurs");
        int numEtage = 0;
        boolean enMouvement = false;
        boolean ouvert = false;
        boolean bloque = false;
        Collection<Requete> requetes = null;
        AscenseurObservable instance = new AscenseurObservableImpl();
        instance.mettreAJourObservateurs(numEtage, enMouvement, ouvert, bloque, requetes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AscenseurObservableImpl extends AscenseurObservable {
    }
    
}
