/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactorialDeUnNumero;

/**
 *
 * @author ASUS
 */
class NumeroFactorial {

    public static void main(String[] args) {
         String secuencia = "";
        int n = 6;
        int factorial;
       factorial= factorialNum(n);
       System.out.println("------------------");
        System.out.println(" El factorial de "+n+" es: "+factorial);
        secuencia = secuenciaFactorial(n);
         System.out.println(n+"!: "+secuencia);
    }
    public static int factorialNum(int num){
        int fact =0;
        int a = 1;
        int b = 0;
        int temp = 0;
        if(num == 0 || num == 1){
            return 1;
        }else if(num < 0){
            System.out.println("El factorial de un numero negativo no se puede calcular");
            return -1;
        }else{
            fact =1;
            for(int i=2 ; i <= num; i++){
                //   axb
                // 0x1x2x3x4x5x6x7x8x9
                b = i;
                temp = a*b;
                a = temp;
               System.out.println("Num x "+i+" : "+temp);
            }
            fact =temp;
             return fact;
        }
       
    }
    public static String secuenciaFactorial(int n){
        StringBuilder mensaje = new StringBuilder();
        for(int i =1; i <= n; i++){
             mensaje.append(i);
             if(i < n){
                mensaje.append("x"); 
             }
        }
        return mensaje.toString();
    }
}
