/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmanichino;

import java.util.Scanner;

/**
 *
 * @author Tr1h3xa
 */
public class JManichino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        DatiCondivisi dati= new DatiCondivisi();
        Scanner scanner = new Scanner(System.in);
        String lettera = "";
        do {
            System.out.println("premi S per far lanciare 2 manichini e liberare i 2 cani o F per finire ");
            lettera = scanner.next();
            if (lettera.equals("S")) {
                ThManichino man1 = new ThManichino(1,dati);
                ThManichino man2 = new ThManichino(2,dati);
                ThCane can1 = new ThCane(1,dati);
                ThCane can2 = new ThCane(2,dati);
                man1.start();
                man2.start();
                Thread.sleep(100);
                can1.start();
                can2.start();
                man1.join();
                man2.join();
                can1.join();
                can2.join();
                System.out.println("MANICHINI SALVATI");
            }
           
        } while(!lettera.equals("F"));
    }
}
