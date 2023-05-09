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
public class Ejercicio5while {
    public static void main(String[] args) {
        int a = 1;
        int b;
        int c;
        int d = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el valor base");
        c = sc.nextInt();
        System.out.println("Elija el valor del exponente");
        b = sc.nextInt();
        while (a <= b) {
            d = d * c;
            a++;
        }
        System.out.println("El resultado es: " + d);
    }
}

