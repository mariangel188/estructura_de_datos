/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combinado;


public class NodoLista extends Persona {

    float[] notas;
    NodoLista sig;

    public NodoLista(int id, String nombre, char sexo, float[] notas) {
        super(id, nombre, sexo);
        this.notas = notas;
        this.sig = null;
    }

    public float getPromedio() {
        float sum = 0;
        for (float i : notas) {
            sum += i;
        }
        return sum / notas.length;

    }
}
