/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

public class archivos {
    public static void main(String[] args) {
        Metodo_Archivos obj = new Metodo_Archivos();
        int opcion;
        do {            
            opcion = obj.menu();
            switch (opcion) {
                case 1: obj.ingresarDatos();
                case 2: obj.presentarDatos();
                
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion!=0);
    }
}
