/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosOperaciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {2, 9, 4, 10, 7, 3};
        SumasParesImpares lista1 = new SumasParesImpares();
        RunArrayFor runArrayFor = new RunArrayFor(); 
        getFutureInfo futureInfo = new getFutureInfo();

        Collection<Callable<Object>> callablesObj = new ArrayList<>();
        callablesObj.add(() -> {
            System.out.println("Entro SumasParesImpares");
            return lista1.filtrarNumeros(numeros);
        });
        callablesObj.add(() -> {
            System.out.println("Entro RunArrayFor");
            return runArrayFor ;
        });

        futureInfo.getFutureInfoLz(callablesObj);
        System.out.println("final");
    }

}
