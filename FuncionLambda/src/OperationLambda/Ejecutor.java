/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationLambda;

import funcionlambda.*;

/**
 *
 * @author ASUS
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("::: E x p r e s i o n e s   L a m b d a :::\n");
        System.out.println("OPERACIONES\n");
        //(parametros)-> {cuerpo-lamda}
        ICalculadora calculadora1 = (n1, n2)->{
            double resultado = n1+n2;
            System.out.println("\nEl resultado es: "+resultado+"\n");
        };
        calculadora1.operacion(5, 8);
        // 
        
         ICalculadora calculadora2 = (n1, n2)->{
            double resultado = n1-n2;
            System.out.println("\nEl resultado es: "+resultado+"\n");
        };
        calculadora2.operacion(5, 8);
         
    }
    
}
