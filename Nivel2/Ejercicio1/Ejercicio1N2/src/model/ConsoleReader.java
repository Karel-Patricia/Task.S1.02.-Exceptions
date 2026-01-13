package model;

import exceptions.ExceptionBoolean;
import exceptions.ExceptionChar;
import exceptions.ExceptionString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        byte byteNumber = 0;

        while (true) {
            try {
                System.out.println(message);
                byteNumber = sc.nextByte();
                sc.nextLine();
                return byteNumber;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Vuelve a intentarlo");
                sc.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        int intNumber = 0;

        while (true) {
            try {
                System.out.println(message);
                intNumber = sc.nextInt();
                sc.nextLine();
                return intNumber;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Vuelve a intentarlo");
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        float floatNumber = 0f;

        while (true) {
            try {
                System.out.println(message);
                floatNumber = sc.nextFloat();
                sc.nextLine();
                return floatNumber;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Vuelve a intentarlo");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        double doubleNumber = 0;

        while (true) {
            try {
                System.out.println(message);
                doubleNumber = sc.nextDouble();
                sc.nextLine();
                return doubleNumber;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Vuelve a intentarlo");
                sc.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        char charP = ' ';

        while (true) {
            try {
                System.out.println(message);
                String input = sc.next();

                if (input.isBlank() || input.length() != 1) {
                    throw new ExceptionChar("Error de formato. Ingresa un único carácter.");
                }
                sc.nextLine();
                return input.charAt(0);

            } catch (ExceptionChar e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }


    public static String readString(String message) {
        String stringWord = "";

        while (true) {
            try {
                System.out.println(message);
                stringWord = sc.nextLine();

                if (stringWord.isBlank()) {
                    throw new ExceptionString("Error de formato. La cadena no puede estar vacia");
                }
                return stringWord;
            } catch (ExceptionString e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        String input = "";

        while (true) {
            try {
                System.out.println(message);
                input = sc.nextLine().trim();

                if (input.equals("s")) {
                    return true;
                } else if (input.equals("n")) {
                    return true;
                } else {
                    throw new ExceptionBoolean("Error de formato. Vuelve a intentarlo.");
                }

            } catch (ExceptionBoolean e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
