package es.ies.puerto.exeption;

public class SuperheroeException extends Exception {

    public  SuperheroeException(String message){
        super(message);
    }

    public  SuperheroeException(String message, Throwable tipo){
        super(message, tipo);
    }

}
