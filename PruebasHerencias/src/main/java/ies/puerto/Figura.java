package ies.puerto;

public abstract class Figura {
    private float base;
    private float altura;
    private float profundidad;

    public Figura (){

    }

    public Figura(float base, float altura){
        this.altura = altura;
        this.base = base;
    }

    public Figura(float base, float altura, float profundidad){
        this.base = base;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }

    public abstract float calcularArea();

    @Override
    public String toString(){
        return "Base: "+base+", Altura: "+altura+", Profundidad: "+profundidad;
    }

}