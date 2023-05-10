/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecutor;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opc, num = 0, lim = 0, encontrado = 0;
        int ev = 0;

        System.out.println("Tamaño del aula ");
        lim = entrada.nextInt();
        Metodos_arreglos aula = new Metodos_arreglos(lim);

        do {
            opc = aula.menu();
            switch (opc) {
                case 1:
                    aula.insertar();
                    break;
                case 2:
                    aula.presentar();
                    break;
                default:
                    break;
            }
        } while (opc != 0);
    }
}
