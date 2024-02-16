/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Metodos {

    public void factorial() {
        Scanner leer = new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("Escribe el numero para el factorial\n");
        num = leer.nextInt();
        System.out.println("---------------------------------");
        factorial = 1;

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
            int fact = (int) factorial;
            System.out.println(" x " + i);
        }
        System.out.println("---------------------------------");
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
