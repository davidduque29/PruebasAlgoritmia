/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaTexto;

/**
 *
 * @author ASUS
 */
public class VariableTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("::: E x p r e s i o n e s   L a m b d a :::\n");
        //(parametros)-> {cuerpo-lamda}
         ICalculadora calculadora = (n)->System.out.println(n+"Bienvenido a las expresiones lambda ::");
        // si no se implementa calculadora.mensaje(); no se imprime el mensaje
        calculadora.mensaje("Ivan ");
    }
    
}
