/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author RubénEzequiel
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;
        System.out.println("Lectura de los elementos array");
        for (i = 0; i < 10; i++) {
            System.out.println("Numeros[ " + i + "]=");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                media = media + numeros[i];
            }
            System.out.println("Media de los valores que se encuentran en posiciones pares: " + media / 5);

        }
    }
}
