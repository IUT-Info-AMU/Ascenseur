/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import com.traitement.Requete;
import java.util.HashMap;
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
public class AscenseurAvecOptionTest {
    
    public AscenseurAvecOptionTest() {
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
     * Test of bloquer method, of class AscenseurAvecOption.
     */
    @Test
    public void testBloquer() {
        System.out.println("bloquer");
        boolean bloquer = false;
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        instance.bloquer(bloquer);
        
    }

    /**
     * Test of ouvrir method, of class AscenseurAvecOption.
     */
    @Test
    public void testOuvrir() {
        System.out.println("ouvrir");
        boolean ouvrir = false;
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        instance.ouvrir(ouvrir);
        
    }

    /**
     * Test of mettreEnMouvement method, of class AscenseurAvecOption.
     */
    @Test
    public void testMettreEnMouvement() {
        System.out.println("mettreEnMouvement");
        boolean mouvement = false;
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        instance.mettreEnMouvement(mouvement);
        
    }

    /**
     * Test of ajouterRequete method, of class AscenseurAvecOption.
     */
    @Test
    public void testAjouterRequete() {
        System.out.println("ajouterRequete");
        Requete r = new Requete();
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        instance.ajouterRequete(r);
        
    }

    /**
     * Test of creerRequeteInterne method, of class AscenseurAvecOption.
     */
    @Test
    public void testCreerRequeteInterne() {
        System.out.println("creerRequeteInterne");
        int numEtage = 0;
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        instance.creerRequeteInterne(numEtage);
        
    }

    /**
     * Test of getNumEtage method, of class AscenseurAvecOption.
     */
    @Test
    public void testGetNumEtage() {
        System.out.println("getNumEtage");
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        int expResult = 0;
        int result = instance.getNumEtage();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRequetes method, of class AscenseurAvecOption.
     */
    @Test
    public void testGetRequetes() {
        System.out.println("getRequetes");
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        LinkedList<Requete> expResult = instance.getRequetes();
        LinkedList<Requete> result = instance.getRequetes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getOptions method, of class AscenseurAvecOption.
     */
    @Test
    public void testGetOptions() {
        System.out.println("getOptions");
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        HashMap<String, String> expResult = instance.getOptions();
        HashMap<String, String> result = instance.getOptions();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of action method, of class AscenseurAvecOption.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        AscenseurAvecOption instance = new AscenseurAvecOptionImpl();
        instance.action();
        
    }

    public class AscenseurAvecOptionImpl implements AscenseurAvecOption {

        public void bloquer(boolean bloquer) {
        }

        public void ouvrir(boolean ouvrir) {
        }

        public void mettreEnMouvement(boolean mouvement) {
        }

        public void ajouterRequete(Requete r) {
        }

        public void creerRequeteInterne(int numEtage) {
        }

        public int getNumEtage() {
            return 0;
        }

        public LinkedList<Requete> getRequetes() {
            return null;
        }

        public HashMap<String, String> getOptions() {
            return null;
        }

        public void action() {
        }
    }
    
}
