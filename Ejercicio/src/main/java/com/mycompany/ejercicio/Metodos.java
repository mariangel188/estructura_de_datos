/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

import java.util.Scanner;

class Metodos {

    Nodo head;
    Scanner entrada;
    
    public Metodos(Nodo head, Scanner entrada) {
        this.head = null;
        this.entrada = new Scanner(System.in);
    }

    

    public int menu() {
        System.out.println("Insertar        [1]:");
        System.out.println("Eliminar        [2]:");
        System.out.println("Reporte varones [3]:");
        System.out.println("Reporte damas   [4]:");
        System.out.println("Listar          [5]:");
        System.out.println("Salir           [0]:");
        return entrada.nextInt();
    }
    
    public boolean listaVacia(){
        return (head == null);
    }
    
    public Nodo leerDatos(){
        int id;
        String nombre;
        char sexo;
        float[] calif = new float[3];
        System.out.println("Ingrese Id: ");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrsee sexo: ");
        sexo = entrada.nextLine().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la calificacion" + i + " : ");
            calif[i] = entrada.nextFloat();
        }
        Nodo nuevo = new Nodo(Id, nombre, sexo, calif);
        return nuevo;
    }
    
    public void insertar(){
        Nodo nuevo = leerDatos();
        if(listaVacia()){
            head = nuevo;
        } else {
            if(nuevo.Id < head.Id){
                nuevo.sig = head;
                head = nuevo;
            } else{
                Nodo actual = head;
                while(actual.sig != null && nuevo.Id > actual.sig.Id){
                    actual = actual.sig;
                    nuevo.sig = actual.sig;
                    actual.sig = nuevo;
                }
            }
        }
    }
}
