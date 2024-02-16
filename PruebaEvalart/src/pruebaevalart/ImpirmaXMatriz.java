/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaevalart;

public class ImpirmaXMatriz {

    static int n = 0;

    public static void main(String[] args) {

        /* Escribir un programa en Java que imprima una x construidaa a base de la letra X y utilizar el caracter de subrayado
         como espacio, El tamaño de una variable se basa en una variable n que indicara el tamaño de la letra para imprimir
        (En una matriz de n x n) por ejemplo para n = 5 se obtiene:
        X___X
        _X_X_
        __X__
        _X_X_
        X___X
        y para n=6 e obtiene
        X___X
        _X_X_
        __X__
        _X_X_
        X___X
        _____
        
        Si n es igual a cero impirmir "ERROR"
        (El caracter X es en mayuscula y el guion bajo"_" para los espacios)
         */
        if (n == 0) {
            System.out.println("ERROR");
            return;
        }

        String template = "";
        int temp = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || j == temp - 1) {
                    template += "X";
                } else {
                    template += "_";
                }
            }
            template += "\n";
            temp--;
        }
        System.out.println(template);
    }

}
