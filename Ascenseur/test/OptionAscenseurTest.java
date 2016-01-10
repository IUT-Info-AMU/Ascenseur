
import org.junit.Test;
import com.traitement.ascenseur.Ascenseur;
import com.traitement.ascenseur.Musique;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bprog
 */
public class OptionAscenseurTest {
    @Test
    public void testOptionAscenseurTest () {
        System.out.println ("----test decorateur ascenseur----");
        Ascenseur ascenseurMusique = new Musique (new Ascenseur (), "Massive Attack - \"Butterfly Caught\"");
        ascenseurMusique.action ();
    }
}
