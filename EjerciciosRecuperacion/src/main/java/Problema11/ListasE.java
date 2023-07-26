/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema11;

public class ListasE {

    Nodo head;

    public ListasE() {
        this.head = null;
    }

    public void insertar(int dato) {
        Nodo nuevoN = new Nodo(dato);
        if (head == null) {
            head = nuevoN;
        } else {
            Nodo actual = head;
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevoN;
        }
    }

    public void eliminar(int po, int n) {
        if (po <= 0 || n <= 0) {
            return;
        }

        if (po == 1) {
            while (head != null && n > 0) {
                head = head.sig;
                n--;
            }
        } else {
            Nodo ant = head;
            for (int i = 1; i < po - 1 && ant != null; i++) {
                ant = ant.sig;
            }
            if (ant == null || ant.sig == null) {
                return;
            }
            Nodo actual = ant.sig;
            while (actual != null && n > 0) {
                actual = actual.sig;
                n--;
            }
            ant.sig = actual;
        }
    }

    public void imprimir() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.dato + " ");
            actual = actual.sig;
        }
        System.out.println();
    }
}
