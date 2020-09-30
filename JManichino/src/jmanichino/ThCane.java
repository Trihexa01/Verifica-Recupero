/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmanichino;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tr1h3xa
 */
public class ThCane extends Thread {

    int numeroCane;
    DatiCondivisi dati;

    public ThCane(int numeroCane, DatiCondivisi dati) {
        this.numeroCane = numeroCane;
        this.dati = dati;
    }
    public void run()
    { 
       System.out.println("Cane " + numeroCane + " PARTITO" );
       
        try {
            Thread.sleep((long)((Math.random() *2)*1000));
                    } catch (InterruptedException ex) {
            Logger.getLogger(ThCane.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Cane " + numeroCane + " PRENDE manichino" + numeroCane);
        dati.SemSignal(numeroCane);
    }
}
