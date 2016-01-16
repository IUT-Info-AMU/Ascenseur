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
public class AscenseurTest {
    
    public AscenseurTest() {
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
     * Test of bloquer method, of class Ascenseur.
     */
    @Test
    public void testBloquer() {
        System.out.println("bloquer");
        boolean bloquer = false;
        Ascenseur instance = new AscenseurImpl();
        instance.bloquer(bloquer);
        
    }

    /**
     * Test of ouvrir method, of class Ascenseur.
     */
    @Test
    public void testOuvrir() {
        System.out.println("ouvrir");
        boolean ouvrir = true;
        Ascenseur instance = new AscenseurImpl();
        instance.ouvrir(ouvrir);
        
    }

    /**
     * Test of mettreEnMouvement method, of class Ascenseur.
     */
    @Test
    public void testMettreEnMouvement() {
        System.out.println("mettreEnMouvement");
        boolean mouvement = false;
        Ascenseur instance = new AscenseurImpl();
        instance.mettreEnMouvement(mouvement);
        
    }

    /**
     * Test of ajouterRequete method, of class Ascenseur.
     */
    @Test
    public void testAjouterRequete() {
        System.out.println("ajouterRequete");
        Requete r = new Requete();
        Ascenseur instance = new AscenseurImpl();
        instance.ajouterRequete(r);
       
    }

    /**
     * Test of creerRequeteInterne method, of class Ascenseur.
     */
    @Test
    public void testCreerRequeteInterne() {
        System.out.println("creerRequeteInterne");
        int numEtage = 0;
        Ascenseur instance = new AscenseurImpl();
        instance.creerRequeteInterne(numEtage);
        
    }

    /**
     * Test of getNumEtage method, of class Ascenseur.
     */
    @Test
    public void testGetNumEtage() {
        System.out.println("getNumEtage");
        Ascenseur instance = new AscenseurImpl();
        int expResult = 0;
        int result = instance.getNumEtage();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRequetes method, of class Ascenseur.
     */
    @Test
    public void testGetRequetes() {
        System.out.println("getRequetes");
        Ascenseur instance = new AscenseurImpl();
        LinkedList<Requete> expResult = instance.getRequetes();
        LinkedList<Requete> result = instance.getRequetes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of action method, of class Ascenseur.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        Ascenseur instance = new AscenseurImpl();
        instance.action();
        
    }

    public class AscenseurImpl implements Ascenseur {

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

        public void action() {
        }
    }
    
}
