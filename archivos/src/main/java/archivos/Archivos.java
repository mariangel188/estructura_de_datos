/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package archivos;

/**
 *
 * @author Usuario PC
 */
public class Archivos {

    public static void main(String[] args) {

        metodo_archivos obj = new metodo_archivos();
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
