/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/* 2. Dado un arreglo de dos dimensiones de m x n elementos numéricos de tipo entero, desarrollar
un programa para sumar los elementos de la diagonal invertida*/
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de las filas: ");
        int fi = entrada.nextInt();
        System.out.println("Ingrese el numero de las columnas: ");
        int co = entrada.nextInt();

        int[][] ma = new int[fi][co];

        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                ma[i][j] = entrada.nextInt();
            }
        }

        int sumaD = 0;
        int j = co - 1;

        for (int i = 0; i < fi; i++) {
            sumaD += ma[i][j];
            j--;
        }
        System.out.println("La suma de los valores de la matriz ya invertida es: " + sumaD);
    }
}
