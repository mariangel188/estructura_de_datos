/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

/* 7. Realice un programa que me permita realizar el ordenamiento de una matriz bidireccional (el
ordenamiento debe ser realizado en la misma matriz)*/
public class Ejercicio07 {

    public static void main(String[] args) {
        int[][] ma = {{8, 2, 4, 8, 9}, {6, 4, 1, 2, 11}, {13, 21, 18, 19, 20}};

        System.out.println("La matriz original es:");
        presentarM(ma);

        ordenarM(ma);

        System.out.println("La matriz ordenada es:");
        presentarM(ma);
    }

    public static void ordenarM(int[][] a) {
        int f = a.length;
        int c = a[0].length;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c - 1; j++) {
                for (int k = 0; k < c - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int t = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = t;
                    }
                }
            }
        }
    }

    public static void presentarM(int[][] e) {
        int f = e.length;
        int c = e[0].length;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }
    }
}
