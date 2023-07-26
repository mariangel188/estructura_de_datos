/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        ListaE obj = new ListaE();

        do {
            System.out.println("MENU");
            System.out.println("1.Inserte el numero");
            System.out.println("2.Calculo el promedio de los numeros");
            System.out.println("3.Salir");
            System.out.println("Ingrese su opcion: ");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el numero que desea insertar");
                    int da = entrada.nextInt();
                    obj.insertar(da);
                    break;
                case 2:
                    double promedio = obj.calcularP();
                    System.out.println("El promedio de los numeros es: " + promedio);
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                case 4:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (op != 3);
    }
}
