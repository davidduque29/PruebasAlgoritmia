package NumeroMayor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class EncontrarMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 8, 12, 3, 7, 10};
          
          int numeroMayor = encontrarMayor(arreglo);
          System.out.println("El numero mayor en el arreglo es: "+numeroMayor);
    }
    public static int encontrarMayor(int[] arregloNum){
        int mayor =arregloNum[0];
        for (int i = 0; i < arregloNum.length; i++) {
            if (arregloNum[i]> mayor) {
                mayor = arregloNum[i];
            }
        }
        
        return mayor;
    }
}
