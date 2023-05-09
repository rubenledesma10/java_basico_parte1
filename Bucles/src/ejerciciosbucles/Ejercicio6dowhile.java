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
public class Ejercicio6dowhile {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        do {
            b = b + a;
            a++;
        } while (a <= 7);
        System.out.println(b);

    }

}
