package paquete;

import java.util.ArrayList;
import java.util.List;

public class B_Ciclos {

  public static void main(String[] args){

    // Ciclo While
    int x = 10;
    while(x > 0){
      System.out.println("Ciclo while iteracion " + x);
      x--; // x++ suma un digito a la variable, x-- resta un digito a la variable.
    }

    // Ciclo Fori
    for (int i = 0; i < 10; i++) {
      System.out.println("Ciclo fori iteracion: " + i);
    }


    // Ciclo Foreach
    List<String> lstString = new ArrayList<>();
    lstString.add("hola");
    lstString.add("mundo");
    lstString.add("saludos");
    lstString.add("java");

    for (String s : lstString) {
      System.out.println("Ciclo foreach iteracion: " + s);
    }
  }
}
