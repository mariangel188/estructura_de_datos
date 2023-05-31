/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import java.util.Arrays;
import java.util.Scanner;

/*3. Escriba un programa que me permita almacenar en un arreglo, el número de la serie 
    fibonacci correspondiente a cada una de sus posiciones. */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int e = 0;
        System.out.println("Ingrese el número de valores para la serie de Fibonacci: ");
        e = entrada.nextInt();

        int[] fibonacciArray = new int[e];

        for (int i = 0; i < e; i++) {
            fibonacciArray[i] = fibonacci(i);
        }

        System.out.println("El arreglo Fibonacci es: " + Arrays.toString(fibonacciArray));
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
