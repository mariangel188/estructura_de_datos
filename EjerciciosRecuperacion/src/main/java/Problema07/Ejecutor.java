/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema07;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        int op;
        ListasE obj = new ListasE();
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1.Inserte el numero para la lista");
            System.out.println("2.Comprobar el orden de la lista");
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
                    int tipo = obj.orden();
                    if (tipo == 0) {
                        System.out.println("La lista no esta ordenada de ninguna forma");
                    } else if (tipo == 1) {
                        System.out.println("La lista esta ordenada ascendentemente");
                    } else if (tipo == 2) {
                        System.out.println("La lista esta ordenada descendentemente");
                    }
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
