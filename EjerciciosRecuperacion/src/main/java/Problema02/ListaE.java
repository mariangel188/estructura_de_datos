/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

public class ListaE {
        Nodo head; 
    
    public ListaE (){
        this.head = null;
    }
    
    public void insertar(int dato){
        Nodo nuevoN = new Nodo(dato);
        if (head == null) {
            head = nuevoN;
        } else{
            Nodo actual = head;
            while(actual.sig != null){
                actual = actual.sig;
            }
            actual.sig = nuevoN;
        }
    }
    
    public double calcularP (){
        int suma = 0;
        int numT = 0;
        
        Nodo actual = head;
        while(actual != null){
            suma += actual.dato;
            numT++;
            actual = actual.sig;
        }
        if (numT == 0) {
            return 0;
        }
        return suma/ numT;
    }
}
