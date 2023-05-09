/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Usuario PC
 */
public class ejercicio {

    public static void main(String[] args) {
        Cadenas objeto = new Cadenas();
        int opcion;

        do {
            opcion = objeto.menu();
            switch (opcion) {
                case 1:
                    objeto.caracterxcaracter();

                    break;
                case 2:
                    objeto.contari();
                    break;
                case 3:
                    objeto.palindromo();
                    break;
                case 4:
                    objeto.contarvl();
                    break;

                default:
                    throw new AssertionError();
            }
        } while (opcion != 0);
    }

}
