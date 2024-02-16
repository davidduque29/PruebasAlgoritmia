/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmath.Arreglos;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(":::::::::::::::::::::: PAR O IMPAR :::::::::::::::::::::::::");
        int[] numeros = {2, 9, 4, 10, 7, 3};
        int sumaPar = 0, sumaInPar = 0;
        int sumaTotalPar = 0, sumaTotalImpar = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.println("Numero: " + numeros[i] + " Sí es par");
            } else {
                System.out.println("Numero: " + numeros[i] + " No es par");
            }
        }
        System.out.println("--------------------");
        System.out.println("::::::::::::::::: SUMA PARES E IMPARES ::::::::::::::::::::5");

        for (int i = 0; i < numeros.length; i++) {
            // suma de pares que se les suma 1
            if (numeros[i] % 2 == 0) {
                sumaPar = numeros[i] + 1;
                sumaTotalPar = sumaTotalPar + sumaPar;
                System.out.println("Pares:  " + numeros[i] + " + 1 es igual= " + sumaPar);
            } else {
                sumaInPar = numeros[i] + 1;
                sumaTotalImpar = sumaTotalImpar + sumaPar;
                System.out.println("Impares: " + numeros[i] + " + 1 es igual= " + sumaInPar);
            }
        }
        System.out.println("---------------------------");
        System.out.println("SUMA pares: " + sumaTotalPar);
        System.out.println("SUMA Impares: " + sumaTotalImpar);
        System.out.println("::::::::::::::::: SUMA PARES E IMPARES ::::::::::::::::::::");

        ArrayList numPar = new ArrayList();
        ArrayList numImPar = new ArrayList();
        for (int i = 0; i < numeros.length; i++) {
            // suma de pares que se les suma 1
            if (numeros[i] % 2 == 0) {
                numPar.add(numeros[i]);
             
            } else {
                numImPar.add(numeros[i]);
               
            }
        }
        //imprimo los array con los pares e impares
        System.out.println("{2, 9, 4, 10, 7, 3}");
          System.out.println(":::::::: Array PARES  ::::::::::::::");
         long tiempoInicial = System.currentTimeMillis();
         long tiempoTotal = 0;
        for (int i = 0; i < numPar.size(); i++) {
            System.out.println("Num: "+numPar.get(i));
        }
        long tiempoFinal = System.currentTimeMillis();
        tiempoTotal =tiempoFinal-tiempoInicial;
        System.out.println("Tiempo total:  "+tiempoTotal+" mz");
        
        System.out.println("---- for each PAR ----");
        long tiempoTotalF = 0;
        long tiempoInit = System.currentTimeMillis();
        for (Object object : numPar) {
            System.out.println(""+object);
        }
       long tiempoFin  = System.currentTimeMillis();
        tiempoTotalF =tiempoFin-tiempoInit ;
        System.out.println("Tiempo total foreach:  "+tiempoTotalF+" mz");
        
         System.out.println(":::::::: Array PARES  ::::::::::::::");
                 for (int i = 0; i < numImPar.size(); i++) {
            System.out.println("Num: "+numImPar.get(i));
        }
                        String num1="1054549309";       
       String num2="1054549309";
       
        if (num1=="1054549309") {
            System.out.println("iguales");
        }
         System.out.println("no son iguales");
    }
    

}
