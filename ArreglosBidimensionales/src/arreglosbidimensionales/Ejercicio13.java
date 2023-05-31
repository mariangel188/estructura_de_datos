/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/*13. Dada una matriz de tamaño NxN (impar), realice un método que me permita mostrar una
pirámide de asteriscos */
public class Ejercicio13 {

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

    public static void presentar(int d) {
        int c = d / 2;
        int co = 1;

        for (int i = 0; i <= c; i++) {
            for (int j = c - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < co; k++) {
                System.out.print("*");
            }

            System.out.println();
            co += 2;
        }
    }
}

