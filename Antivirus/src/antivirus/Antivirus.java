package antivirus;

import strategy.AntivirusSimple;
import strategy.AntivirusAvanzado;
import strategy.Contexto;

public class Antivirus {

    public static void main(String[] args) {
        //Creacion de la instancia de Contexto y se le pasa una implementacion por parametro
        Contexto contexto = new Contexto(new AntivirusSimple());
        contexto.ejecutar();

        /*Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();*/
    }

}
