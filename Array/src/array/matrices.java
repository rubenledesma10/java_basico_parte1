
package array;

import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
         //DECLARION
    int matriz[][] = new int [3][3]; //primer valor, la cantidad de posiciones horizontales (filas), despues las verticales (columnas)
    
    /*ASIGNACION (manual)
    
    matriz[0][0] = 5;
    matriz[0][1] = 13;
    matriz[0][2]=96;
    matriz[1][0]=35;
    matriz[1][1]=33;
    matriz[1][2]=71;
    matriz[2][0] = 446;
    matriz[2][1] = 228;
    matriz[2][2] = 24;*/
    
    //ASIGNACION POR TECLADO
    
    for (int f=0; f<3;f++){
        for (int c=0; c<3;c++){
            System.out.println("ingrese el valor para la posicion f: " +f+ " y para la c: " +c);
            matriz[f][c]=teclado.nextInt();
        }}
    
    
    //RECORRIDO
    for (int f=0; f<3;f++){
        for (int c=0; c<3;c++){
            System.out.println("El valor de la posicion f: " +f+ " c: " +c);
            System.out.println("es de: " +matriz[f][c]);
        }
    }
    }
    
}
