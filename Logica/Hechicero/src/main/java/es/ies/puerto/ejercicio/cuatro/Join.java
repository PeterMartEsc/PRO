package es.ies.puerto.ejercicio.cuatro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Join {
    List<Map<String, Object>> tabla1;
    List<Map<String, Object>> tabla2;
    public Join() {
        tabla1 = new ArrayList<>();
        tabla2 = new ArrayList<>();

        Map<String, Object> fila1 = new HashMap<>();
        fila1.put("id", 1);
        fila1.put("nombre", "Juan");
        tabla1.add(fila1);

        Map<String, Object> fila2 = new HashMap<>();
        fila2.put("id", 2);
        fila2.put("nombre", "María");
        tabla1.add(fila2);

        Map<String, Object> fila3 = new HashMap<>();
        fila3.put("id", 1);
        fila3.put("producto", "Camisa");
        tabla2.add(fila3);

        Map<String, Object> fila4 = new HashMap<>();
        fila4.put("id", 3);
        fila4.put("producto", "Zapatos");
        tabla2.add(fila4);
    }

    Map<Integer, List<Object>> innerJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        return null;
    }

    Map<Integer, List<Object>> leftJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        return null;

    }

    Map<Integer, List<Object>> rightJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        return null;
    }

    Map<Integer, List<Object>> fullJoin(Map<Integer, String> tabla1, Map<Integer, Integer> tabla2){
        return null;
    }
}
