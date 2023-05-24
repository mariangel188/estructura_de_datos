/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class MetodosColas {

    Scanner entrada;
    int[] myCola;
    int tope;

    public MetodosColas(int lim) {
        this.entrada = new Scanner(System.in);
        this.myCola = new int[lim];
        this.tope = -1;
    }

    public int menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("Push  [1]:");
        System.out.println("Pop   [2]:");
        System.out.println("Salir [3]: ");
        return entrada.nextInt();
    }

    public boolean colaLlena() {
        if (tope == myCola.length - 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean colaVacia() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void Push() {
        if (!colaLlena()) {
            System.out.println("Ingrese elementos: ");
            tope++;
            myCola[tope] = entrada.nextInt();
        } else {
            System.out.println("Pila llena");
        }
    }

    public void recorreIzq() {
        for (int i = 0; i < tope; i++) {
            myCola[i] = myCola[i + 1];
        }
    }

    public void Pop() {
        if (!colaVacia()) {
            System.out.println(myCola[0]);
            if (tope == 0) {
                recorreIzq();
            }
        } else {
            System.out.println("Cola vacia");
        }
    }
}
