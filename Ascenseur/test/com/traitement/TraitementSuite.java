/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

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
@Suite.SuiteClasses({com.traitement.RequeteInterneTest.class, com.traitement.RequeteTest.class, com.traitement.controleur.ControleurSuite.class, com.traitement.ascenseur.AscenseurSuite.class, com.traitement.ClientTest.class, com.traitement.ImmeubleTest.class, com.traitement.RequeteExterneTest.class})
public class TraitementSuite {

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
