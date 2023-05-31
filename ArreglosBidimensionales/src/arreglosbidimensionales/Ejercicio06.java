/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/* 6. Realice un programa que me permita realizar (según un menú presentado al usuario):
a. La multiplicación de dos matrices bidimensionales.
b. Suma de matrices.
c. Resta de matrices.
d. Multiplicación por un escalar.
e. Traspuesta de una matriz.
(Considérese las restricciones necesarias para cada operación).*/
public class Ejercicio06 {

    Scanner entrada = new Scanner(System.in);

    public Ejercicio06() {
        this.entrada = new Scanner(System.in);
    }

    public int presentarMenu() {
        System.out.print("Ingrese la opción que desea realizar:\n");
        System.out.println("1. Suma de matrices");
        System.out.println("2. Resta de matrices");
        System.out.println("3. Multiplicación por un escalar");
        System.out.println("4. Traspuesta de la primera matriz");
        return entrada.nextInt();
    }

    public int[][] leerMatriz() {
        System.out.println("Ingrese el numero de las filas: ");
        int f = entrada.nextInt();
        System.out.println("Ingrese el numero de las columnas: ");
        int c = entrada.nextInt();

        int[][] mat = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Ingrese el valor para la posicion"
                        + " [" + i + "] y [" + j + "]");
                mat[i][j] = entrada.nextInt();
            }
        }
        return mat;
    }

    public void sumaMatrices() {

        int[][] ma1 = leerMatriz();
        int[][] ma2 = leerMatriz();

        if (ma1.length != ma2.length || ma1[0].length != ma2[0].length) {
            System.out.println("No se pueden sumar las matrices.");
            return;
        }
        int f = ma1.length;
        int c = ma1[0].length;
        int[][] r = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                r[i][j] = ma1[i][j] + ma2[i][j];
            }
        }

        System.out.println("La suma de las matrices es: ");
        presentar(r);
    }

    public void restaMatrices() {

        int[][] ma1 = leerMatriz();
        int[][] ma2 = leerMatriz();

        if (ma1.length != ma2.length || ma1[0].length != ma2[0].length) {

            System.out.println("No se pueden restar las matrices.");
            return;
        }
        int fi = ma1.length;
        int co = ma1[0].length;
        int[][] re = new int[fi][co];

        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                re[i][j] = ma1[i][j] - ma2[i][j];
            }
        }

        System.out.println("La resta de las matrices es: ");
        presentar(re);
    }

    public void multiplicaEscalar() {
        int[][] ma = leerMatriz();
        System.out.println("Ingrese el escalar: ");
        int p = entrada.nextInt();

        int fila = ma.length;
        int columna = ma[0].length;
        int[][] res = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                res[i][j] = ma[i][j] * p;
            }
        }

        System.out.println("La multiplicacion por un escalar es: ");
        presentar(res);
    }

    public void transpuestaMatrices() {
        int[][] ma = leerMatriz();
        int f = ma.length;
        int c = ma[0].length;
        int[][] tra = new int[c][f];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                tra[j][i] = ma[i][j];
            }
        }
        System.out.println("La transpuesta de la matriz es: ");
        presentar(tra);
    }

    public void presentar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
