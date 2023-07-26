/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema06;

public class ListaE {

    Nodo head;

    public ListaE() {
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

    public void imprimirInvertido(Nodo n) {
        if (n == null) {
           return; 
        }
        
        imprimirInvertido(n.sig);
        System.out.print(n.dato + " ");
    }

    public void imprimir() {
        imprimirInvertido(head);
    }

}
