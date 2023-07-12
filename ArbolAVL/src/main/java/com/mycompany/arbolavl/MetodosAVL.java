/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolavl;

import java.util.Scanner;


public class MetodosAVL {

    Nodo raiz;
    Scanner entrada;
    boolean h;
    int cont = 0;

    public MetodosAVL() {
        this.raiz = null;
        this.entrada = new Scanner(System.in);
        this.h = false;
    }

    public int menu() {
        System.out.println("<<OPERACIONES AVL>>");
        System.out.println("Insertar [1]");
        System.out.println("Recorer [2]");
        System.out.println("Eliminar [3]");
        System.out.println("Salir [0]");
        return entrada.nextInt();
    }

    public Nodo rotarII(Nodo actual, Nodo nodoX) {
        actual.izq = nodoX.der;
        nodoX.der = actual;

        actual.fe = 0;
        nodoX.fe = 0;

        return nodoX;
    }

    public Nodo rotarDD(Nodo actual, Nodo nodoX) {
        actual.der = nodoX.izq;
        nodoX.izq = actual;

        actual.fe = 0;
        nodoX.fe = 0;

        return nodoX;
    }
    
    public Nodo rotarID(Nodo actual, Nodo nodoX){
        Nodo  aux = nodoX.der;
        actual.izq = aux.der;
        nodoX.der = aux.izq;
        aux.izq = nodoX;
        aux.der = actual;
        
        return aux;
    }
    
    public Nodo rotarDI(Nodo actual, Nodo nodoX){
        Nodo  aux = nodoX.der;
        actual.izq = aux.der;
        nodoX.der = aux.izq;
        aux.izq = nodoX;
        aux.der = actual;
        actual.fe = 0;
        nodoX.fe = 0;
        return aux;
    }

    public Nodo insertarAVL(int num, Nodo actual) {
        if (actual == null) {
            Nodo nuevo = new Nodo(num);
            System.out.println((++cont));
            h = true;
            return nuevo;
        } else if (num < actual.dato) {
            cont++;
            actual.izq = insertarAVL(num, actual.izq);            
            if (h) {
                switch (actual.fe) {
                    case -1 -> {
                        Nodo nodoX = actual.izq;
                        if (nodoX.fe == -1) {
                            actual = rotarII(actual, nodoX);
                        } else {
                            actual = rotarID(actual, nodoX);
                        }
                    }
                    case 0 ->
                        actual.fe = -1;
                    case 1 -> {
                        actual.fe = 0;
                        h = false;
                    }
                }
            }
        } else if (num > actual.dato) {
            cont++;
            actual.der = insertarAVL(num, actual.der);
            if (h) {
                switch (actual.fe) {
                    case -1 -> {
                        Nodo nodoX = actual.der;
                        if (nodoX.fe == 1) {
                            actual = rotarDD(actual , nodoX);
                        } else {
                            actual = rotarDI(actual, nodoX);
                        }
                    }
                    case 0 ->
                        actual.fe = 1;
                    case 1 -> {

                    }
                }
            }
        } else {
            System.out.println("No se aceptan repetidos...");
        }
        return actual;
    }
    
    public void inOrden(Nodo actual){
        if (actual != null) {
            inOrden(actual.izq);
            System.out.println(actual.dato + " ->" + actual.fe);
            inOrden(actual.der);
        }
    }
    
    public void preOrden(Nodo actual){
        if (actual != null) {
            System.out.println(actual.dato + " ->" + actual.fe);
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }
}
