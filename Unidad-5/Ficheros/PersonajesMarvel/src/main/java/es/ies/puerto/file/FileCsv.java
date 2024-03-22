package es.ies.puerto.file;

import es.ies.puerto.impl.SuperHeroe;
import es.ies.puerto.interfaces.ICrudOperations;
import es.ies.puerto.utilities.UtilidadesClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends UtilidadesClass implements ICrudOperations {

    List<SuperHeroe> superHeroes;
    String path="src/main/resources/data.csv";


    public List<SuperHeroe> obtenerSuperHeroes() {

        List<SuperHeroe> superHeroes = new ArrayList<>();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                if (contador > 0) {
                    String[] datos = linea.split(DELIMITADOR);
                    String nombre = datos[0];
                    String alias = datos[1];
                    String genero = datos[2];
                    List<String> poderes = new ArrayList<>();
                    for(int i = 3; i < datos.length ; i++){
                        datos[i] = datos[i].replaceAll("\"", "").trim();
                        poderes.add(datos[i]);
                    }
                    SuperHeroe superHeroe = new SuperHeroe(alias, nombre, genero, poderes);
                    superHeroes.add(superHeroe);
                }
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return superHeroes;
    }

    @Override
    public SuperHeroe obtenerSuperHeroe(SuperHeroe superHeroe) {

        int contador = 0;
        boolean encontrado = false;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {

                if (contador > 0) {
                    String[] datos = linea.split(DELIMITADOR);
                    String alias = datos[1];

                    if (alias == superHeroe.getAlias()) {
                        String nombre = datos[0];
                        String genero = datos[2];
                        superHeroe.setNombre(nombre);
                        superHeroe.setGenero(genero);
                        List<String> poderes = new ArrayList<>();
                        for(int i = 3; i < datos.length ; i++){
                            poderes.add(datos[i]);
                        }
                        superHeroe.setPoderes(poderes);
                        encontrado = true;
                    }
                }
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return superHeroe;

    }

    @Override
    public void addHeroe(SuperHeroe superHeroe) {
        SuperHeroe heroeBuscar = new SuperHeroe(superHeroe.getAlias());
        heroeBuscar = obtenerSuperHeroe(heroeBuscar);

        if (heroeBuscar.getPoderes() == null) {

            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(superHeroe.toCsv()+ "\n");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteHeroe(SuperHeroe superHeroe) {
        SuperHeroe heroeBuscar = new SuperHeroe(superHeroe.getAlias());
        List<SuperHeroe> superHeroes = obtenerSuperHeroes();

        try (FileWriter writer = new FileWriter(path)) {
            for (SuperHeroe heroeFile : superHeroes) {
                if (!heroeFile.equals(superHeroe)) {
                    writer.write(heroeFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateHeroe(SuperHeroe superHeroe) {
        List<SuperHeroe> personas = obtenerSuperHeroes();
        try (FileWriter writer = new FileWriter(path)) {
            for (SuperHeroe heroeFile : personas) {
                if (heroeFile.equals(superHeroe)) {
                    writer.write(superHeroe.toCsv() + "\n");
                } else {
                    writer.write(heroeFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
