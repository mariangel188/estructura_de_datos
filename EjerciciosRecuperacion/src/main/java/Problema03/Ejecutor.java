/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema03;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        int op;
        ListasEnlazada obj = new ListasEnlazada();
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1.Inserte el numero");
            System.out.println("2.Eliminar el numero con el valor mayor");
            System.out.println("3.Imprimir lista");
            System.out.println("4.Salir");
            System.out.println("Ingrese su opcion: ");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el número que desea insertar: ");
                    int d = entrada.nextInt();
                    obj.insertar(d);
                    break;
                case 2:
                    obj.eliminar();
                    System.out.println("Se eliminó el numero con el valor mayor.");
                    break;
                case 3:
                    System.out.println("La lista actual es:");
                    obj.imprimir();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (op != 4);

    }
}
