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
public class EvaluarNulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         User2 user;
        user = new User2();

        User1 getUserObject = user.getUser1Object();

        if (Objects.isNull(getUserObject) ){
            System.out.println("Object is Null");
        } else {
            System.out.println("Not Null");

            getUserObject.setName("Sam");
            System.out.println(getUserObject.getName());
        }
    }
    
}
