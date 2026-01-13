package main;

import model.ConsoleReader;

public class MainTest {
    static void main(String[] args) {

        byte byteInput = ConsoleReader.readByte("Introduce un numero dentro del rango tipo byte:");
        System.out.println("Correcto: El numero " + byteInput + " es de tipo byte\n");

        int intInput = ConsoleReader.readInt("Introduce un número entero:");
        System.out.println("Correcto: El numero " + intInput + " es de tipo entero\n");

        float floatInput = ConsoleReader.readFloat("Introduce un numero de tipo float:");
        System.out.println("Correcto: El numero " + floatInput + " es de tipo float\n");

        double doubleInput = ConsoleReader.readDouble("Introduce un numero de tipo double:");
        System.out.println("Correcto: El numero " + doubleInput + " es de tipo double\n");

        char charInput = ConsoleReader.readChar("Introduce un caracter:");
        System.out.println("Correcto: El caracter " +  charInput + " es válido.");

        String stringInput = ConsoleReader.readString("Introduce una palabra:");
        System.out.println("La palabra: " + stringInput + " es una cadena valida.");

        boolean confirmed = ConsoleReader.readYesNo("¿Deseas continuar? (s/n).");
        System.out.println("Confirmación: " + confirmed);

    }

}
