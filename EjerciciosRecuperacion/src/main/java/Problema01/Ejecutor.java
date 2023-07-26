/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema01;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        Listas obj = new Listas();
               
        do {
            System.out.println("MENU");
            System.out.println("1.Inserte el elemento");
            System.out.println("2.Imprimir la lista");
            System.out.println("3.Salir");
            System.out.println("Ingrese su opcion: ");
            op = entrada.nextInt();
           switch(op){
               case 1:
                   System.out.println("Ingrese el numero despues del que desea insertar");
                   int numB = entrada.nextInt();
                   System.out.println("Ingrese el numero para insertar: ");
                   int numI = entrada.nextInt();
                   obj.insertar(numB, numI);
                   break;
               case 2:
                   System.out.println("La lista actual: ");
                   obj.imprimir();
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
