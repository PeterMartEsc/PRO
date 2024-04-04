package es.ies.puerto.modelo;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.db.OperacionesBd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperacionesBdTest {

    OperacionesBd operacionesBd;

    String urlBd = "src/main/resources/usuarios.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";

    @BeforeEach
    public void beforeEach(){
        operacionesBd = new OperacionesBd(urlBd);
    }
    @Test
    public void obtenerUsuariosAllTest(){
        try {
            Set<Usuario> lista = operacionesBd.obtenerUsuarios();
            Assertions.assertEquals(10, lista.size(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerUsuarioTest(){

        Usuario usuario = new Usuario("5");

        try {

            usuario = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario, MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(), MESSAGE_ERROR);
            //Nunca va a ser nulo, por ser un int
            Assertions.assertNotNull(usuario.getEdad(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getCiudad(), MESSAGE_ERROR);

        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarUsuarioTest(){

        Usuario usuario = new Usuario("11", "pepe", 20, "mi ciudad");

        try {
            operacionesBd.insertarUsuario(usuario);
            Usuario usuarioObtenido = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioObtenido, MESSAGE_ERROR);

        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

}
