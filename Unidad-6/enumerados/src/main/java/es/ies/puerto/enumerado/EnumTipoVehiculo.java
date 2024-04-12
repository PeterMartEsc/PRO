package es.ies.puerto.enumerado;

/**
 * Define un enum llamado ColorArcoiris que incluya los colores del arcoíris
 * (ROJO, NARANJA, AMARILLO, VERDE, AZUL, AÑIL, VIOLETA). Luego, crea un método que tome un color como entrada y
 * devuelva un mensaje indicando si el color es cálido (rojo, naranja, amarillo) o frío (verde, azul, añil, violeta).
 *
 * @author Pedro Martín Escuela
 */
public enum EnumTipoVehiculo {
    COCHE(1),
    CAMION(2),
    BICICLETA(3);

    int tipo;

    EnumTipoVehiculo(int tipo){
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
