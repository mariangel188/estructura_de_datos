/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import com.mycompany.pilasycolas.Metodos;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class colas {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int lim, op;
        System.out.println("Tamano de la cola");
        lim = entrada.nextInt();
        Metodos colas = new Metodos (lim);
        do {
            op = colas.menu();
            switch(op){
                case 1 -> colas.Push();
                case 2 -> colas.Pop();
            }
        } while (op != 0);
    }
}
