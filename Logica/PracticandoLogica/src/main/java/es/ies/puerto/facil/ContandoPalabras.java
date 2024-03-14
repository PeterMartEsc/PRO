package es.ies.puerto.facil;

import java.util.regex.*;

public class ContandoPalabras {

    //Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
    //Los signos de puntuación no forman parte de la palabra. <-
    //Una palabra es la misma aunque aparezca en mayúsculas y minúsculas. <- To lower case
    //No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente. <- Oke

    String cadena = "El mundo a cambiado, lo siento en el agua, lo siento en la tierra, lo huelo en el aire. " +
                    "Mucho se perdió entonces, pero nadie vive ahora para recordarlo. " +
                    "Todo comenzó con la forja de los grandes anillos, tres fueron entregados a los elfos, " +
                    "inmortales los mas sabios y honrados de todos los seres, " +
                    "siete a los señores enanos grandes mineros y artesanos de las cavidades montañosas, " +
                    "y nueve, nueve fueron entregados a la raza de los hombres qu ansian por encima de todo el poder. " +
                    "En aquellos anillos residía el poder y la voluntad de gobernar a cada raza, " +
                    "pero todos ellos fueron engañados, pues otro anillo mas fue forjado, en la tierra de mordor, " +
                    "en los fuegos del monte del destino, el señor oscuro sauron forjo en secreto el anillo regente " +
                    "para controlar a todos los demás, en ese anillo descargó toda su crueldad su malicia " +
                    "y su voluntad de dominar todo tipo de vida, un anillo para gobernarlos a todos";

    String cadenaDef = cadena.toLowerCase();
    String DELIMITADOR1 = " ";
    String DELIMITADOR2 = ","+DELIMITADOR1;
    String DELIMITADOR3 = "."+DELIMITADOR1;
    Pattern pattern = Pattern.compile("\\s*^[a-z]+\\s*");
    Matcher matcher = pattern.matcher(cadena);


}
