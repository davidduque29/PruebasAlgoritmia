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
public class NumeroSinRepetir {
// PREGUNTA 2 - java

    static int[] myArray = {1, 2, 2, 4, 5, 6, 7, 8, 8, 8};

    public static void main(String[] args) {

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
