/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema14;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        int op;
        ArbolB obj = new ArbolB();
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1.Inserte el numero para el arbol");
            System.out.println("2.Calcular la altura del arbol");
            System.out.println("3.Salir");
            System.out.println("Ingrese su opcion: ");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el número que desea insertar: ");
                    int d = entrada.nextInt();
                    obj.insertar(d);
                    break;
                case 2:
                    int altura = obj.calcular();
                    System.out.println("La altura del arbol es: " + altura);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (op != 3);

    }
}
