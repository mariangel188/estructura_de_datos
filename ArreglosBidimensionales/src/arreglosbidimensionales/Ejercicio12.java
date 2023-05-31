/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/* 12. Dada una matriz de tamaño NxN (impar), realice un método que me permita mostrar un cuadro
de asteriscos (solo bordes)*/
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (impar): ");
        int a = entrada.nextInt();

        if (a % 2 != 0) {
            cuadroA(a);
        } else {
            System.out.println("El tamaño de la matriz debe ser impar.");
        }
    }

    public static void cuadroA(int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == b - 1 || j == 0 || j == b - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

