
import com.affichage.AfficheurEtatAscenseur;
import org.junit.Test;
import com.traitement.ascenseur.Ascenseur;
import com.affichage.AscenseurObserveur;
import java.util.ArrayList;

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
        //ceration des ascenseurs
        Ascenseur ascenseur1 = new Ascenseur ();
        Ascenseur ascenseur2 = new Ascenseur ();
        
        //ajout de requêtes
        ascenseur1.creerRequeteInterne (3);
        ascenseur1.creerRequeteInterne (10);
        ascenseur2.creerRequeteInterne (6);
        ascenseur2.creerRequeteInterne (2);
        
        //ajout des observeurs
        ArrayList<AscenseurObserveur> observeurs = new ArrayList<AscenseurObserveur> ();
        observeurs.add (new AfficheurEtatAscenseur (ascenseur1));
        observeurs.add (new AfficheurEtatAscenseur (ascenseur2));

        //simulation
        for ( ; ; ) {
            if ( !ascenseur1.getRequetes ().isEmpty () )
                ascenseur1.action ();
            if ( !ascenseur2.getRequetes ().isEmpty () )
                ascenseur2.action ();
        }
    }   
}
