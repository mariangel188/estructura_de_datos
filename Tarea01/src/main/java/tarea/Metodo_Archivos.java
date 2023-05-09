/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tarea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Metodo_Archivos {

    Scanner entrada;
    File archivos = new File("Archivo.txt");
    int cont;

    public Metodo_Archivos(int cont) {
        this.entrada = new Scanner(System.in);
        this.cont = cont;

    }

    Metodo_Archivos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int menu() {
        System.out.println("1.Escribir un archivo");
        System.out.println("2.Leer desde un archivo");
        System.out.println("3.Salir");

        return entrada.nextInt();
    }

    public void ingresarDatos() {
        FileWriter escribir;
        PrintWriter linea;
        String nombre = "";
        String correoElectronico = "";
        String direccion = "";
        if (!archivos.exists()) {
            try {
                archivos.createNewFile();
            } catch (Exception e) {
            }
            try {
                entrada.nextLine();
                System.out.println("Ingrese un nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el correo electronico: ");
                correoElectronico = entrada.nextLine();
                System.out.println("Ingrese la direccion: ");
                direccion = entrada.nextLine();
                escribir = new FileWriter(archivos, true);
                linea = new PrintWriter(escribir);
                linea.println(nombre + "\n" + correoElectronico + "\n" + direccion + "\n");
                linea.close();

            } catch (Exception e) {
            }
        }
    }

    public void presentarDatos() {
        FileReader leer = null;
        BufferedReader almacenamiento = null;
        String cadena = "";
        String nombre = "";
        String correoElectronico = "";
        String direccion = "";
        try {
            leer = new FileReader(archivos);
            almacenamiento = new BufferedReader(leer);
        } catch (Exception e) {
        }
        while (cadena != null) {
            try {
                cadena = almacenamiento.readLine();
                nombre = cadena;
                cadena = almacenamiento.readLine();
                correoElectronico = cadena;
                cadena = almacenamiento.readLine();
                direccion = cadena;
                if (cadena != null) {
                    System.out.println("Nombre: " + nombre + "\n Correo electronico"
                            + correoElectronico + "\n Direccion: " + direccion);
                }
                almacenamiento.close();
                leer.close();
            } catch (Exception e) {
            }
        }
    }
}
