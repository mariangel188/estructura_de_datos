/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio;

public class EnlazadaCompleto {

        public static void main(String[] args) {
        Metodos obj = new Metodos();
        int op;
        do {
            op = obj.menu();
            switch (op) {
                case 1: obj.insertar();
                case 2: obj.eliminar();
                case 3: obj.reporte('h');
                case 4: obj.reporte('m');
                case 5: obj.listar();

            }
        } while (op != 0);
    }
}
