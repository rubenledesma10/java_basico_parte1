/*
Realizar un programa que dado por el teclado un limite numero (por ejemplo 100) muestre en pantalla todos los numeros
hasta ese limite (empezando por 1)
 */
package ejercicios_estructuras_repetitivas;

import java.util.Scanner;

public class ejercicio_1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("¿Hasta qué número deseas que cuente? ");
        int num_limite = teclado.nextInt();
        
        for (int i=1; i<=num_limite; i++) {
            System.out.println(i);
        }
        
    }
    
}
