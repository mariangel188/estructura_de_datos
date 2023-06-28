/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combinado;

import java.util.Scanner;

public class Metodos {

    Scanner entrada;

    NodoLista head;
    NodoArbol raizm;
    NodoArbol raizh;

    public Metodos() {
        this.head = null;
        this.raizm = null;
        this.raizh = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Insertar Lista               [1]");
        System.out.println("Recorer Lista                [2]");
        System.out.println("Crear Arboles                [3]");
        System.out.println("Presentar arbol damas        [4]");
        System.out.println("presentar arbol varones      [5]");
        System.out.println("Reporte damas                [6]");
        System.out.println("Reporte varones              [7]");
        System.out.println("Salir                        [0]");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public boolean arbolVacio(NodoArbol actual) {
        return (actual == null);
    }

    public NodoLista leerAlumno() {
        int id;
        String nombre;
        char sexo;
        float[] calif = new float[3];
        NodoLista nuevo;
        System.out.println("Ingrese Id: ");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sexo: ");
        sexo = entrada.nextLine().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la calificacion" + i + " : ");
            calif[i] = entrada.nextFloat();
        }
        nuevo = new NodoLista(id, nombre, sexo, calif);
        return nuevo;
    }

    public void insertarLista() {
        NodoLista nuevo = leerAlumno();
        nuevo.sig = head;
        head = nuevo;
    }

    public void recorrerLista() {
        NodoLista actual = head;
        while (actual != null) {
            System.out.print(actual.id + ":" + actual.nombre + " -> ");
            actual = actual.sig;
        }
        System.out.println(" null");
    }

    public NodoArbol insertar(NodoArbol actual, NodoArbol nuevo) {
        if (arbolVacio(actual)) {
            return nuevo;
        } else if (nuevo.id > actual.id) {
            actual.der = insertar(actual.der, nuevo);
        } else {
            actual.izq = insertar(actual.izq, nuevo);
        }
        return actual;
    }

    public void crearArboles() {
        NodoLista actual = head;
        NodoArbol nuevo;
        while (actual != null) {
            nuevo = new NodoArbol(actual.id, actual.nombre,
                    actual.sexo, actual.getPromedio());
            if (nuevo.sexo == 'm') {
                raizm = insertar(raizm, nuevo);
            } else {
                raizh = insertar(raizh, nuevo);
                actual = actual.sig;
            }
        }
    }

    public void inOrden(NodoArbol actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.print(actual.id + ":" + actual.nombre + " -> ");
            inOrden(actual.der);
        }
    }

    public void reporte(NodoArbol actual) {
        if (actual != null) 
            reporte(actual.izq);      
        if (actual.prom >= 7) 
            System.out.println(actual.id + " : " + actual.nombre + " esta aprobado");
         else 
            System.out.println(actual.id + " : " + actual.nombre + " esta reprobado");
            reporte(actual.der);
        
    }
}
