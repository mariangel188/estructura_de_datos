/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/* 8. Diseñe un programa que me permita implementar el algoritmo del “cuadrado mágico” de un
número de filas y columnas N ingresado por teclado*/
public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de las filas: ");
        int g = entrada.nextInt();
        System.out.print("Ingrese el numero de las columnas: ");
        int d = entrada.nextInt();
        if (g % 2 != 0 && d > 0) {
            int[][] c = cuadradoM(g, d);
            System.out.println("El cuadrado mágico entre " + g + " y " + d + " es:");
            mCuadrado(c);
        }
    }

    public static int[][] cuadradoM(int h, int d) {
        int[][] cu = new int[h][d];
        int p = 0;
        int q = d / 2;
        int num = h * d;

        for (int i = 1; i <= num; i++) {
            cu[p][q] = i;
            p--;
            q++;

            if (i % d == 0) {
                p += 2;
                q--;

            } else {
                if (q == d) {
                    q -= d;
                } else if (p < 0) {
                    p += h;
                }
            }
        }
        return cu;
    }

    public static void mCuadrado(int[][] c) {
        int fila = c.length;
        int columna = c[0].length;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

