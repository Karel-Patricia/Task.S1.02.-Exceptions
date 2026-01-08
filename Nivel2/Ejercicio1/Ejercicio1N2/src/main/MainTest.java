package main;

import model.ConsoleReader;

public class MainTest {
    static void main(String[] args) {
        byte age = ConsoleReader.readByte("Introduce tu edad:");
        System.out.println("Edad: " + age);

        int number = ConsoleReader.readInt("Introduce un número entero:");
        System.out.println("Número entero: " + number);

        float price = ConsoleReader.readFloat("Introduce un precio (float):");
        System.out.println("Precio: " + price);

        double salary = ConsoleReader.readDouble("Introduce tu salario:");
        System.out.println("Salario: " + salary);

        char initial = ConsoleReader.readChar("Introduce tu inicial:");
        System.out.println("Inicial: " + initial);

        String name = ConsoleReader.readString("Introduce tu nombre:");
        System.out.println("Nombre: " + name);

        boolean confirmed = ConsoleReader.readYesNo("¿Deseas continuar? (s/n)");
        System.out.println("Confirmación: " + confirmed);

    }

}
