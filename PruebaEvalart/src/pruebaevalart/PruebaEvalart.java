/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaevalart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PruebaEvalart {

    static int n = 0;
    static int[] myArray = {1, 2, 2, 4, 5, 6, 7, 8, 8, 8};

    public static void main(String[] args) {
        // JAVASCRIPT
      

        // PREGUNTA 1
        /*Tiene un arreglo (llamado myArray) con 5 elementos (enteros en el rango de 1 a 100). 
        Escriba un programa en JavaScript que imprima el número más alto del arreglo 
        (Si se repite, solo imprimir una vez). El programa solo debe imprimir el número, 
        sin ningún texto.Tiene un arreglo (llamado myArray) con 5 elementos (enteros en el rango de 1 a 100). 
        Escriba un programa en JavaScript que imprima el número más alto del arreglo 
        (Si se repite, solo imprimir una vez). El programa solo debe imprimir el número, sin ningún texto.*/
        

        /*Pregunta 1 - Escribir un programa en Java que imprima una x construidaa a base de la letra X 
        if (n == 0) {
            System.out.println("ERROR");
            return;
        }

        String modelo = "";
        int temp = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || j == temp - 1) {
                    modelo += "X";
                } else {
                    modelo += "_";
                }
            }
            modelo += "\n";
            temp--;
        }
        System.out.println(modelo);
 }
 */
        
        /*Pregunta 2 -  
         int[] myArray = {1, 2, 2, 4, 5, 6, 7, 8, 8, 8};*/  
      
        Arrays.sort(myArray);

        int longest = 0;
        int number = 0;
        List<Integer> numerosSinRepetir = NumerosSinRepetir();
        for (int i = 0; i < numerosSinRepetir.size(); i++) {
            int temp = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] == numerosSinRepetir.get(i)) {
                    temp++;
                }
            }
            if (temp > longest) {
                longest = temp;
                number = numerosSinRepetir.get(i);
            }
            temp = 0;
        }
        System.out.println("Longest: " + longest + "\nNumber: " + number);
    }
       

    public static List<Integer> NumerosSinRepetir() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] != myArray[i + 1] || (myArray.length - 2 == i && myArray[i - 2] != myArray[i])) {
                list.add(myArray[i]);
            }
        }
        return list;
    }
    
 
}
