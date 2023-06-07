/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodos;

/**
 *
 * @author SALA H
 */
public class Ejecutor {
    public static void main(String[] args) {
        int op;
        Metodos obj = new Metodos();
        do {
           op = obj.menu();
           switch(op){
               case 1:
                   obj.insertar();
                   break;
               case 2:
                   obj.recorrer();
                   break;
               case 3:
                   obj.insertarOrden();
                   break;
               case 4:
                   obj.eliminar();
                   
           }
        } while (op != 0);
        
    }
}
