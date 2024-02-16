/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author ASUS
 */
public class MainEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        try {
            Basics basics = new Basics("");
            MdmGet mdmGet = new MdmGet();
            System.out.println("basics.getClass(): " + basics.getClass()
                    + "\n Basics.class: " + Basics.class);;
            if (basics.getClass().equals(Basics.class)) {
                basics.setNombre("Contact");
                System.out.println("" + basics.getNombre());
                mdmGet.setBasics(basics);
            }
            System.out.println("Imprime: " + mdmGet.getBasics().getNombre());
        } catch (NullPointerException e) {
            System.out.println("!!!DATOS NULOS!!!\n" + e);
        }
    }
    
}
