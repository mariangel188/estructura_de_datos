/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/* 5. Una empresa tiene diez almacenes y desea un programa que lea sus ventas trimestrales y
calcule:
a. La media de las ventas mensuales para cada uno de sus almacenes
b. Obtener un listado de los almacenes cuyas ventas mensuales son superiores a la media
total (índice del almacén)
c. Muestre cuál de los meses ha sido el más productivo y cuál el menos productivo*/
public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numAl = 10;
        int numM = 3;

        double[][] venta = new double[numAl][numM];
        double[] ventasMe = new double[numAl];

        for (int i = 0; i < numAl; i++) {
            System.out.println("Ingrese las ventas trimestrales para el almacén: " + (i + 1));
            for (int j = 0; j < numM; j++) {
                System.out.println("Mes " + (j + 1) + ": ");
                venta[i][j] = entrada.nextDouble();
                ventasMe[i] += venta[i][j];
            }
        }

        double[] mediaVentaMe = new double[numAl];
        double sumaTVentaMe = 0;
        for (int i = 0; i < numAl; i++) {
            mediaVentaMe[i] = ventasMe[i] / numM;
            sumaTVentaMe += mediaVentaMe[i];
        }

        double mediaTVentaMe = sumaTVentaMe / numAl;

        for (int i = 0; i < numAl; i++) {
            System.out.println("La media de las ventas mensuales para cada almacén " + (i + 1) + ": " + mediaVentaMe[i]);
        }

        for (int i = 0; i < numAl; i++) {
            if (mediaVentaMe[i] > mediaTVentaMe) {
                System.out.println("Los almacenes cuyas ventas mensuales son superiores a la media total:  " + (i + 1));
            }
        }

        double maxV = Double.MIN_VALUE;
        double minV = Double.MAX_VALUE;
        int mesMaxP = -1;
        int mesMinP = -1;

        for (int j = 0; j < numM; j++) {
            double ventasMes = 0;
            for (int i = 0; i < numAl; i++) {
                ventasMes += venta[i][j];
            }
            if (ventasMes > maxV) {
                maxV = ventasMes;
                mesMaxP = j;
            }
            if (ventasMes < minV) {
                minV = ventasMes;
                mesMinP = j;
            }
        }

        System.out.println("El mes más productivo es: " + (mesMaxP + 1) + " y el mes menos productivo es: " + (mesMinP + 1));
    }
}
