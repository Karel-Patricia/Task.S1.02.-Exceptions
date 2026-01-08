package model;

import exceptions.ExceptionBoolean;
import exceptions.ExceptionChar;
import exceptions.ExceptionString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static final Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                value = sc.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Vuelve a intentarlo");
                sc.nextLine();
            }
        }
        return value;
    }

    public static int readInt(String message) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                value = sc.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Vuelve a intentarlo");
                sc.nextLine();
            }
        }
        return value;
    }

    public static float readFloat(String message) {
        float value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                value = sc.nextFloat();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Vuelve a intentarlo");
                sc.nextLine();
            }
        }
        return value;
    }

    public static double readDouble(String message) {
        double value = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                value = sc.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Vuelve a intentarlo");
                sc.nextLine();
            }
        }
        return value;
    }

    public static char readChar(String message) {
        char result = ' ';
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                String input = sc.nextLine();

                if (input.length() != 1) {
                    throw new ExceptionChar("Debe introducir un único carácter");
                }
                result = input.charAt(0);
                valid = true;
            } catch (ExceptionChar e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public static String readString(String message) {
        String input = "";
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = sc.nextLine();

                if (input.isBlank()) {
                    throw new ExceptionString("La cadena no puede estar vacia");
                }
                valid = true;
            } catch (ExceptionString e) {
                System.out.println(e.getMessage());
            }
        }
        return input;
    }

    public static boolean readYesNo(String message) {
        String input = "";
        boolean valid = false;
        boolean result = false;

        while (!valid) {
            try {
                System.out.println(message);
                input = sc.nextLine().trim();

                if (input.equals("s")) {
                    result = true;
                    valid = true;
                } else if (input.equals("n")) {
                    result = false;
                    valid = true;
                } else {
                    throw new ExceptionBoolean("Respuesta inválida. Introduce 's' o 'n'.");
                }

            } catch (ExceptionBoolean e) {
                System.out.println(e.getMessage());
            }
        }

        return result;
    }

}
