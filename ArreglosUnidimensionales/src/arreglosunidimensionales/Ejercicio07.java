/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import java.util.Scanner;

/* 7. Se dispone de un arreglo de n elementos. Se desea diseñar un algoritmo que permita 
insertar el valor x en la posición k‐ésima de la lista, debiendo desplazarse los elementos 
hacia la derecha para dar lugar al nuevo elemento y desechando el último elemento 
sobrante.*/
public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño para el arreglo: ");
        int v = entrada.nextInt();

        int[] arr = new int[v];

        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < v; i++) {
            System.out.print("Valor " + (i + 1)+ "\n");
            arr[i] = entrada.nextInt();
        }

        System.out.print("Ingrese el valor que desea insertar: ");
        int valorI = entrada.nextInt();

        System.out.print("Ingrese la posición en la que va a insetar entre el 1 y el " + (v + 1) + " :" + "\n");
        
        int posicionI = entrada.nextInt();

        if (posicionI >= 1 && posicionI <= v + 1) {
            int[] nArr = new int[v + 1];
            for (int i = 0; i < posicionI - 1; i++) {
                nArr[i] = arr[i];
            }
            nArr[posicionI - 1] = valorI;
            for (int i = posicionI- 1; i < v; i++) {
                nArr[i + 1] = arr[i];
            }

            System.out.println("El arreglo con los valores que se insertaron: ");
            presentarA(nArr);
        } else {
            System.out.println("La posición donde se inserto no es válida");
        }
    }

    public static void presentarA(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
