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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] empleados = new String[20];
        double[] sueldos = new double[20];
        String nombreMayor;
        double mayorSueldo;
        int i = 0;
        System.out.println("Lectura de nombres y sueldos de los empleados: ");
        System.out.println("Empleado " + (i + 1) + ": ");
        empleados[i] = sc.nextLine();
        System.out.println("Sueldo: ");
        sueldos[i] = sc.nextDouble();
        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];
        for (i = 0; i < empleados.length; i++) {
            sc.nextLine();
            System.out.println("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
            System.out.println("Sueldo: ");
            sueldos[i] = sc.nextDouble();
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
            System.out.println("Empleado con mayor sueldo: " + nombreMayor);
            System.out.println("Sueldo: " + mayorSueldo);
        }
    }

}
