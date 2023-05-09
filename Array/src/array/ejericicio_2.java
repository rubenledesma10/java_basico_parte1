/*
 En un tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria. Se necesita un programa que permita a un profesor cargar, en las
3 posiciones (columnas) de cada fila, las notas del alumno y que en la ultima columna se calculon los promedios. Una vez realizado los calculos, se desea
mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz
 */
package array_ejercicios;

import java.util.Scanner;

/**
 *
 * @author ledes
 */
public class ejericicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double matriz[][] = new double [4][4];
        double suma = 0.0;
        
        for (int f=0; f<4; f++){
            for (int c=0; c<3; c++){
                System.out.println("Ingrese las notas del alumno n° " +f);
                matriz[f][c]=teclado.nextDouble();
                suma=suma + matriz[f][c];
            }
            matriz[f][3]=suma/3;
            suma=0.0;
        }
        
        for (int f=0; f<4; f++){
            System.out.println("Las notas del alumno " +f+ " son: ");
            for (int c=0; c<3; c++){
                System.out.println("Nota n° " +c+ " " +matriz[f][c]);
            }
            System.out.println("El promedio de la nota es: " +matriz[f][3]);
        }  
    }   
}
