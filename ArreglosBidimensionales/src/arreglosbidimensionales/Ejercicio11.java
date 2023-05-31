/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Random;

/* 11. Generar una matriz de N×N con números aleatorios sin repetirse.*/
public class Ejercicio11 {

    public static void main(String[] args) {
        int g = 6; 

        int[][] m = generarM(g);

        System.out.println("La matriz generada es:");
        presentarMatriz(m);
    }

    public static int[][] generarM(int r) {
        int[][] m = new int[r][r];
        int e = r * r;
        int[] num = new int[e];

        for (int i = 0; i < e; i++) {
            num[i] = i + 1;
        }

        Random random = new Random();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                int in = random.nextInt(e);
                m[i][j] = num[in];
                num[in] = num[e - 1];
                e--;
            }
        }

        return m;
    }

    public static void presentarMatriz(int[][] a) {
        int l = a.length;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

