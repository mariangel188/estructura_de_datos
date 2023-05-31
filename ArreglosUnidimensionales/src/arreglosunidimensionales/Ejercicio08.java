/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

/*8. Escribir un programa que permita calcular el cuadrado de los 100 primeros números 
enteros y a continuación escribir un arreglo que contenga dichos resultados */
public class Ejercicio08 {

    public static void main(String[] args) {
        int[] c = new int[100];
        for (int i = 0; i < 100; i++) {
            int num = i + 1;
            int cu = num * num; 
            c[i] = cu;
        }
        
        System.out.println("El arreglo con los cuadrados de los 100 primeros numeros:");
        for (int i = 0; i < 100; i++) {
            System.out.println(c[i]);
        }
    }
}
