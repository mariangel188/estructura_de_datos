/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Arreglos;

/**
 *
 * @author Usuario PC
 */
public class Arreglos {

     public static void main(String[] args) {
        int opc, num = 0, lim,encontrado = 0;
        int ev = 0;

        Metodos_Arreglos obj = new Metodos_Arreglos();
        System.out.println("Ingrese el limite del arreglo ");
        lim = obj.entrada.nextInt();
        int[] arreglo = new int[lim];
        //elementos validos
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    ev = obj.llenarArray(arreglo);

                    break;
                case 2:
                    obj.presentar(arreglo, ev);
                case 3:
                    ev = obj.insertarUltimo(arreglo, ev);
                case 4:
                    obj.insertarInicio(arreglo, ev);
                case 5:
                    ev = obj.insertarInicio(arreglo, ev);
                case 6:
                    ev = obj.ordenarArreglo(arreglo, ev);
                case 7:
                    System.out.println("INGRESAR EL NUMERO A BUSCAR");
                    num = obj.entrada.nextInt();
                        encontrado= obj.encontrarbinaria(arreglo, ev, lim, num);
                        if(encontrado != -1){
                            System.out.println("Esta en posicion" + encontrado);
                        }else 
                            System.out.println("Elemento no existe");
         
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 0);
    }
}
