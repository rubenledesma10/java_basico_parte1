/*

 */
package array_ejercicios;

import java.util.Scanner;

public class ejercicio_4 {

    public static void main(String[] args) {
        String ciudades[] = new String[5];
        double temp_min[] = new double[5];
        double temp_max[] = new double[5];

        Scanner teclado_ciudad = new Scanner(System.in);
        Scanner teclado_temperatura = new Scanner(System.in);

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la ciudad " + i);
            ciudades[i] = teclado_ciudad.next();
            System.out.println("Ingrese la temperatura minima de la ciudad " + i);
            temp_min[i] = teclado_temperatura.nextDouble();
            System.out.println("Ingrese la temperatura maxima de la ciudad " + i);
            temp_max[i] = teclado_temperatura.nextDouble();
        }
        Double minima = 9999999.00;
        Double maxima = -9999999.00;
        int posicion_minima = -1;
        int posicion_maxima = -1;
        for (int i = 0; i < ciudades.length; i++) {
            if (temp_min[i] < minima) {
                minima = temp_min[i];
                posicion_minima = i;
            }
            if (temp_max[i] > maxima) {
                maxima = temp_max[i];
                posicion_maxima = i;
            }

        }
        System.out.println("La temperatura minima es fue de " + minima + " en la ciudad de " + ciudades[posicion_minima]);
        System.out.println("La temperatura maxima fue de " + maxima + " en la ciudad de " + ciudades[posicion_maxima]);

    }
}
