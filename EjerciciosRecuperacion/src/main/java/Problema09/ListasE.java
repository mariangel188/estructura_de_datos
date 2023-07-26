/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema09;

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

    public ListasE invertir() {
        ListasE obj = new ListasE();
        Nodo actual = head;

        while (actual != null) {
            obj.insertar(actual.dato);
            actual = actual.sig;
        }
        return obj;
    }

    public void insertarInicio(int dato) {
        Nodo nuevoN = new Nodo(dato);
        nuevoN.sig = head;
        head = nuevoN;
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
