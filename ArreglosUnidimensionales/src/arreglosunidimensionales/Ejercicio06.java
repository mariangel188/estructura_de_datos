/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 6. Se dispone de un arreglo T de n números diferentes de 0, (puede ser llenada por un 
procedimiento que genere números aleatorios distintos de cero); crear un nuevo 
arreglo en el que todos sus elementos resulten de dividir los elementos del arreglo T
por el elemento T[i], siendo i un valor leído por teclado */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        int n = 0;

        System.out.println("Ingrese el tamaño para el arreglo: ");
        a = entrada.nextInt();

        int[] T = new int[a];
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            n = numAleatorio();

            if (n == 0) {
                n = numAleatorio();
            }

            T[i] = n;
        }

        System.out.println("El arreglo T es: " + Arrays.toString(T));

        System.out.println("Ingrese un valor para i: ");
        int i = entrada.nextInt();

        if (i >= 0 && i < a) {
            int div = T[i];

            for (int j = 0; j < a; j++) {
                arr[j] = T[j] / div;
            }

            System.out.println("El nuevo arreglo seria: " + Arrays.toString(arr));
        } else {
            System.out.println("El valor de i es invalido");
        }
    }

 
    public static int numAleatorio() {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        return num;
    }

   
}
