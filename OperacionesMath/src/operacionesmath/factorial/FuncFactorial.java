/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmath.factorial;

/**
 *
 * @author ASUS
 */
public class FuncFactorial {

    int num;

    public int funcionFactorial(int numero) {
        System.out.println("---------------------------------");
        num = numero;
        int resultado = 0;
        double factorial;
        factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
            int fact = (int) factorial;
            System.out.println(" x " + i);
        }
        resultado = (int) factorial;
        return resultado;
    }
    public int funcionFactorialDo(double numero) {
        System.out.println("---------------------------------");
        num = (int)numero;
        int resultado = 0;
        double factorial;
        factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
            int fact = (int) factorial;
            System.out.println(" x " + i);
        }
        resultado = (int) factorial;
        return resultado;
    }
}
