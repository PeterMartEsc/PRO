package ies.puerto;

public class Triangulo extends Figura{

    public Triangulo(){}

    public Triangulo(float base, float altura){
        super(base, altura);
    }

    @Override
    public float calcularArea(){
        return (getBase()*getAltura())/2;
    }

    @Override
    public String toString(){
        return "Base: "+getBase()+", Altura: "+getAltura();
    }
}
