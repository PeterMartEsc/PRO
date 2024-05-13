package es.ies.puerto.exception;

public class MarvelException extends Exception{

    public MarvelException(String message) {
        super(message);
    }

    public MarvelException(String message, Throwable tipo) {
        super(message,tipo);
    }
}
