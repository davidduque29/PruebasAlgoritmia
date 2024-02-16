/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaevalart;

/**
 *
 * @author ASUS
 */
public class Histograma {
            public void arrayHistograma(){
                
                //        Pregunta 2
//Escribir un programa en JavaScript que recorra un arreglo y genere un histograma en base a los números de este. 
//El arreglo se llama myArray y contiene 10 elementos que corresponden a números enteros del 1 al 5. 
//Un histograma representa que tanto un elemento aparece en un conjunto de datos (Debe mostrar la frecuencia para todos los números del 1 al 5, 
//incluso si no están presentes en el arreglo). Por ejemplo, para el arreglo: myArray:=(1,2,1,3,3,1,2,1,5,1) el histograma se vería así:
//
//1: *****
//2: **
//3: **
//4:
//5: *
//
//El código para declarar y poblar myArray ya está ahí, 
//puede editarlo para probar con otros valores y puede hacer clic en el botón de actualizar junto a él 
//para volver al valor original que se utilizará para validar su código durante la prueba. 
//Asegúrese de que los resultados se impriman exactamente como aparecen aquí, 
//ya que incluso un espacio faltante o sobrante puede marcar la pregunta como incorrecta (Notar espacio entre los ":" y el primer asterisco).
        ///var myArray = [1,2,1,3,3,1,2,1,5,1];
                int myArray[] = new int[]{1, 2, 1, 3, 3, 1, 2, 1, 5, 1};
         String pila1="";
         String pila2="";
         String pila3="";
         String pila4="";
         String pila5="";
          
         for (int i = 0; i < myArray.length; i++) {
            switch (myArray[i]) {
        case 1:
                pila1+="*";
            break;
        case 2:
                pila2+="*";
            break;
        case 3:
                pila3+="*";
            break;
        case 4:
                pila4+="*";
            break;
        case 5:
                pila5+="*";
            break;
        default:
            throw new AssertionError();
}
        }
            System.out.println("1."+pila1);
            System.out.println("2."+pila2);
            System.out.println("3."+pila3);
            System.out.println("4."+pila4);
            System.out.println("5."+pila5); 
            }
}
