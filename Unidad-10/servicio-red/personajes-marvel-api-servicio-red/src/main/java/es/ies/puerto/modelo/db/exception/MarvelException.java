package es.ies.puerto.modelo.db.exception;

public class MarvelException extends Exception{

    public MarvelException(String message) {
        super(message);
    }

    public MarvelException(String message, Throwable tipo) {
        super(message,tipo);
    }
}
