/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosOperaciones;

import java.time.LocalDateTime;

/**
 *
 * @author ASUS
 */
public class SumasParesImpares {

    public int filtrarNumeros(int[] numeros) {
        LocalDateTime fechaInicial = LocalDateTime.now();
        System.out.println("FechaInit: "+fechaInicial);
        int sumaPar = 0, sumaInPar = 0;
        int sumaTotalPar = 0, sumaTotalImpar = 0;
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
        return sumaTotalPar;
    }
}
