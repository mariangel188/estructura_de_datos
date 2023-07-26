/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema07;

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

    public int orden() {

        if (head == null || head.sig == null) {
            return 0;
        }
        
        Nodo actual = head;
        int tipo = 0;

        if (actual.dato < actual.sig.dato) {
            tipo = 1;
        } else if (actual.dato > actual.sig.dato) {
            tipo = 2;
        }

        actual = actual.sig;
        while (actual.sig != null) {
            if ((tipo == 1 && actual.dato > actual.sig.dato)
                    || (tipo == 2 && actual.dato < actual.sig.dato)) {
                return 0; 
            }
            actual = actual.sig;
        }

        return tipo;
    }
}

