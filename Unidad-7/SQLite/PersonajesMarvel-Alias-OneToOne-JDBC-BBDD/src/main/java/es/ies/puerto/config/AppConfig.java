package es.ies.puerto.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlDb;

    public String getUrlDb() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(fis);
            urlDb = properties.getProperty("urlDb");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.urlDb;
    }
}
