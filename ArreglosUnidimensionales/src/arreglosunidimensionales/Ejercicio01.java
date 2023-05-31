/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import java.util.Scanner;

/*1. Calcular el número de elementos negativos, cero y positivos de un vector dado de n
    elementos. */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ne = 0;
        int ce = 0;
        int po = 0;
        int v;
        System.out.print("Ingrese el tamaño que desea para el vector: ");
        v = scanner.nextInt();

        int[] vec = new int[v];

        System.out.println("Ingrese los valores para el vector:");
        for (int i = 0; i < v; i++) {
            System.out.print("Valor:" + (i + 1));
            vec[i] = scanner.nextInt();
        }

        for (int i = 0; i < v; i++) {
            if (vec[i] < 0) {
                ne++;
            } else {
                if (vec[i] == 0) {
                    ce++;
                } else {
                    po++;
                }
            }

            System.out.println("Los valores negativos son: " + ne);
            System.out.println("Los valores cero son: " + ce);
            System.out.println("Los valores positivos son: " + po);
        }
    }
}
