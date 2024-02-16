/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesmaps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class ColeccionesMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------------ uso basico maps ---------");
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
        //            clave, valor
        personal.put("145",new Empleado("Juan"));
        personal.put("146",new Empleado("Ana"));
        personal.put("147",new Empleado("Antonio"));
        personal.put("148",new Empleado("Sandra"));
        
        System.out.println(personal);
        System.out.println("-------------uso lambda maps---------------");
        // Se crea for each para recorrer los datos almacenados en el map
        for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
        // Se define un nombre "entrada" al objeto 
        // que va a recorrer la coleccion "personal" 
        // donde se ingresan los datos
            String clave = entrada.getKey();//Obtiene el valor de la clave
            Empleado valor=  entrada.getValue();//Obtiene el valor del valor
            
            // Se crea una lambda que debe tener una interface 
            //con un metodo abstracto con los parametros
            IRegistroEmpleado registro = (n1, n2) ->{
            //Mediante el ciclo foreach se imprimen los valores que fueron 
            //almacenados en el map con su llave y valor
                System.out.println("Clave= "+clave+" valor= "+valor);
                
            };
            // Se invoca el metodo y se le pasan los valores 
        registro.mensaje(clave, valor);
         
        }
        //IRegistroEmpleado registro = ()
    }
    
}
