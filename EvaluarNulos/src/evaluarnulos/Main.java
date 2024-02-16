/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluarnulos;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  User2 user;
        user = new User2();

        User1 getUserObject = user.getUser1Object();
        
        ValidarNull validarNulo = new ValidarNull();
        
         
        //validarNulo.esNulo(getUserObject.setName());
        Scanner leer = new Scanner(System.in);
        Boolean num1 = true;
        Boolean num2 = true;
        Boolean num3 = true;
        Boolean num4 = true;

        try {

            System.out.println("Escriba un numero: \n");
            num4 = leer.nextBoolean();

            if (num1 == true && num2 == true && num3 == true && num4 == true) {
                System.out.println("todos son nulos");
            } else {
                System.out.println("alguno no es nulo");
            }
        } catch (Exception e) {
            System.out.println("Error no es un numero: "+e.getMessage());
        }*/
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[5];
        numeros[0] = 4;
        numeros[1] = 8;
        numeros[2] = 2;
        numeros[3] = 9;
        numeros[4] = 5;
        try{
              for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero: "+numeros[i]);
            
        }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
      try{
              for (int i = 0; i < numeros.length - 1; i++) {
            System.out.println(" -1 Numero : "+numeros[i]);
            
        }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
     
    }

}
