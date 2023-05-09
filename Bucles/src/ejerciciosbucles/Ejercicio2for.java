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
public class Ejercicio2for {
    public static void main(String[] args) {
        int x;
        int cont = 0;
        for (x = 10; x < 71; x++) {
            if (x % 4 == 0) {
                cont++;
            }
        }

        System.out.println(cont);
    }
}
