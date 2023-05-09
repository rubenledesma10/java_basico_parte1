/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbucles;

import java.util.Scanner;

/**
 *
 * @author RubénEzequiel
 */
public class Ejercicio5for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d = 1;
        System.out.println("Ingrese el valor base");
        c = sc.nextInt();
        System.out.println("Ingrese el valor del exponente");
        b = sc.nextInt();
        for (a = 1; a <= b; a++) {
            d = d * c;
        }
        System.out.println("El resultado es: " + d);

    }
}
