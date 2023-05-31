/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosunidimensionales;

import static arreglosunidimensionales.Ejercicio10.presentarMenu;
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
public class Ejercicio101 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] plaza = new int[101];
        int op;
        
        do {
            presentarMenu();
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    Ejercicio10.hacerReserva(plaza);
                    break;
                case 2:
                    Ejercicio10.anularReserva(plaza);
                    break;
                case 3:
                    Ejercicio10.verEstado(plaza);
                    break;
            }
            
        } while (op != 3);
    }
    
}
