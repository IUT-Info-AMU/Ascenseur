/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traitement;

import com.traitement.ascenseur.AscenseurStandard;
import java.util.ArrayList;

/**
 *
 * @author Thorrsten
 */
public class Immeuble {
    
    private int nombreEtage;
    private ArrayList<AscenseurStandard> ascenseurs;
    
    public Immeuble () {
        this.ascenseurs = new ArrayList<AscenseurStandard> ();
    }
    
    public void ajouterAscenseur (AscenseurStandard a) {
        this.ascenseurs.add (a);
    }

}
