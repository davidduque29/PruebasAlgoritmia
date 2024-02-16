/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futureasync;

import java.util.concurrent.Callable;

/**
 *
 * @author ASUS
 */
public class Hilo implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        int cont = 0;
        long tiempoInicial = System.currentTimeMillis();
         
        for (int i = 0; i < 100000; i++) {
            cont++;
           
        }
        long tiempoFinal = System.currentTimeMillis();
        long total = tiempoFinal-tiempoInicial;
      //  System.out.println("Tiempo total: "+total+" ms");
        return cont;
         
    }
    
}
