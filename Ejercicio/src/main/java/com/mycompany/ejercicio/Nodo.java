/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

public class Nodo extends Persona {

    private float[] calif;
    Nodo sig;
    
    public Nodo(int id, String nombre, char sexo, float[] calif, Nodo sig) {
        super(id, nombre, sexo);
        this.calif = calif;
        this.sig = sig;
    }

    public float[] getCalif() {
        return calif;
    }

    public void setCalif(float[] calif) {
        this.calif = calif;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public float getProm() {
        float suma = 0;
        for(float nota : calif){
            suma += nota;
        }
        suma= suma/calif.length;
        return suma;
    }
}
