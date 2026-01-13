package exceptions;

public class EmptySaleException extends Exception{

    public EmptySaleException(){

        super("Para hacer una venta primero debes añadir productos");
    }
}
