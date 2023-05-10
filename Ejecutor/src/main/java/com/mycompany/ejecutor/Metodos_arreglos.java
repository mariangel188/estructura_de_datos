/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutor;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
class Metodos_arreglos {
    Scanner entrada;
    Persona[] aula;
    int ev = 0;

    public Metodos_arreglos(int lim) {
        this.entrada = new Scanner(System.in);
        this.aula = new Persona[lim];
    }

    public int menu() {
        System.out.println("1. Ingresar persona ");
        System.out.println("2. Presentar ");
        System.out.println("3. Salir");

        return entrada.nextInt();
    }

    public Persona leerPersona() {
        int id;
        String nom, dir;
        Persona nuevo;
        System.out.println("Ingresar id");
        id = entrada.nextInt();
        System.out.println("Ingresar nombre");
        nom = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingresar direccion");
        dir = entrada.nextLine();
        nuevo = new Persona(id, nom, dir);

        return nuevo;
    }

    public void insertar() {
        if (ev < aula.length) {
            aula[ev] = leerPersona();
            ev++;
        }
        System.out.println("No se puede agregar mas datos");
    }
    public void presentarPersona(int pos){
        System.out.println("ID:  "+aula[pos].id);
        System.out.println("Nombre:  "+ aula[pos].nombre);
        System.out.println("Direccion: "+ aula[pos].dir);
    
    }
    public void presentar(){
        for (int i = 0; i < ev; i++) {
            presentarPersona(i);
        }
    }
}
