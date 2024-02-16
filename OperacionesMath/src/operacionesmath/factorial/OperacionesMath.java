/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmath.factorial;

import operacionesmath.factorial.FuncFactorial;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class OperacionesMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Operaciones \n");
        int resultado = 0;
        double resultadoDo = 0;
        FuncFactorial f = new FuncFactorial();

        Scanner leer = new Scanner(System.in);

        int num;
        System.out.println("Escribe el numero para el factorial\n");
        num = leer.nextInt();
        resultado = f.funcionFactorial(num);
        System.out.println("---------------------------------");
        System.out.println("El factorial de " + num + " es: " + resultado);
        double numero = 3;
        resultadoDo = f.funcionFactorialDo(numero);
        System.out.println("El factorial de " + num + " es: " + resultado);

    }

}
