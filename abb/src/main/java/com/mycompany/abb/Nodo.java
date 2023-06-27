/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abb;

public class Nodo {

    int dato;
    Nodo izq;
    Nodo der;

    public Nodo(int dato) {
        this.dato = dato;
        this.izq = this.der = null;
    }
}
