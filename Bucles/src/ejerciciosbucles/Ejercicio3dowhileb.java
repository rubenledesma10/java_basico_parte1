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
public class Ejercicio3dowhileb {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        do {
            y = y * x;
            x++;

        } while (x < 6);
        System.out.println(y);
    }
}
