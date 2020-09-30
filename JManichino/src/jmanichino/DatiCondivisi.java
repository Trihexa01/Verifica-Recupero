/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmanichino;

/**
 *
 * @author Tr1h3xa
 */
public class DatiCondivisi {
  Semafori semaforo1,semaforo2;
  
    public DatiCondivisi()
    {
      
       semaforo1 = new Semafori(0);
       semaforo2 = new Semafori(0);
  
    }
    public void SemWait(int num)
    {   
        if (num ==1)
        semaforo1.Wait();
        else
            semaforo2.Wait();
        
    }
     public void SemSignal(int num)
    {if (num ==1)
        semaforo1.Signal();
       else
            semaforo2.Signal();
    }
}