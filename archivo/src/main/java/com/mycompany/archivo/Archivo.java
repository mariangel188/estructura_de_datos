/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.archivo;

/**
 *
 * @author Usuario PC
 */
public class Archivo {

    public static void main(String[] args) {

        metodo_archivo obj = new metodo_archivo();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.ingresar();
                case 2:
                    obj.presentar();

                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 0);
    }
}
