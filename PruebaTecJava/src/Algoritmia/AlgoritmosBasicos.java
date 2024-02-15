package Algoritmia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class AlgoritmosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
           // matrizBidimensional();
          // declararArreglo();
          // printX(5);
           
    }
    
    public static void printX(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size -1) {
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
     public static void declararArreglo() {
          int[] arreglo=new int[5];
           arreglo[0]=45;
           arreglo[1]=22;
           arreglo[2]=35;
           arreglo[3]=12;
           arreglo[4]=8;
           
            for(int i=0; i<arreglo.length;i++){
                System.out.println(""+arreglo[i]);
            }
     }
     
    public static void matrizBidimensional() {
        int[][] matrizBidi = {
            {8, 7, 6},
            {5, 4, 3},
            {2, 1, 0}
        };

        for (int i = 0; i < matrizBidi.length; i++) {
            for (int j = 0; j < matrizBidi[i].length; j++) {
                System.out.println("numero " + matrizBidi[i][j] + " posicion (" + i + " , " + j + " )");
            }
        }
    }

    public static void matrizDosArreglos() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento " + matriz[i][j] + " en la posicion (" + i + " , " + j + ")");
            }

        }
        //Arreglo de numeros
        int[] numbers = {1, 2, 3};

        for (int i = 0; i < 3; i++) {
            //Imprimir el arreglo
            System.out.println("numero" + numbers[i] + " posicion " + i);
        }

    }
}
