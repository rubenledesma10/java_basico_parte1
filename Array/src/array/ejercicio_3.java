/*
Llevar a cabo un programa que incluya un vector que almacene los nombres Alejandra, Leonardo, Rosa, Guillermo, Daniel, Luisa y
Ludmila. Realizar el recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla
 */
package array_ejercicios;

/**
 *
 * @author ledes
 */
public class ejercicio_3 {
    public static void main(String[] args) {
        String vector[] = new String[7];
        vector[0] = "Alejandra";
        vector[1] = "Leonardo";
        vector[2] = "Rosa";
        vector[3] = "Guillermo";
        vector[4] = "Daniel";
        vector[5] = "Luisa";
        vector[6] = "Ludmila";
        for(int i=0;i<vector.length;i++){
            System.out.println("En el vector " +i+ " se encuentra el nombre " +vector[i]);
        }
    }
}
