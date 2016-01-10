
import com.affichage.AfficheurEtatAscenseur;
import com.affichage.AfficheurObserveur;
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
public class AfficheurTest {
    @Test
    public void testAfficheurTest () {
        Ascenseur ascenseur = new Ascenseur ();
        
        ascenseur.creerRequeteInterne (3);
        ascenseur.creerRequeteInterne (10);
        ascenseur.creerRequeteInterne (3);
        ascenseur.creerRequeteInterne (2);

        AfficheurObserveur afficheur = new AfficheurEtatAscenseur (ascenseur);
        for (;;) {
            ascenseur.action ();
        }
    }   
}
