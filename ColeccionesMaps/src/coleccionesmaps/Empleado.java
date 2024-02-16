/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesmaps;

import java.util.*;

public class Empleado {
    public Empleado(String n){
    nombre =n;
    sueldo=2000;
}
    public String toString(){
        return "[Nombre="+nombre+", sueldo="+sueldo+"]";
    }
    private String nombre;
    private double sueldo;
    
}
