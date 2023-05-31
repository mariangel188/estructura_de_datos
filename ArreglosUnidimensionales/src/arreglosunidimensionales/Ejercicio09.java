/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

/* 9. Dada una lista L de n elementos, diseñar un programa que calcule la suma de números 
pares e impares contenidos en ella. */
public class Ejercicio09 {

    public static void main(String[] args) {
        int[] l = {1,3,2,5,6,8,10,9};
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < l.length; i++) {
            if (l[i] %2 == 0) {
                pares += l[i];
            } else {
                impares += l[i];
            }
        }
        
        System.out.println("La suma de los numeros pares son: " + pares + 
                " y la suma de los numeros impares son: " + impares);
    }
}
