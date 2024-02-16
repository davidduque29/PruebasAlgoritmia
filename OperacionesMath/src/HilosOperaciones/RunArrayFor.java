/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosOperaciones;

/**
 *
 * @author ASUS
 */
public class RunArrayFor {
    public void correrArray(){
         //imprimo los array con los pares e impares
            int[] numeros = {2, 9, 4, 10, 7, 3};
        System.out.println("{2, 9, 4, 10, 7, 3}");
          System.out.println(":::::::: Array PARES  ::::::::::::::");
         long tiempoInicial = System.currentTimeMillis();
         long tiempoTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Num: "+numeros[i] );
        }
        long tiempoFinal = System.currentTimeMillis();
        tiempoTotal =tiempoFinal-tiempoInicial;
        System.out.println("Tiempo total:  "+tiempoTotal+" mz");
        
        System.out.println("---- for each PAR ----");
        long tiempoTotalF = 0;
        long tiempoInit = System.currentTimeMillis();
        for (Object object : numeros) {
            System.out.println(""+object);
        }
       long tiempoFin  = System.currentTimeMillis();
        tiempoTotalF =tiempoFin-tiempoInit ;
        System.out.println("Tiempo total foreach:  "+tiempoTotalF+" mz");
    }
}
