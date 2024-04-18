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
        superheroe = new Superheroe("3", "Moonknight", "Mark Spector", "Masculino");
        poder = new Poder("7", "Cuchillos Lunares");
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
        try {
            Set<Poder> lista = operacionesBd.obtenerPoderes();
            Assertions.assertEquals(6, lista.size(), MESSAGE_ERROR);
        } catch (SuperheroeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerUsuarioTest(){

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
    public void obtenerPoderTest(){

        Poder poder = new Poder("1");

        try {

            poder = operacionesBd.obtenerPoder(poder);
            Assertions.assertNotNull(poder, MESSAGE_ERROR);
            Assertions.assertNotNull(poder.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(poder.getPoder(), MESSAGE_ERROR);

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
            operacionesBd.borrarHeroe(superheroeObtenido);
            int numeroSuperheroesFinal = operacionesBd.obtenerSuperheroes().size();
            Assertions.assertEquals(numeroSuperheroes, numeroSuperheroesFinal, MESSAGE_ERROR);

        } catch (SuperheroeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void aniadirPoderTest(){

        try {
            int numeroPoderes = operacionesBd.obtenerPoderes().size();
            operacionesBd.aniadirPoder(poder);
            Poder poderObtenido = operacionesBd.obtenerPoder(poder);
            Assertions.assertEquals(poder, poderObtenido, MESSAGE_ERROR);
            operacionesBd.borrarPoder(poderObtenido);
            int numeroPoderesFinal = operacionesBd.obtenerPoderes().size();
            Assertions.assertEquals(numeroPoderes, numeroPoderesFinal, MESSAGE_ERROR);

        } catch (SuperheroeException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarUsuarioTest(){
        String idUpdate = "3";
        String nombreUpdate = "Black Widow";
        String aliasUpdate = "Natasha Romanoff";
        String generoUpdate = "Femenino";

        try {
            operacionesBd.aniadirHeroe(superheroe);
            superheroe.setId(idUpdate);
            superheroe.setNombre(nombreUpdate);
            superheroe.setAlias(aliasUpdate);
            superheroe.setGenero(generoUpdate);

            operacionesBd.actualizarHeroe(superheroe);

            Superheroe superheroeEncontrado = operacionesBd.obtenerSuperheroe(superheroe);
            Assertions.assertEquals(superheroe,superheroeEncontrado,MESSAGE_ERROR);
            Assertions.assertEquals(superheroe.getNombre(),superheroeEncontrado.getNombre(),MESSAGE_ERROR);
            Assertions.assertEquals(superheroe.getAlias(),superheroeEncontrado.getAlias(),MESSAGE_ERROR);
            Assertions.assertEquals(superheroe.getGenero(),superheroeEncontrado.getGenero(),MESSAGE_ERROR);

            operacionesBd.borrarHeroe(superheroeEncontrado);
        } catch (Exception exception) {
            Assertions.fail(MESSAGE_ERROR+":"+exception.getMessage());
        }
    }

    @Test
    public void actualizarPoderTest(){
        String poderUpdate = "Black Widow";

        try {
            operacionesBd.aniadirPoder(poder);
            poder.setPoder(poderUpdate);

            operacionesBd.actualizarPoder(poder);

            Poder poderEncontrado = operacionesBd.obtenerPoder(poder);
            Assertions.assertEquals(poder,poderEncontrado,MESSAGE_ERROR);
            Assertions.assertEquals(poder.getPoder(),poderEncontrado.getPoder(),MESSAGE_ERROR);

            operacionesBd.borrarPoder(poderEncontrado);
        } catch (Exception exception) {
            Assertions.fail(MESSAGE_ERROR+":"+exception.getMessage());
        }
    }
}
