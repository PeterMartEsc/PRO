package es.ies.puerto.examen.logica.uno;

import java.util.HashMap;
import java.util.Map;

public class  Pokemon {

    public Pokemon() {

    }

    float danio(String tipoAtacante, String tipoDefensor, int ataque, int defensa) {

        float efectividad = 0f;

        if(ataque > 100){
            return -1;
        }
        if(defensa > 100){
            return -2;
        }

        switch(tipoDefensor){
            case "Agua":
                if(tipoAtacante == tipoDefensor || tipoAtacante == "Planta"){
                    efectividad = 0.5f;
                    break;
                }

                efectividad = 2;
                break;

            case "Fuego":
                if(tipoAtacante == tipoDefensor){
                    efectividad = 0.5f;
                    break;
                }

                efectividad = 2;
                break;

            case "Planta":
                if(tipoAtacante == "Eléctrico"){
                    efectividad =1;
                    break;
                }
                efectividad = 0.5f;
                break;

            case "Eléctrico":
                if(!(tipoAtacante == tipoDefensor)){
                    efectividad = 1f;
                    break;
                }

                efectividad = 0.5f;
                break;
        }

        float valorCombate = 50 * ((float) ataque /defensa) * efectividad;


        return valorCombate;
    }


}
