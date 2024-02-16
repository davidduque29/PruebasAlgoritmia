/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Basics objBasic = new Basics("Basic");
        Basics basics = new Basics("");
        Contact contact = null;
        String mensajeNulo="";

        MdmGet mdmGet1 = new MdmGet();        
        MdmGet mdmGet2 = new MdmGet();

        try {
            System.out.println("basics.getClass(): " + basics.getClass()
                    + "\n Basics.class: " + Basics.class);;
                    
            mdmGet1 = filterObject(objBasic, mdmGet1);
            mensajeNulo=errorValidate(mdmGet1);
            System.out.println("---------------------------------------");
            System.out.println("Objeto1: " + mdmGet1.getBasics().getNombre()
                    +"\n---------------------------------------\n Mensaje: "+mensajeNulo);
            
            /*mdmGet2 = filterObject(contact, mdmGet2);
            mensajeNulo=errorValidate(mdmGet2);         
            System.out.println("Objeto2: " + mensajeNulo
                    +"\n------------------------------");*/
  
          /*  if (Obj.getClass().equals(Basics.class)) {
                mdmGetObj.setBasics((Basics) Obj);*/

        } catch (NullPointerException e) {
            System.out.println("!!!DATOS NULOS!!!\n" + e);
        }
    }

    //public static es necesario 
    public static MdmGet filterObject(Object Obj, MdmGet mdmGetObj) {
        String msg = "";
        System.out.println("------------filterObject---------------");
        try {
            if (Obj.getClass().equals(Basics.class)) {
                mdmGetObj.setBasics((Basics) Obj);
                System.out.println("Entro setBasics");
            } else if (Obj.getClass().equals(Relation.class)) {
                mdmGetObj.setRelation((Relation) Obj);
                System.out.println("Entro setRelation");
            } else if (Obj.getClass().equals(Contact.class)) {
                System.out.println("Entro setContact");
                mdmGetObj.setContact((Contact) Obj);
            } else if (Obj.getClass().equals(Detailed.class)) {
                System.out.println("Entro setDetailed");
                mdmGetObj.setDetailed((Detailed) Obj);
            }
            return mdmGetObj;
        } catch (Exception e) {
            System.out.println("\nMetodo: filterObject - Error servicio nulo: \n"+e);
            return mdmGetObj;
        }
    }

    public static String errorValidate(MdmGet m) {
        String msgChain = "";
        String msgBasics = "";
        String msgContact = "";
        String msgDetailed = "";
        String msgRelation = "";

        msgBasics = (m.getBasics() == null) ? "MDM-Basics " : "";
        msgContact = (m.getContact() == null) ? "- MDM-Contact " : "";
        msgDetailed = (m.getDetailed() == null) ? "- MDM-Detailed " : "";
        msgRelation = (m.getRelation() == null) ? "- MDM-Relation " : "";
        msgChain = msgBasics + "" + msgContact + "" + msgDetailed + "" + msgRelation;

        return msgChain;
    }
    public static MdmGet filterObject2(Object Obj, MdmGet mdmGetObj) {
        String msg = "";
        System.out.println("------------filterObject---------------");
        try {
            MdmGet mdmGet = new MdmGet();
            List MdmGet = new  ArrayList();
            if (Obj.getClass().equals(Basics.class)) {
                mdmGetObj.setBasics((Basics) Obj);
            } else if (Obj.getClass().equals(Relation.class)) {
                mdmGetObj.setRelation((Relation) Obj);
                System.out.println("Entro setRelation");
            } else if (Obj.getClass().equals(Contact.class)) {
                System.out.println("Entro setContact");
                mdmGetObj.setContact((Contact) Obj);
            } else if (Obj.getClass().equals(Detailed.class)) {
                System.out.println("Entro setDetailed");
                mdmGetObj.setDetailed((Detailed) Obj);
            }
            return mdmGetObj;
        } catch (Exception e) {
            System.out.println("\nMetodo: filterObject - Error servicio nulo: \n"+e);
            return mdmGetObj;
        }
    }
}
