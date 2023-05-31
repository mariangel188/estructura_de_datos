/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/* 3. Dada una matriz L de n X m elementos, diseñar un programa que calcule la suma de números
pares e impares contenidos en ella.*/
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de las filas: ");
        int fila = entrada.nextInt();
        System.out.println("Ingrese el numero de las columnas: ");
        int columna = entrada.nextInt();

        int[][] m = new int[fila][columna];

        System.out.println("Ingrese los valores para la matriz: ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                m[i][j] = entrada.nextInt();
            }
        }
        int sPares = 0;
        int sImpares = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (m[i][j] % 2 == 0) {
                    sPares += m[i][j];
                } else {
                    sImpares += m[i][j];
                }
            }
        }
        System.out.println("La suma de los numeros pares es: "
                + sPares + " y la suma de los numeros impares es: " + sImpares);
    }
}
