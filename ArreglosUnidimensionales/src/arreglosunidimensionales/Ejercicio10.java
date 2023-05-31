/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import java.util.Scanner;

/*10. Se desea realizar un programa que permita controlar las reservas de plazas de un vuelo 
Quito‐Loja, de acuerdo con las siguientes normas de la compañía aérea. 
a. Número de plazas del avión: 100. 
b. Plazas numeradas del 1 al 30: fumadores. 
c. Plazas numeradas del 31 al 100: no fumadores. 
Se desea realizar la reserva a petición del pasajero y cerrar la reserva cuando no haya 
plazas libres o el avión esté próximo a despegar. Como ampliación de este algoritmo, 
considere la opción de anulaciones imprevistas de reservas. 
(Considere la utilización de un menú por pantalla para representar cada uno de los 
estados)*/
public class Ejercicio10 {

    public static void presentarMenu() {
        System.out.println("\nEscoja una opción: ");
        System.out.println("1. Hacer reserva ");
        System.out.println("2. Anular reserva ");
        System.out.println("3. Ver estado de la plaza\n");
    }

    public static void hacerReserva(int[] pla) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la plaza que se desea reservar: ");
        int numP = entrada.nextInt();
        if (numP >= 1 && numP <= 100) {
            if (pla[numP] == 0) {
                pla[numP] = 1;
                System.out.println("Su reserva se realizo con mucho éxito");
            } else {
                System.out.println("Esa plaza ya se encuentra reservada");
            }
        }
    }

    public static void anularReserva(int[] pl) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la plaza que desea anular:");
        int numPl = entrada.nextInt();

        if (numPl >= 1 && numPl <= 100) {

            if (pl[numPl] == 1) {
                pl[numPl] = 0;
                System.out.println("Su reserva se anuló con éxito");
            } else {
                System.out.println("Esa plaza no se encuentra reservada");
            }
        }
    }

    public static void verEstado(int[] plazas) {
        String e;
        for (int i = 0; i <= 100; i++) {
            if (plazas[i] == 1) {
                e = "Reservado";
            } else {
                e = "Disponible";
            }
            System.out.println("Plaza: " + i + " " + e);
        }
    }

}
