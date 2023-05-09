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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0;
        int neg = 0;
        int cero = 0;
        int i;
        System.out.println("Lectura de los elementos array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.println("numeros[ " + i + " ]=");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
            System.out.println("Positivos:" + pos);
            System.out.println("Negativos: " + neg);
            System.out.println("Ceros: " + cero);
        }
    }
}
