/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

/**
 *
 * @author leabf
 */
public class Scenario {

    private Bandeau bandeau;
    ArrayList<Effet> mesEffets = new ArrayList<Effet>();

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effet mesEffets) {
        this.mesEffets.add(mesEffets);

    }

    public void afficherScenario() {
        for (Effet e : mesEffets) {
            e.afficher();
            bandeau.sleep(1000);
        }
        bandeau.close();
    }

}
