
import com.traitement.ascenseur.Ascenseur;
import org.junit.Test;
import com.traitement.ascenseur.AscenseurAvecMusique;
import com.traitement.ascenseur.AscenseurStandard;

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
        Ascenseur ascenseurMusique = new AscenseurAvecMusique (new AscenseurStandard (), "Massive Attack - \"Butterfly Caught\"");
        ascenseurMusique.action ();
    }
}
