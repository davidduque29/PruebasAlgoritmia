/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HilosOperaciones;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;

public class getFutureInfo {

    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public Resultado getFutureInfoLz(Collection<Callable<Object>> callables) {
        List<Future<Object>> result;
        SumasParesImpares sum;
        RunArrayFor ArrayFor;

        Resultado resultado = new Resultado();
        try {
            result = executorService.invokeAll(callables);
            if (!result.isEmpty()) {
                for (Future<Object> f : result) {
                    if (f.get().getClass().equals(SumasParesImpares.class)) {
                        sum = (SumasParesImpares) f.get();
                        resultado.setSumasParesImpares(sum);

                    }
                    if (f.get().getClass().equals(RunArrayFor.class)) {
                        ArrayFor = (RunArrayFor) f.get();
                        resultado.setRunArrayFor(ArrayFor);

                    }
                }
            }
            return resultado;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }

    }
}
