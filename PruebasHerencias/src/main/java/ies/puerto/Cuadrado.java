package ies.puerto;

public class Cuadrado extends Figura {

    public Cuadrado(){}

    public Cuadrado(float lado){
        super(lado, lado);
    }

    @Override
    public float calcularArea(){
        return getBase()*getAltura();
    }

    @Override
    public String toString(){
        return "base: "+getBase()+", altura: "+getAltura();
    }

}
