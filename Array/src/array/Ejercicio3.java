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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int numAlum;
        double suma = 0;
        double media;
        do {
            System.out.println("Numero de alumnos de la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);
        double[] notas = new double[numAlum];
        for (i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1) + " nota final: ");
            notas[i] = sc.nextDouble();
        }
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        System.out.println("Suma de las notas: " + suma);
        media = suma / notas.length;
        System.out.println("Nota media del curso: " + media);
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1) + " nota final: " + notas[i]);
            }
        }
    }
}
