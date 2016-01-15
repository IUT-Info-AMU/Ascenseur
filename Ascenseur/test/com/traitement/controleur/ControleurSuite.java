/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement.controleur;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author r14004493
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.traitement.controleur.ChoisirAscenseurSimpleTest.class, com.traitement.controleur.ControleurTest.class, com.traitement.controleur.ControleurStrategieTest.class, com.traitement.controleur.ChoisirAscenseurAvanceTest.class})
public class ControleurSuite {

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
