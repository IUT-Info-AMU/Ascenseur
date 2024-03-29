/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.affichage.AfficheurObservateur;
import com.traitement.Requete;
import java.util.Collection;
import java.util.HashMap;
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
    
    AscenseurObservable instance;
    AfficheurObservateur o;
    
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
    @Test(expected = NullPointerException.class)
    public void testAjouterObserveur() {
        System.out.println("ajouterObserveur");
        instance.ajouterObserveur(o);
        
    }

    /**
     * Test of retirerObserveur method, of class AscenseurObservable.
     */
    @Test(expected = NullPointerException.class)
    public void testRetirerObserveur() {
        System.out.println("retirerObserveur");
        instance.retirerObserveur(o);
        
    }

    /**
     * Test of mettreAJourObservateurs method, of class AscenseurObservable.
     */
    @Test(expected = NullPointerException.class)
    public void testMettreAJourObservateurs() {
        System.out.println("mettreAJourObservateurs");
        int numEtage = 0;
        boolean enMouvement = false;
        boolean ouvert = false;
        boolean bloque = false;
        Collection<Requete> requetes = instance.getRequetes();
        HashMap<String, String> options = instance.getOptions();
        instance.mettreAJourObservateurs(numEtage, enMouvement, ouvert, bloque, requetes, options);
        
    }

    public abstract class AscenseurObservableImpl extends AscenseurObservable {
    }
    
}
