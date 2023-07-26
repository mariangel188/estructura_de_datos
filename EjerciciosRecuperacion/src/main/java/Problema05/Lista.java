/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema05;

public class Lista {

    Nodo head;

    public Lista() {
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

    public Lista numRepetido() {
        Lista l = new Lista();
        if (head == null || head.sig == null) {
            return l;
        }
        Nodo actual = head;
        
        while (actual != null) {
            Nodo t = actual.sig;
            while(t != null){
                if (actual.dato == t.dato && ! l.numRepetido().contiene(actual.dato)) {
                    l.insertar(actual.dato);
                    break;
                }
                t = t.sig;
            }
            actual = actual.sig;
        }
        return l;
    }
    
    public boolean contiene (int dato){
        Nodo actual = head;
        while(actual != null){
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.sig;
        }
        return false;
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
