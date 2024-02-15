/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatecjava;

/**
 *
 * @author Ivan Duque println y print son dos métodos de la clase PrintStream en
 * Java que se utilizan para imprimir datos en la consola. La diferencia
 * principal entre ellos radica en cómo manejan los saltos de línea:
 *
 * println: Imprime los datos en la misma línea y luego mueve el cursor a la
 * siguiente línea. Esto agrega un salto de línea al final de la salida.
 *
 * print: Imprime los datos en la misma línea sin mover el cursor a la siguiente
 * línea. No agrega automáticamente un salto de línea al final de la salida.
 *
 * En el contexto de tu código, estás utilizando un bucle para imprimir la X. Si
 * utilizas println en lugar de print, estarás imprimiendo cada "X" en una nueva
 * línea, lo cual no creará la forma de la X que deseas.
 */
public class PruebaTecJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir una X hecha de la letra X
         imprimirX(5);
        // arregloTest(); //pregunta 4
        //recorrerArregloHistograma(); //pregunta5
        //  imprimirMayorOcurrencias();// pregunta 6
        //identificarCaminoMenorSuma();
    

    }
 /*
    la función imprimirX toma un parámetro size que determina el tamaño de la X.
La matriz se recorre con dos bucles, y se imprime una 'X' en las posiciones 
donde i es igual a j o donde i + j es igual a size - 1. En otras posiciones, 
se imprime un espacio en blanco. Este código generará una X en la consola. 
Puedes ajustar el tamaño cambiando el valor del parámetro size en la función 
imprimirX.   
         */
                    //   System.out.println("i: "+i+" == j: "+j +" -O- "+i+" + "+ j+" == "+ (size - 1));
    public static void imprimirX(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }//FIN PRIMER FOR
    }

    public static void arregloTest() {
        // <editor-fold defaultstate="collapsed" desc="Pregunta ">  
        //cual de las siguientes alternativas declara, construye e iniciliza correctamente
        // el arreglo myList
        // int []myList={ "1","2","3" }; - error
        // </editor-fold> 
        int myList[] = {5, 8, 2};
        for (int i = 0; i < myList.length; i++) {
            System.out.println("" + myList[i]);
        }
    }

    public static void recorrerArregloHistograma() {
        // <editor-fold defaultstate="collapsed" desc="Pregunta 5">  
        /*   
Escribir un programa en Java que recorra un arreglo y genere un histograma 
        en base a los números de este. El arreglo se llama myArray y contiene 
        10 elementos que corresponden a números enteros del 1 al 5. 
        Un histograma representa que tanto un elemento aparece en un conjunto 
        de datos (Debe mostrar la frecuencia para todos los números del 1 al 5, 
        incluso si no están presentes en el arreglo). Por ejemplo, para 
        el arreglo: myArray:=(1,2,1,3,3,1,2,1,5,1) el histograma se vería así:

1: *****
2: **
3: **
4:
5: *

El código para declarar y poblar myArray ya está ahí, puede editarlo para probar 
        con otros valores y puede hacer clic en el botón de actualizar junto a 
        él para volver al valor original que se utilizará para validar su código 
        durante la prueba. Asegúrese de que los resultados se impriman exactamente 
        como aparecen aquí, ya que incluso un espacio faltante o sobrante puede 
        marcar la pregunta como incorrecta (Notar espacio entre los ":" y 
        el primer asterisco y que los resultados deben mostrarse ordenados de 
        forma ascendente).

Nota: Asumir que esta escribiendo el codigo dentro de una clase Main, 
        por lo que no debe declarar la clase Main, pero si el metodo 
        public static void main para ejecutar su código. Java util 
        ya está importado, no requiere importar esta ni ninguna otra librería.*/
        // </editor-fold> 
        int[] myArray = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1};

        // Crear un array para almacenar la frecuencia de cada número
        int[] frecuenciaArreglo = new int[6]; // El índice 0 no se utiliza

        // Calcular la frecuencia de cada número en el arreglo
        for (int numero : myArray) {
            frecuenciaArreglo[numero]++;
        }

        // Imprimir el histograma
        System.out.println("Histograma:");

        for (int i = 1; i <= 5; i++) {
            int frecuencia = frecuenciaArreglo[i];
            System.out.print(i + ": ");

            for (int j = 0; j < frecuencia; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void imprimirMayorOcurrencias() {
// <editor-fold defaultstate="collapsed" desc="Pregunta 6">  
/*
Tiene un arreglo (llamado myArray) con 10 elementos 
(enteros en el rango de 1 a 9). 
Escriba un programa en Java que imprima el número que tiene más ocurrencias 
seguidas en el arreglo y también imprimir la cantidad de veces que aparece 
en la secuencia.

El código que llena el arreglo ya está escrito, pero puede editarlo para probar 
con otros valores. Con el botón de refrescar puede recuperar el valor original 
que será utilizado para evaluar la pregunta como correcta o incorrecta durante 
la ejecución.

Su programa debe analizar el arreglo de izquierda a derecha para que en caso de 
que dos números cumplan la condición, el que aparece por primera vez de 
izquierda a derecha será el que se imprima. La salida de los datos para 
el arreglo en el ejemplo (1,2,2,5,4,6,7,8,8,8) sería la siguiente:
        
Longest: 3
Number: 8

En el ejemplo, la secuencia más larga la tiene el número 8 con una secuencia de 
tres ochos seguidos. Tenga en cuenta que el código que escriba debe imprimir los 
resultados exactamente como se muestra con el fin de que la pregunta sea 
considerada válida.

El código para declarar y poblar myArray ya está ahí, puede editarlo para probar 
con otros valores y puede hacer clic en el botón de actualizar junto a él para 
volver al valor original que se utilizará para validar su código durante 
la prueba.

Nota: Asumir que esta escribiendo el codigo dentro de una clase Main, por lo que 
no debe declarar la clase Main, pero si el metodo public static void main para 
ejecutar su código. Java util ya está importado, no requiere importar esta ni 
ninguna otra librería.  
         */
// </editor-fold>  
        // Código para declarar y poblar myArray
        int[] myArray = {1, 2, 2, 5, 4, 6, 7, 8, 8, 8};

        // Inicializar variables para rastrear la secuencia actual
        int numeroActual = myArray[0];
        int conteoActual = 1;

        // Inicializar variables para rastrear la secuencia más larga
        int numeroMasLargo = myArray[0];
        int conteoMasLargo = 1;

        // Recorrer el arreglo de izquierda a derecha
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == numeroActual) {
                // Incrementar la longitud de la secuencia actual
                conteoActual++;
            } else {
                // Comprobar si la secuencia actual es más larga que la más larga hasta ahora
                if (conteoActual > conteoMasLargo) {
                    numeroMasLargo = numeroActual;
                    conteoMasLargo = conteoActual;
                }
                // Restablecer la secuencia actual para el nuevo número
                numeroActual = myArray[i];
                conteoActual = 1;
            }
        }

        // Comprobar la última secuencia después de salir del bucle
        if (conteoActual > conteoMasLargo) {
            numeroMasLargo = numeroActual;
            conteoMasLargo = conteoActual;
        }

        // Imprimir los resultados
        System.out.println("Longest: " + conteoMasLargo);
        System.out.println("Number: " + numeroMasLargo);
    }

    public static void identificarCaminoMenorSuma() {
        // <editor-fold defaultstate="collapsed" desc="Pregunta 7">  
/*      
Se tiene una matriz de n x n que contiene números del 1 al 9, 
  simulado usando una matriz unidimensional. 
         Así, por ejemplo, esta matriz:

1 2 9
2 5 3
5 1 5

Se representaría como (1,2,9,2,5,3,5,1,5). El objetivo es identificar el camino que de la menor suma al recorrer el arreglo bi-dimencional de izquierda a derecha. Se empieza en la columna izquierda y se mueve siempre una columna a la derecha de la misma fila o a una fila hacia arriba o hacia abajo. En el ejemplo, si parte de 1, puede pasar al 2 o al 5. De ahí, si pasó al 5 puede pasar al 9 al 3 o al 5. Por otro lado, si pasa del 1 al 2, desde el 2 de la columna del medio no podría pasar al 5 de la ultima fila en la columna derecha. El valor de n puede ser entre 1 y 4.

Es necesario encontrar el camino que produce el número más bajo al suma los valores de cada número que visita. Así que para el ejemplo, la ruta con la menor suma sería 1,2,3

El código para declarar y poblar myArray ya está ahí y tambien el que asinga el valor de n, puede editarlo para probar con otros valores y puede hacer clic en el botón de actualizar junto a él para volver al valor original que se utilizará para validar su código durante la prueba.

El resultado de su programa debe ser los n números por los que pasó para obtener la menor suma separados por un espacio. Para el ejemplo, la salida sería exactamente así:
1 2 3

Nota: Asumir que esta escribiendo el codigo dentro de una clase Main, por lo que no debe declarar la clase Main, pero si el metodo public static void main para ejecutar su código. Java util ya está importado, no requiere importar esta ni ninguna otra librería.  
         */
        // </editor-fold>  
        // Código para declarar y poblar myArray, y asignar el valor de n

        int[] myArray = {1, 2, 9, 2, 5, 3, 5, 1, 5};
        int n = 3;

        int[][] matrix = new int[n][n];

        for (int i = 0, k = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = myArray[k++];
            }
        }

        // Lógica para encontrar el camino con la menor suma
        int[] path = findMinSumPath(matrix, n);

        // Imprimir el resultado
        for (int value : path) {
            System.out.print(value + " ");
        }
    }

    public static int[] findMinSumPath(int[][] matrix, int n) {
        int[] path = new int[n];
        int minSum = Integer.MAX_VALUE;
        int startRow = 0;

        // Encontrar la fila de inicio con el valor mínimo en la primera columna
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] < minSum) {
                minSum = matrix[i][0];
                startRow = i;
            }
        }

        // Construir el camino con la menor suma
        int currentRow = startRow;
        for (int j = 0; j < n; j++) {
            path[j] = matrix[currentRow][j];

            if (j < n - 1) {
                int right = matrix[currentRow][j + 1];
                int down = (currentRow < n - 1) ? matrix[currentRow + 1][j + 1] : Integer.MAX_VALUE;

                if (right <= down) {
                    // Mover a la derecha
                    currentRow = currentRow;
                } else {
                    // Mover hacia abajo
                    currentRow = currentRow + 1;
                }
            }
        }

        return path;
    }

    
}
