/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/*15. Dada una matriz de tamaño NxN (impar), realice un método que me permita mostrar una cruz
de asteriscos */
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño para la matriz (impar): ");
        int b = entrada.nextInt();

        if (b % 2 != 0) {
            presentarC(b);
        } else {
            System.out.println("El tamaño de la matriz necesita ser impar.");
        }
    }

    public static void presentarC(int p) {
        char[][] m = new char[p][p];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                if (i == p / 2 || j == p / 2) {
                    m[i][j] = '*';
                } else {
                    m[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}

