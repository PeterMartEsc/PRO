package es.ies.puerto.logica;

public class Palindromo {
    public boolean palindromoTradicional(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        int inicio = 0;
        int fin = cadena.length() - 1;
        while (inicio < fin) {
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }

    public boolean palindromoRecursivo(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        int poscionInicio = 0;
        int posicionFin = cadena.length()-1;
        if (poscionInicio>=posicionFin) {
            return true;
        }
        Character cInicio = cadena.charAt(poscionInicio);
        Character cFin = cadena.charAt(posicionFin);

        if (!cInicio.equals(cFin)){
            return false;
        }
        return palindromoRecursivo(cadena.substring(poscionInicio+1,posicionFin));
    }

}
