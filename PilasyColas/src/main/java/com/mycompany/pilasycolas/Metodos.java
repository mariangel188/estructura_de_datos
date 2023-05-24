/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilasycolas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {
    Scanner entrada;
    int[] myPila;
    int tope;
    
    public Metodos (int lim){
        this.entrada = new Scanner(System.in);
        this.myPila = new int[lim];
        this.tope = -1;
    }
    
    public int menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("Push  [1]:");
        System.out.println("Pop   [2]:");
        System.out.println("Salir [3]: ");
        return entrada.nextInt();
    }
    
    public boolean pilaLlena(){
        if(tope == myPila.length -1){
            return true;
        } else {
            return false;
        }
          
    }
    
    public boolean pilaVacia(){
        if(tope == -1)
            return true;
        else
            return false;
    }
    
    public void Push(){
        if(!pilaLlena()){
            System.out.println("Ingrese elementos: ");
            tope ++;
            myPila[tope]= entrada.nextInt();
        } else {
            System.out.println("Pila llena");
        }
    }
    
    public void Pop(){
        if(!pilaVacia()){
            System.out.println(myPila[tope]);
            tope ++;
        }else{
            System.out.println("Pila vacia");
        }
                
    }
    
}
