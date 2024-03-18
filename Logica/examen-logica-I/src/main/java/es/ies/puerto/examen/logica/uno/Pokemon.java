package es.ies.puerto.examen.logica.uno;

import java.util.HashMap;
import java.util.Map;

public class Pokemon {

    Map<String, Map<String, Double>> efectividad = new HashMap<>();

    public Pokemon() {
        efectividad = new HashMap<>();
        efectividad.put("Agua", new HashMap<>());
        efectividad.get("Agua").put("Agua", 0.5);
        efectividad.get("Agua").put("Fuego", 2.0);
        efectividad.get("Agua").put("Planta", 0.5);
        efectividad.get("Agua").put("Eléctrico", 1.0);

        efectividad.put("Fuego", new HashMap<>());
        efectividad.get("Fuego").put("Agua", 2.0);
        efectividad.get("Fuego").put("Fuego", 0.5);
        efectividad.get("Fuego").put("Planta", 0.5);
        efectividad.get("Fuego").put("Eléctrico", 1.0);

        efectividad.put("Planta", new HashMap<>());
        efectividad.get("Planta").put("Agua", 0.5);
        efectividad.get("Planta").put("Fuego", 2.0);
        efectividad.get("Planta").put("Planta", 0.5);
        efectividad.get("Planta").put("Eléctrico", 1.0);

        efectividad.put("Eléctrico", new HashMap<>());
        efectividad.get("Eléctrico").put("Agua", 1.0);
        efectividad.get("Eléctrico").put("Fuego", 1.0);
        efectividad.get("Eléctrico").put("Planta", 1.0);
        efectividad.get("Eléctrico").put("Eléctrico", 0.5);
    }

    float danio(String tipoAtacante, String tipoDefensor, int ataque, int defensa) {
        if (ataque > 100) {
            return -1f;
        }
        if (defensa > 100) {
            return -2f;
        }
        double efectividad = obtenerEfectividad(tipoAtacante, tipoDefensor);
        return (float) (50 * (ataque / (float)defensa) * efectividad);
    }

    private double obtenerEfectividad(String tipoAtacante, String tipoDefensor) {
        if (efectividad.containsKey(tipoAtacante) && efectividad.get(tipoAtacante).containsKey(tipoDefensor)) {
            return efectividad.get(tipoAtacante).get(tipoDefensor);
        } else {
            // Si no hay datos de efectividad, se considera efectividad neutral (1.0)
            return 1.0;
        }
    }
}
