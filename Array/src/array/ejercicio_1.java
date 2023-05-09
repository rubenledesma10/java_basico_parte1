/*
Realizar un programa que permita cargar 15 numeros en un vector. Una vez cargados, se necesita que el programa cuente
e informe por pantalla cuantas veces se cargo el numero 3
 */
package array_ejercicios;

import java.util.Scanner;


public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int vector [] = new int[15];
        
        for(int i =0; i<vector.length; i++){
            System.out.println("Ingrese el valor para el indice " +i);
            vector[i]=teclado.nextInt();
        }
        int contador = 0;
        for (int i = 0; i<vector.length; i++){
            if(vector[i]==3){
                contador++;
            }
    }
        System.out.println("La cantidad de numeros 3 que hay en este vector es de: " +contador);
    }
    
}
