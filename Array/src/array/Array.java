
package array;

import java.util.Scanner;

public class Array {

   
    public static void main(String[] args) {
        //DECLARACION
        
        int vector [] = new int [4]; //con esto declaro el vector y despues le digo cuantas posiciones va a tener
        
        /*ASIGNACION (MANUAL)
        
        vector [0]=2;
        vector [1]=35;
        vector [2]=48;
        vector [3]=157;*/
        
        //ASIGNACION POR TECLADO
        
        Scanner teclado = new Scanner (System.in);
        
        for (int i=0; i<vector.length; i++){
            System.out.println("Ingre el valor para el indice " +i);
            vector[i]=teclado.nextInt();
            
        }
        
        //RECORRIDO
        
        for (int i=0; i<vector.length; i++){
            System.out.println("Estoy en el indice " +i);
            System.out.println("Tengo guardado un " +vector[i]);
            System.out.println("--------------------");
        }
        
        
    }
    
}
