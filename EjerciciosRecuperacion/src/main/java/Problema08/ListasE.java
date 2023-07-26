/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema08;

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
    
    public void eliminar(int li){
        while(head != null && head.dato > li){
            head = head.sig;
        }
        if (head == null) {
            return;
        }
        Nodo actual = head;
        while (actual.sig != null){
            if (actual.sig.dato > li) {
                actual.sig = actual.sig.sig;
            } else {
                actual = actual.sig;
            }
        }
    }
    
    public void imprimir (){
        Nodo actual = head;
        while (actual != null){
            System.out.println(actual.dato + " ");
            actual = actual.sig;
        }
        System.out.println();
    }
}
    