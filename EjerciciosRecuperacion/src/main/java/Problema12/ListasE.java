/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema12;

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

    public ListasE particionar(int valor) {
        ListasE me = new ListasE();
        ListasE ma = new ListasE();

        Nodo actual = head;
        while (actual != null) {
            if (actual.dato < valor) {
                me.insertar(actual.dato);
            } else {
                ma.insertar(actual.dato);
            }
            actual = actual.sig;
        }
        return me;
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
