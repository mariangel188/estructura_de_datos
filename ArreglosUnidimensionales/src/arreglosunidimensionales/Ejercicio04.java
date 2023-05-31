/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import java.util.Arrays;

/*Escriba un programa que me permita almacenar en un arreglo, el número primo 
correspondiente a cada una de sus posiciones*/
public class Ejercicio04 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = new int[a.length];
        int co = 0;

        for (int i = 2; co < a.length; i++) {
            if (numPrimo(i)) {
                arr[co] = i;
                co++;
            }
        }
        
        System.out.println("El arreglo con números primos es: " + Arrays.toString(arr));
    }

    public static boolean numPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

