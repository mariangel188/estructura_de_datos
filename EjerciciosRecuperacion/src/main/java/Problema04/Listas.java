/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema04;

public class Listas {

    Nodo head;

    public Listas() {
        this.head = null;
    }

    public void insertar(int dato) {
        Nodo nuevoN = new Nodo(dato);

        if (head == null || dato < head.dato) {
            nuevoN.sig = head;
            head = nuevoN;
        } else {
            Nodo actual = head;
            while (actual.sig != null && actual.sig.dato <= dato) {
                if (actual.sig.dato == dato) {
                    return;
                }
                actual = actual.sig;
            }
            nuevoN.sig = actual.sig;
            actual.sig = nuevoN;
        }
    }

    public void entrelazar(Listas lis1, Listas lis2) {
        Nodo lista1 = lis1.head;
        Nodo lista2 = lis2.head;

        while (lista1 != null && lista2 != null) {
            if (lista1.dato < lista2.dato) {
                insertar(lista1.dato);
                lista1 = lista1.sig;
            } else if (lista1.dato > lista2.dato) {
                insertar(lista2.dato);
                lista2 = lista2.sig;
            } else {
                insertar(lista1.dato);
                lista1 = lista1.sig;
                lista2 = lista2.sig;
            }
        }

        while (lista1 != null) {
            insertar(lista1.dato);
            lista1 = lista1.sig;
        }

        while (lista2 != null) {
            insertar(lista2.dato);
            lista2 = lista2.sig;
        }
    }

    public void imprimir() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.sig;
        }
        System.out.println();
    }
}
