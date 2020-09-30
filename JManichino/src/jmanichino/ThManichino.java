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
public class ThManichino extends Thread{
    int numeroManichino;
    DatiCondivisi Dati;

    public ThManichino(int numeroManichino, DatiCondivisi Dati) {
        this.numeroManichino = numeroManichino;
        this.Dati = Dati;
        }
    public void run()
    {
   
      System.out.println("manichino " + numeroManichino + " LANCIATO" ) ;
   
      Dati.SemWait(numeroManichino);
      
      System.out.println("manichino " + numeroManichino + " INIZIA SALVATAGGIO" );
        try {
            Thread.sleep((long)((Math.random() *2)*1000));
                    } catch (InterruptedException ex) {
            Logger.getLogger(ThCane.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("manichino "+ numeroManichino +" FINE SALVATAGGIO" ) ;
      
    }
  
}
