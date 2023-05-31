/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/*9. Diseñe un programa que permita encontrar el determinante de una matriz*/
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de las filas: ");
        int a = entrada.nextInt();
        System.out.print("Ingrese el numero de las columnas: ");
        int b = entrada.nextInt();
        
        int[][] ma = new int[a][b];
        System.out.println("Ingrese los valores para la matriz:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                ma[i][j] = entrada.nextInt();
            }
        }

        int det = calcularD(ma);
        System.out.println("El determinante de la matriz es: " + det);
    }

    public static int calcularD(int[][] m) {
        int a = m.length;   
        
        if (a == 1) {
            return m[0][0];
        } else {
            int de = 0;
            for (int i = 0; i < a; i++) {
                int[][] mat = generarMat(m, i);
                int sDet = calcularD(mat);
                de += m[0][i] * sDet * (int) Math.pow(-1, i);
            }
            return de;
        }
    }

    public static int[][] generarMat(int[][] matriz, int col) {
        int b = matriz.length;
        int[][] sMa = new int[b - 1][b - 1];

        for (int i = 1; i < b; i++) {
            for (int j = 0; j < col; j++) {
                sMa[i - 1][j] = matriz[i][j];
            }
            for (int j = col + 1; j < b; j++) {
                sMa[i - 1][j - 1] = matriz[i][j];
            }
        }

        return sMa;
    }
}



