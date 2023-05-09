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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int N;
        int contMas = 0;
        int contMenos = 0;
        double media = 0;
        do {
            System.out.println("Numeros de personas: ");
            N = sc.nextInt();
        } while (N <= 0);
        double[] alto = new double[N];
        System.out.println("Altura de las persoans: ");
        for (i = 0; i < N; i++) {
            System.out.println("Persona " + (i + 1) + " = ");
            alto[i] = sc.nextInt();
            media = media + alto[i];
        }
        media = media / N;
        for (i = 0; i < alto.length; i++) {
            if (alto[i] > media) {
                contMas++;
            } else if (alto[i] > media) {
                contMenos++;
            }
            System.out.println("Estatura media: " + media);
            System.out.println("Personas con estatura superior a la media: " + contMas);
            System.out.println("Personas con estatura inferior a la media: " + contMenos);
        }
    }
}

