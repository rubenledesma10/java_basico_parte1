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
public class Ejercicio2dowhile {
    public static void main(String[] args) {
        int x = 10;
        int cont = 0;
        do {
            if (x % 4 == 0) {
                cont++;
            }

            x++;

        } while (x <= 70);
        System.out.println(cont);
    }
}
