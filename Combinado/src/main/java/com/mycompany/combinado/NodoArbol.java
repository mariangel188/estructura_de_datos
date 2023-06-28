/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combinado;

/**
 *
 * @author SALA H
 */
public class NodoArbol extends Persona{
    float prom;
    NodoArbol izq;
    NodoArbol der;
    
    public NodoArbol(int id, String nombre, char sexo, float prom){
        super(id, nombre, sexo);
        this.prom = prom;
        this.der = null;
        this.izq = null;
    }
}
