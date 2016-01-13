
import com.traitement.ascenseur.AscenseurAvecMusique;
import com.traitement.ascenseur.AscenseurStandard;
import com.traitement.controleur.Controleur;

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
    AscenseurStandard a1 = new AscenseurStandard ();
    AscenseurStandard a2 = new AscenseurStandard ();
    AscenseurStandard a3 = new AscenseurStandard ();
    AscenseurAvecMusique aM1 = new AscenseurAvecMusique (a3, "Gégé - \"yolo banjo\"");
    
    Controleur.getInstance();
}
