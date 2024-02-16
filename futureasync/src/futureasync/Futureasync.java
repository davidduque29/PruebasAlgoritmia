/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futureasync;

import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class Futureasync {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int nNucleos = runtime.availableProcessors();
       int cont = 0;
 
       // Para devolver un valor en un hilo la interfaz COLLABLE
       // Uno envia otro recoge
       // Para RECOGER ESTE VALOR la interfaz FUTURE
        ExecutorService executor = Executors.newFixedThreadPool(nNucleos);
        Vector<Future<Integer>> vec = new Vector();
        
        //*executor solo pueden recibir Runnable
        //* execute es void no devuelve nada
        //* Los submit devuelven <T>Future<T> 
          //relacionamos un hilo - collable y un future
        
        for (int i = 0; i < nNucleos; i++) {
        // <T> Future<T> submit(Callable<T> task);
            //Devuelve un <T> Future<T>
            //recibe un Callable<T>
            Future<Integer> future = executor.submit(new Hilo());
            vec.add(future);
        }
        
        executor.shutdown();
        
        for (int i = 0; i < nNucleos; i++) {
            Future<Integer> future = vec.get(i);
            try {
                cont += future.get();
            } catch (InterruptedException ex) {
                Logger.getLogger(Futureasync.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(Futureasync.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("El resultado cont es : "+cont);
   } 
}
