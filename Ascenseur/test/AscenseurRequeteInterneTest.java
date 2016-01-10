
import org.junit.Test;
import com.traitement.ascenseur.Ascenseur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bprog
 */
public class AscenseurRequeteInterneTest {
    @Test
    public void testAscenseurRequeteInterneTest () {
        Ascenseur ascenseur = new Ascenseur ();
        
        ascenseur.creerRequeteInterne (3);
        ascenseur.creerRequeteInterne (10);
        ascenseur.creerRequeteInterne (3);
        ascenseur.creerRequeteInterne (2);
        
        for (;;) {
            ascenseur.action ();
            System.out.println (ascenseur);
        }
    }
}
