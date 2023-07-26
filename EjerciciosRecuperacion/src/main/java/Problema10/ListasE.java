/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema10;

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

    public void ordenar() {
        if (head == null || head.sig == null) {
            return;
        }
        boolean inte;
        do {
            inte = false;
            Nodo actual = head;
            Nodo sig = head.sig;
            Nodo pr = null;

            while (sig != null) {
                if (actual.dato > sig.dato) {
                    if (pr == null) {
                        head = sig;
                    } else {
                        pr.sig = sig;
                    }
                    actual.sig = sig.sig;
                    sig.sig = actual;
                    pr = sig;
                    sig = actual.sig;
                    inte = true;
                } else {
                    pr = actual;
                    actual = sig;
                    sig = sig.sig;
                }
            }
        } while (inte);
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
