/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema14;

public class ArbolB {

    Nodo raiz;

    public ArbolB() {
        this.raiz = null;
    }

    public void insertar(int da) {
        raiz = insertarRe(raiz, da);
    }

    public Nodo insertarRe(Nodo n, int dato) {
        if (n == null) {
            return new Nodo(dato);
        }
        if (dato < n.dato) {
            n.izq = insertarRe(n.izq, dato);
        } else if (dato > n.dato) {
            n.der = insertarRe(n.der, dato);
        }
        return n;
    }

    public int calcular() {
        return calcularA(raiz);
    }

    public int calcularA(Nodo n) {
        if (n == null) {
            return 0;
        }
        int alturaI = calcularA(n.izq);
        int alturaD = calcularA(n.der);

        return Math.max(alturaI, alturaD) + 1;
    }
}
