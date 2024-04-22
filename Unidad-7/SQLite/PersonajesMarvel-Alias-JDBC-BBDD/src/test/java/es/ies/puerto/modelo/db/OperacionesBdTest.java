package es.ies.puerto.modelo.db;

import es.ies.puerto.exeption.SuperheroeException;
import es.ies.puerto.modelo.Poder;
import es.ies.puerto.modelo.Superheroe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperacionesBdTest {

    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/superheroes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Superheroe superheroe;
    Poder poder;

    @BeforeEach
    public void beforeEach(){
        operacionesBd = new OperacionesBd(urlBd);
        poder = new Poder("7", "Cuchillos Lunares");
        superheroe = new Superheroe("3", "Moonknight", "Mark Spector", "Masculino", Set.of(poder));
    }
    @Test
    public void obtenerPersonajesAllTest(){
        try {
            Set<Superheroe> lista = operacionesBd.obtenerSuperheroes();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (SuperheroeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPoderesAllTest(){
        Superheroe superheroe = new Superheroe("1");
        try {
            Set<Poder> lista = operacionesBd.obtenerPoderes(superheroe);
            Assertions.assertEquals(3, lista.size(), MESSAGE_ERROR);
        } catch (SuperheroeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerSuperheroeTest(){

        Superheroe superheroe = new Superheroe("1");

        try {

            superheroe = operacionesBd.obtenerSuperheroe(superheroe);
            Assertions.assertNotNull(superheroe, MESSAGE_ERROR);
            Assertions.assertNotNull(superheroe.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(superheroe.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(superheroe.getAlias(), MESSAGE_ERROR);
            Assertions.assertNotNull(superheroe.getGenero(), MESSAGE_ERROR);

        } catch (SuperheroeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void aniadirSuperheroeTest(){

        try {
            int numeroSuperheroes = operacionesBd.obtenerSuperheroes().size();
            operacionesBd.aniadirHeroe(superheroe);
            Superheroe superheroeObtenido = operacionesBd.obtenerSuperheroe(superheroe);
            Assertions.assertEquals(superheroe, superheroeObtenido, MESSAGE_ERROR);
            operacionesBd.borrarHeroe(superheroe);
            int numeroSuperheroesFinal = operacionesBd.obtenerSuperheroes().size();
            Assertions.assertEquals(numeroSuperheroes, numeroSuperheroesFinal, MESSAGE_ERROR);

        } catch (SuperheroeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarSuperheroeTest(){
        String nombreUpdate = "Black Widow";
        String aliasUpdate = "Natasha Romanoff";
        String generoUpdate = "Femenino";
        Poder poder1 = new Poder("7","Armas tecnológicas");
        Set<Poder> poderes = Set.of(poder1);

        try {
            operacionesBd.aniadirHeroe(superheroe);
            superheroe.setNombre(nombreUpdate);
            superheroe.setAlias(aliasUpdate);
            superheroe.setGenero(generoUpdate);
            superheroe.setPoderes(poderes);

            operacionesBd.actualizarHeroe(superheroe);

            Superheroe superheroeEncontrado = operacionesBd.obtenerSuperheroe(superheroe);
            Assertions.assertEquals(superheroe,superheroeEncontrado,MESSAGE_ERROR);
            Assertions.assertEquals(superheroe.getNombre(),superheroeEncontrado.getNombre(),MESSAGE_ERROR);
            Assertions.assertEquals(superheroe.getAlias(),superheroeEncontrado.getAlias(),MESSAGE_ERROR);
            Assertions.assertEquals(superheroe.getGenero(),superheroeEncontrado.getGenero(),MESSAGE_ERROR);
            Assertions.assertEquals(superheroe.getPoderes(),superheroeEncontrado.getPoderes(),MESSAGE_ERROR);
            operacionesBd.borrarHeroe(superheroe);

        } catch (Exception exception) {
            Assertions.fail(MESSAGE_ERROR+":"+exception.getMessage());
        }
    }
}
