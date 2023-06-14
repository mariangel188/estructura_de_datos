/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pilaenlazada;

public class PilaEnlazada {
    
    public static void main(String[] args) {
        int op;
        Metodos myPila = new Metodos();
        do {
            op = myPila.menu();
            switch(op){
                case 1 -> myPila.push();
                case 2 -> myPila.pop();
                default -> {}
            }
        } while (op != 0);
        
    }
}
