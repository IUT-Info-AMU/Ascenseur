
import com.affichage.AfficheurEtatAscenseur;
import com.traitement.ascenseur.Ascenseur;
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
        
        ArrayList<Ascenseur> ascenseurs = new ArrayList<Ascenseur> ();
        ascenseurs.add (ascenseur1);
        ascenseurs.add (ascenseurMusique);
        
        //ajout de requêtes
        ascenseur1.creerRequeteInterne (3);
        ascenseur1.creerRequeteInterne (10);
        ascenseurMusique.creerRequeteInterne (6);
        ascenseurMusique.creerRequeteInterne (2);
        
        //ajout des observeurs
        new AfficheurEtatAscenseur (ascenseur2);
        new AfficheurEtatAscenseur (ascenseur1);
        
        for ( ; ; ) {
            if ( !ascenseur1.getRequetes ().isEmpty () )
                ascenseur1.action ();
            if ( !ascenseur2.getRequetes ().isEmpty () )
                ascenseurMusique.action ();
        }
    }   
}
