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
public class Ejercicio061 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        Ejercicio06 ej = new Ejercicio06();

        do {
            ej.presentarMenu();
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    ej.sumaMatrices();
                    break;
                case 2:
                    ej.restaMatrices();
                    break;
                case 3:
                    ej.multiplicaEscalar();
                    break;
                case 4:

                    ej.transpuestaMatrices();
                    break;
            }
        }    while (opc != 4);
    }    
}
