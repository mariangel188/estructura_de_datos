/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilasycolas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class PilasyColas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int lim, op;
        System.out.println("Tamano de la pila");
        lim = entrada.nextInt();
        Metodos pila = new Metodos (lim);
        do {
            op = pila.menu();
            switch(op){
                case 1 -> pila.Push();
                case 2 -> pila.Pop();
            }
        } while (op != 0);
    }
}
