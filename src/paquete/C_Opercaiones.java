package paquete;

import java.util.Scanner;

public class C_Opercaiones {

  public static void main(String[] args){
    int x;
    int y;

    Scanner leer = new Scanner(System.in);
    System.out.print("Introduzca el valor de X: ");
    x = leer.nextInt();

    System.out.print("Introduzca el valor de y: ");
    y = leer.nextInt();

    int suma = x + y;
    int resta = x - y;
    int multiplicacion = x * y;
    int division = x / y;
    int modulo = x % y;
    /* *
     * El modulo es el restante que falta para llegar al entero
     * Ej: 10/3 -> 3*3 = 9 es lo que mas se acerca.
     * el modulo (%) seria lo que le falta a ese 9 para llegar a 10
     * % = 1
     * */

    System.out.println("x + y = " + suma);
    System.out.println("x - y = " + resta);
    System.out.println("x * y = " + multiplicacion);
    System.out.println("x / y = " + division);
    System.out.println("x % y = " + modulo);


  }
}
