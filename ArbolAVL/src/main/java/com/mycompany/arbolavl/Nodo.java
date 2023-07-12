/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolavl;


public class Nodo {

    int dato;
    int fe;
    Nodo izq;
    Nodo der;

    public Nodo(int _dato) {
        this.dato = _dato;
        this.fe = 0;
        this.izq = null;
        this.der = null;
    }
}
