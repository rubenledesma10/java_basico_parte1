/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbucles;

/**
 *
 * @author RubénEzequiel
 */
public class Ejercicio6while {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        while (a < 8) {
            b = b + a;
            a++;
        }
        System.out.println(b);
    }

}
