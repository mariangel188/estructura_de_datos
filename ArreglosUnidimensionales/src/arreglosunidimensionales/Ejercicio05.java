/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

/* 5.Determinar si un arreglo de números enteros previamente leído, está ordenado.*/
public class Ejercicio05 {

    public static void main(String[] args) {
        int[] arr = {1, 23, 76, 12, 34, 90};
        int e = ordenA(arr);

        if (e == 1) {
            System.out.println("El arreglo si esta ordenado");
        } else {
            System.out.println("El arreglo no esta ordenado");
        }
    }

    public static int ordenA(int[] arr) {
        int e = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                e = 0;
            }
        }
        return e;
    }
}

