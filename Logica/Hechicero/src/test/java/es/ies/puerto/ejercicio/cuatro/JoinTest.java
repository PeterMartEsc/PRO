package es.ies.puerto.ejercicio.cuatro;

import es.ies.puerto.ejercicio.UtilClassTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JoinTest extends UtilClassTest {
    Join join;
    Map<Integer, String> tabla1;
    Map<Integer, Integer> tabla2;
    Map<Integer, List<Object>> resultadoEsperado;
    Map<Integer, List<Object>> resultadoObtenido;

    @BeforeEach
    public void beforeEach() {
        join = new Join();
        tabla1 = new HashMap<>();
        tabla1.put(1, "Juan");
        tabla1.put(2, "María");
        tabla1.put(3, "Pedro");

        tabla2 = new HashMap<>();
        tabla2.put(1, 30);
        tabla2.put(3, 25);
        tabla2.put(4, 35);
    }

    @Test
    public void innerJoinTest(){
        resultadoEsperado = resultadoJoin();
        resultadoObtenido = join.innerJoin(tabla1,tabla2);
        Assertions.assertEquals(resultadoEsperado,resultadoObtenido,MESSAGE_ERROR);
    }


    @Test
    public void leftJoinTest(){
        resultadoEsperado = resultadoLeftJoin();
        resultadoObtenido = join.leftJoin(tabla1,tabla2);
        Assertions.assertEquals(resultadoEsperado,resultadoObtenido,MESSAGE_ERROR);
    }

    @Test
    public void rightJoinTest(){
        resultadoEsperado = resultadoRightJoin();
        resultadoObtenido = join.rightJoin(tabla1,tabla2);
        Assertions.assertEquals(resultadoEsperado,resultadoObtenido,MESSAGE_ERROR);
    }

    @Test
    public void fullJoinTest(){
        resultadoEsperado = resultadoFullJoin();
        resultadoObtenido = join.fullJoin(tabla1,tabla2);
        Assertions.assertEquals(resultadoEsperado,resultadoObtenido,MESSAGE_ERROR);
    }



    private Map<Integer, List<Object>> resultadoJoin() {
        Map<Integer, List<Object>> resultado = new HashMap<>();
        List<Object> fila1 = new ArrayList<>();
        fila1.add("Juan");
        fila1.add(30);
        List<Object> fila2 = new ArrayList<>();
        fila2.add("Pedro");
        fila2.add(25);
        resultado.put(1, fila1);
        resultado.put(3, fila2);

        return resultado;
    }

    private Map<Integer, List<Object>> resultadoLeftJoin() {
        Map<Integer, List<Object>> resultado = new HashMap<>();
        List<Object> fila1 = new ArrayList<>();
        fila1.add("Juan");
        fila1.add(30);
        List<Object> fila2 = new ArrayList<>();
        fila2.add("María");
        fila2.add(null);
        List<Object> fila3 = new ArrayList<>();
        fila3.add("Pedro");
        fila3.add(25);
        resultado.put(1, fila1);
        resultado.put(2, fila2);
        resultado.put(3, fila3);

        return resultado;
    }

    private Map<Integer, List<Object>> resultadoRightJoin() {
        Map<Integer, List<Object>> resultado = new HashMap<>();
        List<Object> fila1 = new ArrayList<>();
        fila1.add("Juan");
        fila1.add(30);
        List<Object> fila2 = new ArrayList<>();
        fila2.add("Pedro");
        fila2.add(25);
        List<Object> fila3 = new ArrayList<>();
        fila3.add(null);
        fila3.add(35);
        resultado.put(1, fila1);
        resultado.put(3, fila2);
        resultado.put(4, fila3);

        return resultado;
    }

    private Map<Integer, List<Object>> resultadoFullJoin() {
        Map<Integer, List<Object>> resultado = new HashMap<>();

        List<Object> fila1 = new ArrayList<>();
        fila1.add("Juan");
        fila1.add(30);
        List<Object> fila2 = new ArrayList<>();
        fila2.add("María");
        fila2.add(null);
        List<Object> fila3 = new ArrayList<>();
        fila3.add("Pedro");
        fila3.add(25);
        List<Object> fila4 = new ArrayList<>();
        fila4.add(null);
        fila4.add(35);
        resultado.put(1, fila1);
        resultado.put(2, fila2);
        resultado.put(3, fila3);
        resultado.put(4, fila4);

        return resultado;
    }
}
