/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosiniciales2;

/**
 *
 * @author RubénEzequiel
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       System.out.println("Valores iniciales:");
      int A = 5;
      int B = 6;
      int C = 7;
      int D = 8;
        System.out.println("Valor A:" +A);
        System.out.println("Valor B:" +B);
        System.out.println("Valor C:" +C);
        System.out.println("Valor D:" +D);
      int E = B;
      E = B;
      B = C;
      C = A;
      A = D;
      D = E;
        System.out.println("Valores finales:");
        System.out.println("B toma el valor de C:" +B);
        System.out.println("C toma el valor de A:" +C);
        System.out.println("A toma el valor de D:" +A);
        System.out.println("D toma el valor de B:" +D);
          
      
      
      
        
         
    }
}
