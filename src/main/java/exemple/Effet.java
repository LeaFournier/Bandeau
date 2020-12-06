/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author leabf
 */
public abstract class Effet {

    public Bandeau bandeau;
    protected int repetitions;
    protected String message;

    public Effet(int repetitions, Bandeau bandeau, String message) {
        this.repetitions = repetitions;
        this.bandeau = bandeau;
        this.message = message;

    }
    
    public abstract void afficher();

}
