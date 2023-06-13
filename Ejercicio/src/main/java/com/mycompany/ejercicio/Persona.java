/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

public class Persona {
    int Id;
    String nombre;
    char sexo;
    
    public Persona(int Id, String nombre, char sexo){
        this.Id = Id;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    
}
