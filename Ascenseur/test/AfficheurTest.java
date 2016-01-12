
import com.affichage.Afficheur;
import com.affichage.AfficheurEtatAscenseur;
import org.junit.Test;
import com.traitement.ascenseur.AscenseurStandard;
import com.traitement.ascenseur.AscenseurAvecMusique;
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
        AscenseurStandard ascenseur1 = new AscenseurStandard ();
        AscenseurStandard ascenseur2 = new AscenseurStandard ();
        AscenseurAvecMusique ascenseurMusique = new AscenseurAvecMusique (ascenseur2, "Massive Attack - \"Butterfly Caught\"");
        
        //ajout de requêtes
        ascenseur1.creerRequeteInterne (3);
        ascenseur1.creerRequeteInterne (10);
        ascenseur2.creerRequeteInterne (6);
        ascenseur2.creerRequeteInterne (2);
        
        //ajout des observeurs
        ArrayList<Afficheur> observeurs = new ArrayList<Afficheur> ();
        observeurs.add (new AfficheurEtatAscenseur (ascenseur1));
        observeurs.add (new AfficheurEtatAscenseur (ascenseur2));

        //simulation
        for ( ; ; ) {
            if ( !ascenseur1.getRequetes ().isEmpty () )
                ascenseur1.action ();
            if ( !ascenseur2.getRequetes ().isEmpty () )
                ascenseurMusique.action ();
        }
    }   
}
