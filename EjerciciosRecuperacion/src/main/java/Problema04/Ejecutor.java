/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema04;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        int op;
        Scanner entrada = new Scanner(System.in);

        Listas lista1 = new Listas();
        Listas lista2 = new Listas();
        Listas listaC = new Listas();

        do {
            System.out.println("MENU");
            System.out.println("1.Inserte el numero para la lista 1");
            System.out.println("2.Inserte el numero para la lista 2");
            System.out.println("3.Entrelazar las listas y mostrar su combinacion");
            System.out.println("4.Salir");
            System.out.println("Ingrese su opcion: ");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el número que desea insertar en lista 1: ");
                    int d1 = entrada.nextInt();
                    lista1.insertar(d1);
                    break;
                case 2:
                    System.out.print("Ingrese el número que desea insertar en lista 2: ");
                    int d2 = entrada.nextInt();
                    lista2.insertar(d2);
                    break;
                case 3:
                    listaC.entrelazar(lista1, lista2);
                    System.out.println("Lista entrelazada y ordenada sin numeros duplicados:");
                    listaC.imprimir();
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
