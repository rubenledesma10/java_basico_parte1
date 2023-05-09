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
public class Ejercicio2while {
    public static void main(String[] args) {
        int x = 10;
        int cont = 0;
        while (x < 70) {
            if (x % 4 == 0) {
                cont++;

            }
            x++;
        }
        System.out.println(cont);
    }
}
