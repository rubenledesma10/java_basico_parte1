/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intercambio_de_valores;

public class Intercambio_de_valores {

    public static void main(String[] args) {
        
        int num1 = 35;
        int num2 = 20;
        int aux;
        
        
        aux = num2; //aux pasa a valer 20
        num2 = num1; //aca num2 que vale 20, pasa a valer 35 
        num1 = aux; //aca num1 que vale 35 pasa a valer 20
        
        System.out.println(num1);
        System.out.println(num2);
        
        
        
    }
    
}
