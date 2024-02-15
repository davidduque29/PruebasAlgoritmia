package MetodoOrdenamiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int[] arreglo = {24, 12, 98, 4, 10, 2};
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);
        
        ordenarBurbuja(arreglo);
        
        System.out.println("\nArreglo ordenado:");
        imprimirArreglo(arreglo);
    }
        public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        System.out.println("\nArreglo tamanio:"+n);
     
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }
    
  
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
