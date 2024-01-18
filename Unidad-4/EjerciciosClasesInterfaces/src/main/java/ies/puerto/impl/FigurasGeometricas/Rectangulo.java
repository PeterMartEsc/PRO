package ies.puerto.impl.FigurasGeometricas;

import ies.puerto.abstrac.FigurasGeometricas.RegularesAbstract;
import ies.puerto.interfaz.FigurasGeometricas.IFormaGeometrica;

public class Rectangulo extends RegularesAbstract implements IFormaGeometrica {
    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return getBase()*getAltura();
    }
}
