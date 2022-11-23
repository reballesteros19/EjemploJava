package paquete;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_TiposVariables {

  public static void main(String[] args){
    short numeroCorto = 123; // numeros pequeño
    int entero = 456; // numeros normales
    long numeroLargo = 789l; // Numero grande (Se debe poner una l en la declaración)
    BigInteger numeroGrande; // Numeros muy grandes
    float flotanteDecimal = 1.2f; // Numeros con decimales pequeños (Se debe poner una f en la declaración)
    double decimal = 9.5; // numeros con decimales grandes
    BigDecimal decimalGrande; // numeros decimales muy Grandes
    char digito = 'R'; // letra o caracter
    String texto = "Prueba de texto"; // letras, palabras, textos

    // Variables como Objetos
    Short objNumeroCorto = 123;
    Integer objEntero = 456;
    Long objNumeroLargo = 789l;
    Float objFlotanteDecimal = 1.2f;
    Double objDecimal = 9.5;
    Character objDigito = 'R';
    // Se comportan igual que los nativos, pero permiten valores null, y tienen metodos propios para facilitar su gestion


    // sout -> atajo de teclado, se escribe sout y luego (Ctrl + Espacio) y autocompleta el System.out.println();
    System.out.println(""); // con salto de linea al final
    System.out.print(""); // Sin salto de linea al final
    System.out.println("Se puede concatenar texto con +, ejemplo " + texto + " y tambien con variables numericas " + decimal);


    Scanner entrada = new Scanner(System.in); // Variables para lectura desde consola
    entrada.nextInt(); // Lee un int
    entrada.nextLine(); // lee un string
    // Tiene casi de todos los tipos de variables, estos son los mas comunes


    // Listas
    List<String> lstTexto = new ArrayList<>(); // Se declara una lista de textos.
    lstTexto.add("Textos"); // Se añaden valores.
    lstTexto.add("cadenas o palabras");
    // Queda asi: lstNumeros = ["Textos", "Cadenas o palabras"];

    List<Integer> lstNumeros = new ArrayList<>(); // Se delcada una lista de numeros.
    lstNumeros.add(123); // Se añaden los numeros.
    lstNumeros.add(456);
    // Queda asi: lstNumeros = [123, 456];

  }
}
