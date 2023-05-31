/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/* 1. Leer una matriz de n X m elementos y calcular la suma de cada una de sus filas y columnas,
dejando dichos resultados en dos vectores, uno de la suma de filas y otro de columnas */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas: ");
        int f = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int c = entrada.nextInt();

        int[][] ma = new int[f][c];
        int[] sumaF = new int[f];
        int[] sumaC = new int[c];

        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                ma[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < f; i++) {
            int suma = 0;
            for (int j = 0; j < c; j++) {
                suma += ma[i][j];
            }
            sumaF[i] = suma;
        }

        for (int j = 0; j < c; j++) {
            int suma = 0;
            for (int i = 0; i < f; i++) {
                suma += ma[i][j];
            }
            sumaC[j] = suma;
        }

        System.out.println("La suma de las filas es: ");
        for (int i = 0; i < f; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumaF[i]);
        }

        System.out.println("La suma de las columnas es: ");
        for (int j = 0; j < c; j++) {
            System.out.println("Columna " + (j + 1) + ": " + sumaC[j]);
        }
    }
}


