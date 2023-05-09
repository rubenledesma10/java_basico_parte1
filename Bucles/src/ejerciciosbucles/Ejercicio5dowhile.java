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
public class Ejercicio5dowhile {
    public static void main(String[] args) {
        int a = 1;
        int b;
        int c;
        int d = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor base");
        c = sc.nextInt();
        System.out.println("Ingrese el valor del exponente");
        b = sc.nextInt();
        do {
            d = d * c;
            a++;
        } while (a <= b);
        System.out.println("El resultado es: " + d);

    }
}

