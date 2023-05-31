/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/* 4. Cada alumno de una clase de 20 estudiantes tiene notas correspondientes a 5 asignaturas
diferentes, pudiendo no tener calificación en alguna asignatura. A cada asignatura le
corresponde un determinado coeficiente. Escribir un programa que permita:
a. Calcular la media de cada alumno
b. Media general de la clase
c. Media de la clase en cada asignatura
d. Porcentaje de faltas (no presentado a examen)*/
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numA = 2;
        int numAs = 5;

        double[][] notas = new double[numA][numAs];
        double[] co = {0.23, 0.2, 0.9, 0.15, 0.3};

        for (int i = 0; i < numA; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + " : ");
            for (int j = 0; j < numAs; j++) {
                System.out.println("La asignatura " + (j + 1) + " : ");
                notas[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < numA; i++) {
            double suma = 0;
            for (int j = 0; j < numAs; j++) {
                suma += notas[i][j] * co[j];
            }
            double media = suma / numAs;
            System.out.println("La media del alumno " + (i + 1) + " es: " + media);
        }

        double sGeneral = 0;
        for (int i = 0; i < numA; i++) {
            double suma = 0;
            for (int j = 0; j < numAs; j++) {
                suma += notas[i][j] * co[j];
            }
            sGeneral += suma;
        }

        double mGeneral = sGeneral / (numA * numAs);
        System.out.println("La media general de la clase es: " + mGeneral);

        for (int j = 0; j < numAs; j++) {
            double suma = 0;
            for (int i = 0; i < numA; i++) {
                suma += notas[i][j] * co[j];
            }

            double media = suma / numA;
            System.out.println("La media de la clase en la asignatura " + (j + 1) + " es: " + media);
        }

        int numF = 0;
        for (int i = 0; i < numA; i++) {
            boolean falta = true;
            for (int j = 0; j < numAs; j++) {
                if (notas[i][j] != 0) {
                    falta = false;
                    break;
                }
            }
            if (falta) {
                numF++;
            }
        }

        double poFaltas = (double) numF / numA * 100;
        System.out.println("El porcentaje de faltas es: " + poFaltas + "%");
    }
}
