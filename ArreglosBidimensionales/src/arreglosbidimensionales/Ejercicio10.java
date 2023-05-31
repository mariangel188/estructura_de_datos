/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/*10. Realice un programa que realice la trasposición de una matriz de NxN sobre la diagonal
secundaria*/
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de las filas: ");
        int c = entrada.nextInt();
        System.out.print("Ingrese el numero de las columnas: ");
        int d = entrada.nextInt();

        int[][] ma = new int[c][d];
        System.out.println("Ingrese los valores para la matriz:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                ma[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz original es:");
        presentar(ma);

        int[][] tra = traspuesta(ma);
        System.out.println("La matriz traspuesta sobre la diagonal secundaria es:");
        presentar(tra);
    }

    public static int[][] traspuesta(int[][] b) {
        int a = b.length;
        int[][] transp = new int[a][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                transp[i][j] = b[a - j - 1][a - i - 1];
            }
        }

        return transp;
    }

    public static void presentar(int[][] c) {
        int p = c.length;

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}



