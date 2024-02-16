/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluarnulos;

import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class ValidarNull {
   private Objects obj;

    public ValidarNull() {
    
    }

    public Objects getObj() {
        return obj;
    }

    public void setObj(Objects obj) {
        this.obj = obj;
    }
   
     public void esNulo(Object o) throws Exception{
             if (Objects.isNull(o) ){
            System.out.println("Object is Null");
        } else {
            System.out.println("Not Null");
        }
     }

}
