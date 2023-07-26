/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema01;

public class Listas {
    
    Nodo head; 
    
    public Listas (){
        this.head = null;
    }
    
    public void insertar(int numB, int numI){
        Nodo nuevoN = new Nodo(numI);
        if (head == null) {
            head = nuevoN;
            return;
        }
        
        Nodo actual = head;
        while(actual != null){
            if (actual.dato == numB) {
                nuevoN.sig = actual.sig;
                actual.sig = nuevoN;
                return;
            }
            actual = actual.sig;
        }
    }
    
    public void imprimir (){
        Nodo actual = head;
        while(actual != null){
            System.out.print(actual.dato + " ");
            actual = actual.sig;
        }
        System.out.println();
    }

}
