/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio;

public class EnlazadaCompleto {

    public static void main(String[] args) {
        int op;
        Metodos myLista = new Metodos();
        do {
            op = myLista.menu();
            switch(op){
                case 1 -> myLista.insertar();
                case 2 -> myLista.eliminar();
                case 3 -> myLista.reporte("h");
                case 4 -> myLista.reporte("m");
                case 5 -> myLista.listar();
                default -> {}
            }
        } while (op != 0);
    }
}
