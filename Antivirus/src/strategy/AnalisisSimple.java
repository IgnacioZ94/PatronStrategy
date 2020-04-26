package strategy;

public abstract class AnalisisSimple implements IStrategy {

    @Override
    public void analizar() {
        iniciar();
        saltarZip();
        detener();
    }

    abstract void iniciar();

    abstract void saltarZip();

    abstract void detener();
}
