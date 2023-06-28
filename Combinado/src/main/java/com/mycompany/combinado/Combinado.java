/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.combinado;

public class Combinado {

    public static void main(String[] args) {
        int op, num;
        Metodos obj = new Metodos();
        do {
            op = obj.menu();
            switch(op){
                case 1 -> obj.insertarLista();
                case 2 -> obj.recorrerLista();
                case 3 -> obj.crearArboles();
                case 4 -> {
                    obj.inOrden(obj.raizm);
                    System.out.println("");
                }
                case 5 -> {
                    obj.inOrden(obj.raizh);
                    System.out.println("");
                }
                case 6 -> {
                    obj.reporte(obj.raizm);
                    System.out.println("");
                }
                case 7 -> {
                    obj.reporte(obj.raizh);
                    System.out.println("");
                }
                default -> {}
            }
        } while (op != 0);
    }
}
