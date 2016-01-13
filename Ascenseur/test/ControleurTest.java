
import com.affichage.Afficheur;
import com.affichage.AfficheurEtatAscenseur;
import com.traitement.RequeteExterne;
import com.traitement.ascenseur.AscenseurAvecMusique;
import com.traitement.ascenseur.AscenseurStandard;
import com.traitement.controleur.Controleur;
import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bprog
 */
public class ControleurTest {
    @Test
    public void testControleurTest () {
        AscenseurStandard a1 = new AscenseurStandard ();
        AscenseurStandard a2 = new AscenseurStandard ();
        AscenseurStandard a3 = new AscenseurStandard ();
        AscenseurAvecMusique aM1 = new AscenseurAvecMusique (a3, "Gégé - \"yolo banjo\"");

        Controleur.getInstance().ajouterAscenseur (a1);
        Controleur.getInstance().ajouterAscenseur (a2);
        Controleur.getInstance().ajouterAscenseur (a3);
        
        Controleur.getInstance().creerRequeteExterne (5, true);
        Controleur.getInstance().creerRequeteExterne (7, false);
        Controleur.getInstance().creerRequeteExterne (4, true);
        Controleur.getInstance().creerRequeteExterne (1, true);
        
        LinkedList<RequeteExterne> requetes = Controleur.getInstance().getRequetes ();
        for (RequeteExterne r : requetes) {
            Controleur.getInstance().choisirAscenseur (r);
        }
        
        ArrayList<Afficheur> observeurs = new ArrayList<Afficheur> ();
        observeurs.add (new AfficheurEtatAscenseur (a1));
        observeurs.add (new AfficheurEtatAscenseur (a2));
        observeurs.add (new AfficheurEtatAscenseur (a3));
        
        for ( ; ; ) {
            if ( !a1.getRequetes ().isEmpty () )
                a1.action ();
            if ( !a2.getRequetes ().isEmpty () )
                a2.action ();
            if ( !a2.getRequetes ().isEmpty () )
                a3.action ();
        }
    }
}
