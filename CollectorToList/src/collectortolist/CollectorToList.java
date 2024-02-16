/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectortolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ASUS
 */
public class CollectorToList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Escribir la opcion: \n");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
         System.out.println("\n::::::::::: USO STREAMS PARA LISTAS :::::::::::\n");
                System.out.println("lista de Facturas:");
                Factura f = new Factura("ordenador", 1000);
                Factura f2 = new Factura("movil", 300);
                Factura f3 = new Factura("impresora", 200);
                Factura f4 = new Factura("imac", 1500);

                List<Factura> lista = new ArrayList<Factura>();

                lista.add(f);
                lista.add(f2);
                lista.add(f3);
                lista.add(f4);

                Factura facturaFiltro
                  = lista.stream()
                                .filter(elemento -> elemento.getImporte()->300).findFirst().get();

                System.out.println(facturaFiltro.getImporte());


    break;
            
    case 2:
        System.out.println("\n::::::::::: COLLECTORS :::::::::::\n");
            // Java code to show the implementation of
        // Collectors toList() function
        // creating a Stream of strings
        Stream<String> s = Stream.of("Geeks",
                "for",
                "GeeksforGeeks",
                "Geeks Classes");

        // using Collectors toList() function
        List<String> myList = s.collect(Collectors.toList());

        // printing the elements
        System.out.println("Resultado:\n "+myList);
            break;
            
            default:
                
                        break;
        }
   }
}
