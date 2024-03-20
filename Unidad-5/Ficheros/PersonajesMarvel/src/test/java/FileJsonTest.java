import es.ies.puerto.file.FileCsv;
import es.ies.puerto.interfaces.ICrudOperations;
import org.junit.jupiter.api.BeforeEach;

public class FileJsonTest{

    //Nombre por conveniencia
    ICrudOperations persistencia;

    @BeforeEach
    public void beforeEach () {
        persistencia = new FileCsv();
    }


}
