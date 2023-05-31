/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/*14. Dada una matriz de tamaño NxN (impar), realice un método que me permita mostrar una
pirámide invertida de asteriscos*/
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño para la matriz (impar): ");
        int a = entrada.nextInt();

        if (a % 2 != 0) {
            presentar(a);
        } else {
            System.out.println("El tamaño de la matriz necesita ser impar.");
        }
    }

    public static void presentar(int p) {
        char[][] v = new char[p][p];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                if (j >= i && j < p - i) {
                    v[i][j] = '*';
                } else {
                    v[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(v[i][j]);
            }
            System.out.println();
        }
    }
}

