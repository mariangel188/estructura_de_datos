/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.abb;

/**
 *
 * @author Usuario
 */
public class Abb {

    public static void main(String[] args) {
        System.out.println("Problema de arboles binarios de busqueda");
        int op;
        MetodosABB myArbol = new MetodosABB();
        do {
            op = myArbol.menu();
            switch (op) {
                case 1 -> {
                    System.out.println("Valor a insertar");
                    int num = myArbol.entrada.nextInt();
                    myArbol.raiz = myArbol.insertar(num, myArbol.raiz);
                }
                case 2 -> {
                    myArbol.preOrden(myArbol.raiz);
                    myArbol.inOrden(myArbol.raiz);
                    myArbol.posOrden(myArbol.raiz);
                }
                
                case 3 -> {
                    System.out.println("Valor a eliminar");
                    int num = myArbol.entrada.nextInt();
                    myArbol.raiz = myArbol.eliminar(num, myArbol.raiz);
                }
            }
        } while (op != 0);
    }
}
