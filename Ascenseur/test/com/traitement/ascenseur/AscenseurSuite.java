/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.ascenseur;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jalal
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.traitement.ascenseur.OptionAscenseurTest.class, com.traitement.ascenseur.AscenseurObservableTest.class, com.traitement.ascenseur.AscenseurStrategieTest.class, com.traitement.ascenseur.AjoutRequeteAvanceTest.class, com.traitement.ascenseur.AscenseurAvecOptionTest.class, com.traitement.ascenseur.AscenseurAvecMusiqueTest.class, com.traitement.ascenseur.AscenseurStandardTest.class})
public class AscenseurSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
