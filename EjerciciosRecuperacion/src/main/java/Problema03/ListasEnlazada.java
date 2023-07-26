/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema03;

public class ListasEnlazada {

    Nodo head;

    public ListasEnlazada() {
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

    public void eliminar() {
        if (head == null) {
            return;
        }
        Nodo actual = head;
        Nodo mayor = head;
        int valor = head.dato;

        while (actual != null) {
            if (actual.dato > valor) {
                valor = actual.dato;
                mayor = actual;
            }
            actual = actual.sig;
        }

        if (mayor == head) {
            head = head.sig;
        } else {
            actual = head;
            while (actual.sig != mayor) {
                actual = actual.sig;
            }
            actual.sig = mayor.sig;
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
