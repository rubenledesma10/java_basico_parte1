/*
Llevar a cabo un programa que permita cargar completamente con numeros 5 una matriz de 4x5(4 filas, 5 columnas)
 */
package array_ejercicios;

import java.util.Scanner;


public class ejercicio_5 {
    public static void main(String[] args) {
        int matriz[][]=new int[4][5];
        Scanner teclado = new Scanner (System.in);
        
        for(int f=0; f<4;f++){
            for (int c=0; c<5; c++){
                matriz[f][c]=5;
            }
        }
        
        for (int f=0; f<4; f++){
            for (int c=0; c<5; c++){
                System.out.print(matriz[f][c]);
            }
            System.out.print("\n");
        }
    }
}
