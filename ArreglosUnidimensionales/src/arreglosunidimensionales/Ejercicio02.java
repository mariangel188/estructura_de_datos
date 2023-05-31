/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import java.util.Arrays;
import java.util.Scanner;

/*2. Escriba un programa que me permita almacenar en un arreglo B, el factorial de 10 
    números almacenados previamente en un arreglo A.*/
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] arrA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrB = new int[10];

        for (int i = 0; i < arrA.length; i++) {
            arrB[i] = factorial(arrA[i]);
        }

        System.out.println("El arreglo A es: " + Arrays.toString(arrA));
        System.out.println("El arreglo B es: " + Arrays.toString(arrB));

    }

    public static int factorial(int num) {
        if (num == 1) {
            return num;
        } else {
            return num * factorial(num - 1);
        }

    }
}
