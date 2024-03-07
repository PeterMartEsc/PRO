package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.utilidades.UtilidadesClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends UtilidadesClass {
    String path = "src/main/resources/data.csv";

    public List<Persona> obtenerPersonas(){

       List<Persona> personas = new ArrayList<>();
       int contador = 0;

       //TODO:
       // Verificar que el fichero existe
       // Leer el fichero
       // Transformar linea a Persona
       // Añiadir a la lista

       try (BufferedReader br = new BufferedReader(new FileReader(path))) {
           String linea;
           while ((linea = br.readLine()) != null) {
               if(contador>0){
                   String[] datos = linea.split(DELIMITADOR);
                   int id = Integer.parseInt(datos[0]);
                   String nombre = datos[1];
                   int edad = Integer.parseInt(datos[2]);
                   String email = datos[3];
                   Persona persona = new Persona(id, nombre, edad, email);
                   personas.add(persona);
               }
               contador++;
            }
       }catch (IOException e) {
           e.printStackTrace();
       } finally {

       }

       return personas;
    }

    public Persona obtenerPersona(Persona persona){

        List<Persona> personas = new ArrayList<>();
        int contador = 0;
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {
                if(contador>0){
                    String[] datos = linea.split(DELIMITADOR);
                    int id = Integer.parseInt(datos[0]);
                    if(id == persona.getId()){
                        String nombre = datos[1];
                        int edad = Integer.parseInt(datos[2]);
                        String email = datos[3];
                        persona.setNombre(nombre);
                        persona.setEdad(edad);
                        persona.setEmail(email);
                        encontrado = true;
                    }
                }
                contador++;
            }
        }catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

        return persona;
    }

    public void aniadirPersona(Persona persona){

        //Verificar si existe la persona
        //Si no existe, se añade

        Persona personaBuscar = new Persona(persona.getId());
        personaBuscar = obtenerPersona(personaBuscar);
        if(personaBuscar.getEmail() == null){
            //append quiere decir si añade texto (true) o lo sustituye (false)
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(persona.toCsv() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void eliminarPersona(int id) {
        List<Persona> personas = obtenerPersonas();
        try (FileWriter writer = new FileWriter(path)) {
            writer.write("id,nombre,edad,email\n");
            for (Persona persona : personas) {
                if (persona.getId() != id) {
                    writer.write(persona.getId() + "," + persona.getNombre() + "," + persona.getEdad() + "," + persona.getEmail() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
