package es.ies.puerto.exception;

public class MyException extends Exception{
    public MyException(String message, Throwable type){
        super(message, type);
    }
}