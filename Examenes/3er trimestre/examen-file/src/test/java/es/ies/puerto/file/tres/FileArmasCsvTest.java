package es.ies.puerto.file.tres;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

public class FileArmasCsvTest {


    FileArmasCsv persistencia;

    List<Arma> armas;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FileArmasCsv();
        armas = persistencia.obtenerArmas();
    }

    @Test
    public void obtenerArmasTest() {
        Assertions.assertFalse(armas.isEmpty(),
                MESSAGE_ERROR);
        Assertions.assertEquals(5, armas.size(),
                MESSAGE_ERROR);
    }

    @Test
    public void obtenerArmaTest() {
        String idBuscar = "MJ002";
        Arma ArmaBuscar = new Arma(idBuscar);
        ArmaBuscar = persistencia.obtenerArma(ArmaBuscar);
        Assertions.assertEquals(ArmaBuscar.getId(),idBuscar,
                MESSAGE_ERROR);
        Assertions.assertNotNull(ArmaBuscar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertTrue (ArmaBuscar.getOrigen().equals("Asgard"),
                MESSAGE_ERROR);
        Assertions.assertNotNull(ArmaBuscar.getOrigen().equals("Asgard"),
                MESSAGE_ERROR);
    }

    @Test
    public void addDeleteArmaTest() {

        int numArmasInicial = armas.size();
        Arma ArmaInsertar = new Arma("GRA001", "Gracia del Sol", "Gracia que estuvo en posesión de Mael y Escanor", "Liones", 1000);

        persistencia.addArma(ArmaInsertar);
        armas = persistencia.obtenerArmas();
        int numArmasInsertar = armas.size();
        Assertions.assertTrue(armas.contains(ArmaInsertar),
                MESSAGE_ERROR);
        Assertions.assertEquals(numArmasInicial +1 ,
                numArmasInsertar, MESSAGE_ERROR);
        persistencia.deleteArma(ArmaInsertar);
        armas = persistencia.obtenerArmas();
        int numArmasBorrado = armas.size();
        Assertions.assertEquals(numArmasInicial ,
                numArmasBorrado,
                MESSAGE_ERROR);
    }

    @Test
    public void actualizarArma() {
        String idActualizar = "MM004";
        Arma ArmaBuscar = new Arma(idActualizar);
        Arma ArmaActualizar = persistencia.obtenerArma(ArmaBuscar);
        Arma ArmaBackup = persistencia.obtenerArma(ArmaBuscar);
        ArmaActualizar.setNombre("Murasame");
        ArmaActualizar.setDescripcion("Reliquia de la asesina Akame. La oja está empapada en veneno, por lo que un corte significa la muerte");
        persistencia.updateArma(ArmaActualizar);

        ArmaBuscar = persistencia.obtenerArma(ArmaBuscar);
        Assertions.assertEquals(ArmaBuscar.toString(), ArmaActualizar.toString(),
                MESSAGE_ERROR);
        persistencia.updateArma(ArmaBackup);

    }


}
