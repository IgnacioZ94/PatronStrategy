package strategy;
//Se crea una clase llamada Contexto, usada para abstraer la utilizacion del algoritmo como una estrategia cambiable 
public class Contexto {

    //Variable de la interfaz strategy
    private IStrategy estrategia;

    //En el metodo constructor podemos recibir por parametro cualquier implementacion de la interfaz strategy 
    public Contexto(IStrategy estrategia) {
        this.estrategia = estrategia;
    }

    //Una vez con la clase Conntexto instanciada, solo queda usar este metodo "ejectuar" para usar el metodo "analizar" sea cual sea la implementacion recibida por parametros
    public void ejecutar() {

        this.estrategia.analizar();
    }
}
