package es.ies.puerto.model.db.impl;

import es.ies.puerto.model.db.jdbc.impl.ConnectionDb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConnectionDbTest {
    ConnectionDb connectionDb;

    @BeforeEach
    public void beforeEach() {
        connectionDb = new ConnectionDb();
    }

    @Test
    public void connectDb(){
        try {
            connectionDb.getConnection();
        } catch (Exception exception){
            Assertions.fail(exception.getMessage());
        }
    }
}
