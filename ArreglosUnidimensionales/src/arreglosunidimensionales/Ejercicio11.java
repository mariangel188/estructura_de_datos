/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import java.util.Scanner;

/* 11. Se dispone de una lista de n nombres de alumnos. Escribir un programa que solicite el 
nombre de un alumno y busque en la lista si el nombre está o no.*/
public class Ejercicio11 {

    public static void main(String[] args) {

        int alum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        alum = scanner.nextInt();

        String[] nombres = new String[alum];
        scanner.nextLine();

        for (int i = 0; i < alum; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + "\n");
            nombres[i] = scanner.nextLine();
        }

        System.out.print("Ingrese el nombre del alumno que desea buscar: ");
        String n = scanner.nextLine();

        int p = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(n)) {
                p = i;
            }
        }

        if (p != -1) {
            System.out.println("El alumno " + n + " está en la lista" + p);
        } else {
            System.out.println("El alumno " + n + " no está en la lista");
        }
    }
}
