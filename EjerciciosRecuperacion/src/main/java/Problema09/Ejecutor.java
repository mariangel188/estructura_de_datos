/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema09;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        int op;
        ListasE obj = new ListasE();
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1.Inserte el numero para la lista");
            System.out.println("2.Invertir los numeros de la lista");
            System.out.println("3.Imprimir la lista");
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
                    ListasE ob = obj.invertir();
                    System.out.println("La lista invertida es: ");
                    ob.imprimir();
                    break;
                case 3:
                    System.out.println("La lista actual es: ");
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